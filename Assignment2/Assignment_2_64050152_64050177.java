import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;

import java.awt.*;

public class Assignment_2_64050152_64050177 extends JPanel implements Runnable {

    final static int screenWidth = 600;
    final static int screenHeight = 600;

    final int aBit = 4;
    final int bitOfBlock = 16;
    final int BlockOfScene = 10;
    final double MAX_RATATION = 60;

    final int steveHeight = 32 * aBit;
    final int steveWidth = 8 * aBit;

    double rotateAngle = 0;
    double roatateSpeed = 500;

    double speed = 300;
    double sceneSpeed = 0;

    double scene1PositionX = 0;
    double scene2PositionX = -640;

    double stevePositionx = screenWidth;
    double stevePositionY = (10 - Scenes.stayBlock[0]) * bitOfBlock * aBit - (steveHeight);

    boolean jump = false;
    boolean down = false;
    boolean end = false;
    boolean startScene = false;

    int scene1cureent = 0;
    int scene2cureent = 1;

    int backScene1cureent = 0;
    int backScene2cureent = 1;

    public static void main(String[] args) {
        JFrame f = new JFrame();
        Assignment_2_64050152_64050177 m = new Assignment_2_64050152_64050177();

        f.add(m);
        f.setTitle("Assignment 2");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);

