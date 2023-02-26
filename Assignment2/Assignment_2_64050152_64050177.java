import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

public class Assignment_2_64050152_64050177 extends JPanel implements Runnable {

    final int aBit = 4;
    final int bitOfBlock = 16;
    final int BlockOfScene = 10;
    final double MAX_RATATION = 45;

    double rotateAngle = 0;
    double roatateSpeed = 200;

    double speed = 300;

    double sceneSpeed = 300;

    double stevePositionX = 300;
    double stevePositionY = 250;

    double bodyWidth = 4 * aBit;
    double bodyHeight = 12 * aBit;

    double legWidth = 4 * aBit;
    double legHeight = 12 * aBit;
    double legPositionY = stevePositionY + (bodyHeight / 2);

    double armWidth = 4 * aBit;
    double armHeight = 12 * aBit;
    double armPositionY = stevePositionY - (bodyHeight / 2);

    double headSide = 8 * aBit;
    double headPositionY = stevePositionY - (bodyHeight / 2) - (headSide / 2);

    double scene1PositionX = 0;
    double scene2PositionX = -640;

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
        g2.setColor(Color.WHITE);
        g2.fillRect(0, 0, 600, 600);

        g2.rotate(Math.toRadians(rotateAngle), stevePositionX, legPositionY);
        drawBlock(g2, (int) (stevePositionX - (legWidth / 2)), (int) legPositionY, BlockCodeColor.rightLegColorCode);
        g2.rotate(-Math.toRadians(rotateAngle), stevePositionX, legPositionY);

        g2.rotate(-Math.toRadians(rotateAngle), stevePositionX, armPositionY);
        drawBlock(g2, (int) (stevePositionX - (legWidth / 2)), (int) armPositionY, BlockCodeColor.rightArmColorCode);
        g2.rotate(Math.toRadians(rotateAngle), stevePositionX, armPositionY);

        drawBlock(g2, (int) (stevePositionX - (bodyWidth / 2)), (int) (stevePositionY - (bodyHeight / 2)),
                BlockCodeColor.bodyColorCode);

        drawBlock(g2, (int) (stevePositionX - (headSide / 2)), (int) (headPositionY - (headSide / 2)),
                BlockCodeColor.headColorCode);

        g2.rotate(-Math.toRadians(rotateAngle), stevePositionX, legPositionY);
        drawBlock(g2, (int) (stevePositionX - (legWidth / 2)), (int) legPositionY, BlockCodeColor.leftLegColorCode);
        g2.rotate(Math.toRadians(rotateAngle), stevePositionX, legPositionY);

        g2.rotate(Math.toRadians(rotateAngle), stevePositionX, armPositionY);
        drawBlock(g2, (int) (stevePositionX - (legWidth / 2)), (int) armPositionY, BlockCodeColor.leftArmColorCode);
        g2.rotate(-Math.toRadians(rotateAngle), stevePositionX, armPositionY);

        String[][][][] Scene1 = {
            {null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null},
            {null, null, null, null, null, null, null, null, null, null},
            {BlockCodeColor.grassColorCode, BlockCodeColor.grassColorCode, BlockCodeColor.grassColorCode, BlockCodeColor.grassColorCode, BlockCodeColor.grassColorCode, BlockCodeColor.grassColorCode, BlockCodeColor.grassColorCode, BlockCodeColor.grassColorCode, BlockCodeColor.grassColorCode, BlockCodeColor.grassColorCode},
            {BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode},
            {BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode},
            {BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode},
            {BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode, BlockCodeColor.dirtColorCode}
        };

        drawScene(g2, (int)scene1PositionX, 0, Scene1);
        drawScene(g2, (int)scene2PositionX, 0, Scene1);

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

            if (rotateAngle >= MAX_RATATION) {
                rotateAngle = MAX_RATATION;
                roatateSpeed = -roatateSpeed;
            } else if (rotateAngle <= -MAX_RATATION) {
                rotateAngle = -MAX_RATATION;
                roatateSpeed = -roatateSpeed;
            }

            if (scene1PositionX >= 600) {
                scene1PositionX = -640;
            }
            if (scene2PositionX >= 600) {
                scene2PositionX = -640;
            }
            repaint();
        }
    }

    public void drawBlock(Graphics2D g2, int x, int y, String colorCode[][]) {

        for (int i = 0, dy = y; i < colorCode.length; i++, dy += aBit) {
            for (int j = 0, dx = x; j < colorCode[0].length; j++, dx += aBit) {
                g2.setColor(Color.decode(colorCode[i][j]));
                g2.fillRect(dx, dy, aBit, aBit);
            }
        }
    }

    public void drawScene(Graphics2D g2, int x, int y, String[][][][] blockCodeColors) {

        for (int i = 0, dy = y; i < blockCodeColors.length; i++, dy += bitOfBlock * aBit) {
            for (int j = 0, dx = x; j < blockCodeColors[0].length; j++, dx += bitOfBlock * aBit) {
                if (blockCodeColors[i][j] != null) {
                    drawBlock(g2, dx, dy, blockCodeColors[i][j]);
                }
            }
        }
    }
}