        (new Thread(m)).start();
    }

    @Override
    public void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        g2.setColor(Color.decode("#6caaff"));
        g2.fillRect(0, 0, 600, 600);

        drawBackScene(g2, (int) scene1PositionX, 0, Scenes.scenesBack[scene1cureent]);
        drawBackScene(g2, (int) scene2PositionX, 0, Scenes.scenesBack[scene2cureent]);
        drawScene(g2, (int) scene1PositionX, 0, Scenes.scenes[scene1cureent]);
        drawScene(g2, (int) scene2PositionX, 0, Scenes.scenes[scene2cureent]);
        drawCharacter(g2, (int) stevePositionx, (int) stevePositionY);
    }

    @Override
    public void run() {

        double lastTime = System.currentTimeMillis();
        double currentTime, elapsedTime;
        while (true) {
            currentTime = System.currentTimeMillis();
            elapsedTime = currentTime - lastTime;
            lastTime = currentTime;

            rotateAngle += roatateSpeed * elapsedTime / 1000.0;

            scene1PositionX += sceneSpeed * elapsedTime / 1000.0;
            scene2PositionX += sceneSpeed * elapsedTime / 1000.0;

            stevePositionx -= speed * elapsedTime / 1000.0;

            if (stevePositionx <= screenWidth / 2 && startScene == false) {
                speed = 0;
                sceneSpeed = 300;
                stevePositionx = screenWidth / 2;
                startScene = true;
            }

            if (rotateAngle >= MAX_RATATION) {
                rotateAngle = MAX_RATATION;
                roatateSpeed = -roatateSpeed;
            } else if (rotateAngle <= -MAX_RATATION) {
                rotateAngle = -MAX_RATATION;
                roatateSpeed = -roatateSpeed;
            }

            if (scene1PositionX >= stevePositionx && Scenes.stayBlock[scene1cureent] != -1
                    && Scenes.stayBlock[scene1cureent + 1] != -1) {
                System.out.println(scene1cureent);
                if (Scenes.stayBlock[scene1cureent] < Scenes.stayBlock[scene2cureent]) {
                    jump();
                } else if (Scenes.stayBlock[scene1cureent] > Scenes.stayBlock[scene2cureent]) {
                    down();
                }
                Scenes.stayBlock[scene1cureent] = -1;
            }

            if (scene2PositionX >= stevePositionx && Scenes.stayBlock[scene2cureent] != -1
                    && Scenes.stayBlock[scene2cureent + 1] != -1) {
                System.out.println(scene2cureent);
                if (Scenes.stayBlock[scene2cureent] < Scenes.stayBlock[scene1cureent]) {
                    jump();
                } else if (Scenes.stayBlock[scene2cureent] > Scenes.stayBlock[scene1cureent]) {
                    down();
                }
                Scenes.stayBlock[scene2cureent] = -1;
            }

            if (scene1PositionX >= 640) {
                scene1PositionX = -640;
                scene1cureent += 2;
            }

            if (scene2PositionX >= 640) {
                scene2PositionX = -640;
                scene2cureent += 2;
            }

            if (scene2cureent >= Scenes.scenes.length - 1 || scene1cureent >= Scenes.scenes.length - 1) {
                sceneSpeed = 0;
                speed = 300;
            }

            repaint();
        }
    }

    public void jump() {
        stevePositionY -= bitOfBlock * aBit;
    }

    public void down() {
        stevePositionY += bitOfBlock * aBit;
    }

    public void drawBlock(Graphics2D g2, int x, int y, String colorCode[][]) {

        for (int i = 0, dy = y; i < colorCode.length; i++, dy += aBit) {
            for (int j = 0, dx = x; j < colorCode[0].length; j++, dx += aBit) {
                g2.setColor(Color.decode(colorCode[i][j]));
                g2.fillRect(dx, dy, aBit, aBit);
            }
        }
    }

    public void drawCharacter(Graphics2D g2, int x, int y) {

        final double bodyWidth = 4 * aBit;
        final double bodyHeight = 12 * aBit;

        final double headSide = 8 * aBit;

        double headPositionY = y;
        double bodyPositionY = y + headSide;
        double legPositionY = y + headSide + bodyHeight;
        double armPositionY = y + headSide;

        double headPositionX = x;
        double bodyPositionX = x + ((headSide - bodyWidth) / 2);
        double legPositionX = x + ((headSide - bodyWidth) / 2);
        double armPositionX = x + ((headSide - bodyWidth) / 2);

        double rotatePositionX = x + (headSide / 2);

        double armRotatePositionY = y + headSide;
        double legRotatePositionY = y + headSide + bodyHeight;

        // right arm
        g2.rotate(Math.toRadians(rotateAngle), rotatePositionX, armRotatePositionY);
        drawBlock(g2, (int) armPositionX, (int) armPositionY, Block.rightArmColorCode);
        g2.rotate(-Math.toRadians(rotateAngle), rotatePositionX, armRotatePositionY);

        // right leg
        g2.rotate(-Math.toRadians(rotateAngle), rotatePositionX, legRotatePositionY);
        drawBlock(g2, (int) legPositionX, (int) legPositionY, Block.rightLegColorCode);
        g2.rotate(Math.toRadians(rotateAngle), rotatePositionX, legRotatePositionY);

        // body
        drawBlock(g2, (int) bodyPositionX, (int) bodyPositionY, Block.bodyColorCode);

        // head
        drawBlock(g2, (int) headPositionX, (int) headPositionY, Block.headColorCode);

        // left arm
        g2.rotate(-Math.toRadians(rotateAngle), rotatePositionX, armPositionY);
        drawBlock(g2, (int) armPositionX, (int) armPositionY, Block.leftArmColorCode);
        g2.rotate(Math.toRadians(rotateAngle), rotatePositionX, armPositionY);

        // left leg
        g2.rotate(Math.toRadians(rotateAngle), rotatePositionX, legPositionY);
        drawBlock(g2, (int) legPositionX, (int) legPositionY, Block.leftLegColorCode);
        g2.rotate(-Math.toRadians(rotateAngle), rotatePositionX, legPositionY);
    }

    public void drawScene(Graphics2D g2, int x, int y, String[][][][] blockCodeColors) {
        if (blockCodeColors == null) {
            return;
        }
        for (int i = 0, dy = y; i < blockCodeColors.length; i++, dy += bitOfBlock * aBit) {
            for (int j = 0, dx = x; j < blockCodeColors[0].length; j++, dx += bitOfBlock * aBit) {
                if (blockCodeColors[i][j] != null) {
                    drawBlock(g2, dx, dy, blockCodeColors[i][j]);
                }
            }
        }
    }

    public void drawBackScene(Graphics2D g2, int x, int y, String[][][][] blockCodeColors) {
        if (blockCodeColors == null) {
            return;
        }
        BufferedImage bf = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D gDark = bf.createGraphics();
        gDark.setColor(new Color(0, 0, 0, 64));
        for (int i = 0, dy = y; i < blockCodeColors.length; i++, dy += bitOfBlock * aBit) {
            for (int j = 0, dx = x; j < blockCodeColors[0].length; j++, dx += bitOfBlock * aBit) {
                if (blockCodeColors[i][j] != null) {
                    drawBlock(g2, dx, dy, blockCodeColors[i][j]);
                    gDark.fillRect(dx, dy, (aBit * bitOfBlock), (aBit * bitOfBlock));
                }
            }
        }
        g2.drawImage(bf, 0, 0, null);
    }
}
