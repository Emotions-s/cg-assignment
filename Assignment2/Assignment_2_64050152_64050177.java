import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.image.BufferedImage;
import java.util.LinkedList;
import java.util.Queue;

import java.awt.*;

public class Assignment_2_64050152_64050177 extends JPanel implements Runnable {

    final static int screenWidth = 600;
    final static int screenHeight = 600;

    final int BIT = 4;
    final int BIT_OF_BLOCK = 16;
    final int BLOCK_OF_SCENE = 10;

    final double STEVE_MAX_RATATION = 60;
    final double PIG_MAX_RATATION = 40;
    final double SHEEP_MAX_RATATION = 40;
    final double COW_MAX_RATATION = 40;
    final double CHICKEN_MAX_RATATION = 30;

    final int STEVE_HEIGHT = 32 * BIT;
    final int STEVE_WIDTH = 8 * BIT;

    final int COW_HEIGHT = 28 * BIT;

    final int PIG_HEIGHT = 16 * BIT;

    final int CHICKEN_HEIGHT = 13 * BIT;
    final int SHEEP_HEIGHT = 20 * BIT;

    double systemTime = 0;

    double steveRotateAngle = 0;
    double steveRotateSpeed = 200;

    double cowRotateAngle = 0;
    double cowRotateSpeed = 120;

    double chickenRotateAngle = 0;
    double chickenRotateSpeed = 200;

    double sheepRotateAngle = 0;
    double sheepRotateSpeed = 200;

    double pigRotateAngle = 0;
    double pigRotateSpeed = 200;

    double speed = 300;
    double sceneSpeed = 0;

    double scene1PositionX = 0;
    double scene2PositionX = -640;

    double stevePositionX = screenWidth;
    double stevePositionY = (10 - Scenes.stayBlock[0]) * BIT_OF_BLOCK * BIT - (STEVE_HEIGHT);

    double cowPositionx = 50;
    double cowPositionY = (10 - Scenes.stayBlock[0]) * BIT_OF_BLOCK * BIT - (COW_HEIGHT);

    double chickenPositionX = 150;
    double chickenPositionY = (10 - Scenes.stayBlock[0]) * BIT_OF_BLOCK * BIT - (CHICKEN_HEIGHT);

    double pigPositionX = 250;
    double pigPositionY = (10 - Scenes.stayBlock[0]) * BIT_OF_BLOCK * BIT - (PIG_HEIGHT);

    double sheepPositionX = 350;
    double sheepPositionY = (10 - Scenes.stayBlock[0]) * BIT_OF_BLOCK * BIT - (SHEEP_HEIGHT);

    double sunPositionX = 50;
    double sunPositionY = 80;
    double sunVelocityX = 0;
    double sunVelocityY = 0;
    double sunSpeed = 20;
    double sunAngle = 10;

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

        g.drawImage(midpointCircle(g,(int) sunPositionX,(int) sunPositionY, 30), 0, 0, null);
        drawBackScene(g2, (int) scene1PositionX, 0, Scenes.scenesBack[scene1cureent]);
        drawBackScene(g2, (int) scene2PositionX, 0, Scenes.scenesBack[scene2cureent]);
        drawScene(g2, (int) scene1PositionX, 0, Scenes.scenes[scene1cureent]);
        drawScene(g2, (int) scene2PositionX, 0, Scenes.scenes[scene2cureent]);
        drawCharacter(g2, (int) stevePositionX, (int) stevePositionY);
        drawchicken(g2, (int) chickenPositionX, (int) chickenPositionY);
        drawCow(g2, (int) cowPositionx, (int)cowPositionY);
        drawPig(g2, (int) pigPositionX, (int) pigPositionY);
        drawSheep(g2, (int) sheepPositionX, (int) sheepPositionY);

    }

    @Override
    public void run() {

        double lastTime = System.currentTimeMillis();
        double currentTime, elapsedTime;

        sunVelocityX = sunSpeed * Math.cos(Math.toRadians(sunAngle));
        sunVelocityY = (sunSpeed-5) * Math.sin(Math.toRadians(sunAngle));

        while (true) {
            currentTime = System.currentTimeMillis();
            elapsedTime = currentTime - lastTime;
            lastTime = currentTime;
            systemTime += elapsedTime;

            if(systemTime > 1000) {
                if(sunPositionX <= 300){
                    sunPositionY -= elapsedTime / 1000.0 * sunVelocityY;
                }
                else {
                    sunPositionY += elapsedTime / 1000.0 * sunVelocityY;
                }

                if(sunPositionX < 600){
                    sunPositionX += elapsedTime / 1000.0 * sunVelocityX;
                }
            }
            

            steveRotateAngle += steveRotateSpeed * elapsedTime / 1000.0;
            cowRotateAngle += cowRotateSpeed * elapsedTime / 1000.0;
            pigRotateAngle += pigRotateSpeed * elapsedTime / 1000.0;
            chickenRotateAngle += chickenRotateSpeed * elapsedTime / 1000.0;
            sheepRotateAngle += sheepRotateSpeed * elapsedTime / 1000.0;

            scene1PositionX += sceneSpeed * elapsedTime / 1000.0;
            scene2PositionX += sceneSpeed * elapsedTime / 1000.0;

            stevePositionX -= speed * elapsedTime / 1000.0;

            if (stevePositionX <= screenWidth / 2 && startScene == false) {
                speed = 0;
                sceneSpeed = 300;
                stevePositionX = screenWidth / 2;
                startScene = true;
            }

            if (steveRotateAngle >= STEVE_MAX_RATATION) {
                steveRotateAngle = STEVE_MAX_RATATION;
                steveRotateSpeed = -steveRotateSpeed;
            } else if (steveRotateAngle <= -STEVE_MAX_RATATION) {
                steveRotateAngle = -STEVE_MAX_RATATION;
                steveRotateSpeed = -steveRotateSpeed;
            }

            if (cowRotateAngle >= COW_MAX_RATATION) {
                cowRotateAngle = COW_MAX_RATATION;
                cowRotateSpeed = -cowRotateSpeed;
            } else if (cowRotateAngle <= -COW_MAX_RATATION) {
                cowRotateAngle = -COW_MAX_RATATION;
                cowRotateSpeed = -cowRotateSpeed;
            }

            if (pigRotateAngle >= PIG_MAX_RATATION) {
                pigRotateAngle = PIG_MAX_RATATION;
                pigRotateSpeed = -pigRotateSpeed;
            } else if (pigRotateAngle <= -PIG_MAX_RATATION) {
                pigRotateAngle = -PIG_MAX_RATATION;
                pigRotateSpeed = -pigRotateSpeed;
            }

            if (sheepRotateAngle >= SHEEP_MAX_RATATION) {
                sheepRotateAngle = SHEEP_MAX_RATATION;
                sheepRotateSpeed = -sheepRotateSpeed;
            } else if (sheepRotateAngle <= -SHEEP_MAX_RATATION) {
                sheepRotateAngle = -SHEEP_MAX_RATATION;
                sheepRotateSpeed = -sheepRotateSpeed;
            }

            if (chickenRotateAngle >= CHICKEN_MAX_RATATION) {
                chickenRotateAngle = CHICKEN_MAX_RATATION;
                chickenRotateSpeed = -chickenRotateSpeed;
            } else if (chickenRotateAngle <= -CHICKEN_MAX_RATATION) {
                chickenRotateAngle = -CHICKEN_MAX_RATATION;
                chickenRotateSpeed = -chickenRotateSpeed;
            }

            if (scene1PositionX >= stevePositionX && Scenes.stayBlock[scene1cureent] != -1
                    && Scenes.stayBlock[scene1cureent + 1] != -1) {
                if (Scenes.stayBlock[scene1cureent] < Scenes.stayBlock[scene2cureent]) {
                    jump();
                } else if (Scenes.stayBlock[scene1cureent] > Scenes.stayBlock[scene2cureent]) {
                    down();
                }
                Scenes.stayBlock[scene1cureent] = -1;
            }

            if (scene2PositionX >= stevePositionX && Scenes.stayBlock[scene2cureent] != -1
                    && Scenes.stayBlock[scene2cureent + 1] != -1) {
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
        stevePositionY -= BIT_OF_BLOCK * BIT;
    }

    public void down() {
        stevePositionY += BIT_OF_BLOCK * BIT;
    }

    public void drawBlock(Graphics2D g2, int x, int y, String colorCode[][]) {

        for (int i = 0, dy = y; i < colorCode.length; i++, dy += BIT) {
            for (int j = 0, dx = x; j < colorCode[0].length; j++, dx += BIT) {
                if (colorCode[i][j] == "#000000") {
                    g2.setColor(new Color(0, 0, 0, 200));
                } else if (colorCode[i][j] == "#xxxxxx") {
                    continue;
                } else {
                    g2.setColor(Color.decode(colorCode[i][j]));
                }
                g2.fillRect(dx, dy, BIT, BIT);
            }
        }
    }

    public void drawSheep(Graphics2D g2, int x, int y) {
        final double bodyWidth = 16 * BIT;
        final double bodyHeight = 6 * BIT;

        final double headWidth = 6 * BIT;

        final double legWidht = 4 * BIT;

        double headPositionX = x;
        double headPositionY = y;

        double bodyPositionX = x + headWidth - BIT;
        double bodyPositionY = headPositionY + (2 * BIT);

        double legPosotionY = bodyPositionY + bodyHeight;

        double fLegPositionX = bodyPositionX + BIT;
        double bLegPositionX = bodyPositionX + bodyWidth + BIT - legWidht;

        double legRotatePositionY = legPosotionY;

        double fLegRotatePositionX = fLegPositionX + BIT + (legWidht / 2);
        double bLegRotatePositionX = bLegPositionX + BIT + (legWidht / 2);

        drawBlock(g2, (int) headPositionX, (int) headPositionY, Mob.sheepHead);

        // front right leg
        g2.rotate(Math.toRadians(sheepRotateAngle), fLegRotatePositionX, legRotatePositionY);
        drawBlock(g2, (int) fLegPositionX, (int) legPosotionY, Mob.sheepRightLeg);
        g2.rotate(-Math.toRadians(sheepRotateAngle), fLegRotatePositionX, legRotatePositionY);

        // back right leg
        g2.rotate(-Math.toRadians(sheepRotateAngle), bLegRotatePositionX, legRotatePositionY);
        drawBlock(g2, (int) bLegPositionX, (int) legPosotionY, Mob.sheepRightLeg);
        g2.rotate(Math.toRadians(sheepRotateAngle), bLegRotatePositionX, legRotatePositionY);

        // front left leg
        g2.rotate(-Math.toRadians(sheepRotateAngle), fLegRotatePositionX, legRotatePositionY);
        drawBlock(g2, (int) fLegPositionX, (int) legPosotionY, Mob.sheepLeftLeg);
        g2.rotate(Math.toRadians(sheepRotateAngle), fLegRotatePositionX, legRotatePositionY);

        // back left leg
        g2.rotate(Math.toRadians(sheepRotateAngle), bLegRotatePositionX, legRotatePositionY);
        drawBlock(g2, (int) bLegPositionX, (int) legPosotionY, Mob.sheepLeftLeg);
        g2.rotate(-Math.toRadians(sheepRotateAngle), bLegRotatePositionX, legRotatePositionY);

        drawBlock(g2, (int) bodyPositionX, (int) bodyPositionY, Mob.sheepBody);
    }

    public void drawCow(Graphics2D g2, int x, int y) {
        final double bodyWidth = 18 * BIT;
        final double bodyHeight = 12 * BIT;

        final double headWidth = 6 * BIT;

        final double legWidht = 4 * BIT;

        double headPositionX = x;
        double headPositionY = y + (2 * BIT);

        double hornPositionX = x + (2 * BIT);
        double hornPositionY = y;

        double bodyPositionX = x + headWidth;
        double bodyPositionY = headPositionY + (2 * BIT);

        double legPosotionY = bodyPositionY + bodyHeight;

        double fLegPositionX = bodyPositionX;
        double bLegPositionX = bodyPositionX + bodyWidth - legWidht;

        double legRotatePositionY = legPosotionY;

        double fLegRotatePositionX = fLegPositionX + (legWidht / 2);
        double bLegRotatePositionX = bLegPositionX + (legWidht / 2);

        drawBlock(g2, (int) headPositionX, (int) headPositionY, Mob.cowHead);

        // front right leg
        g2.rotate(Math.toRadians(cowRotateAngle), fLegRotatePositionX, legRotatePositionY);
        drawBlock(g2, (int) fLegPositionX, (int) legPosotionY, Mob.cowLeg);
        g2.rotate(-Math.toRadians(cowRotateAngle), fLegRotatePositionX, legRotatePositionY);

        // back right leg
        g2.rotate(-Math.toRadians(cowRotateAngle), bLegRotatePositionX, legRotatePositionY);
        drawBlock(g2, (int) bLegPositionX, (int) legPosotionY, Mob.cowLeg);
        g2.rotate(Math.toRadians(cowRotateAngle), bLegRotatePositionX, legRotatePositionY);

        // front left leg
        g2.rotate(-Math.toRadians(cowRotateAngle), fLegRotatePositionX, legRotatePositionY);
        drawBlock(g2, (int) fLegPositionX, (int) legPosotionY, Mob.cowLeg);
        g2.rotate(Math.toRadians(cowRotateAngle), fLegRotatePositionX, legRotatePositionY);

        // back left leg
        g2.rotate(Math.toRadians(cowRotateAngle), bLegRotatePositionX, legRotatePositionY);
        drawBlock(g2, (int) bLegPositionX, (int) legPosotionY, Mob.cowLeg);
        g2.rotate(-Math.toRadians(cowRotateAngle), bLegRotatePositionX, legRotatePositionY);

        drawBlock(g2, (int) bodyPositionX, (int) bodyPositionY, Mob.cowBody);
        drawBlock(g2, (int) hornPositionX, (int) hornPositionY, Mob.cowHorn);
    }

    public void drawchicken(Graphics2D g2, int x, int y) {
        final double bodyHeight = 5 * BIT;

        final double headWidth = 3 * BIT;
        final double headHeight = 6 * BIT;

        final double mouthWidth = 2 * BIT;
        final double mouthHeight = 2 * BIT;

        final double legWidth = 3 * BIT;

        double headPositionX = x + mouthWidth;
        double headPositionY = y;

        double mouthPositionX = x;
        double mouthPositionY = y + (2 * BIT);

        double combPositionX = mouthPositionX + BIT;
        double combPositionY = mouthPositionY + mouthHeight;

        double bodyPositionX = headPositionX + headWidth - BIT;
        double bodyPositionY = headPositionY + headHeight - (2 * BIT);

        double legPositionX = bodyPositionX + (3 * BIT);
        double legPositionY = bodyPositionY + bodyHeight - BIT;

        double legRotatePositionX = legPositionX + legWidth;
        double legRotatePositionY = legPositionY;

        drawBlock(g2, (int) headPositionX, (int) headPositionY, Mob.chickenHead);
        drawBlock(g2, (int) mouthPositionX, (int) mouthPositionY, Mob.chickenMouth);
        drawBlock(g2, (int) combPositionX, (int) combPositionY, Mob.chickenComb);

        // right leg
        g2.rotate(Math.toRadians(chickenRotateAngle), legRotatePositionX, legRotatePositionY);
        drawBlock(g2, (int) legPositionX, (int) legPositionY, Mob.chickenLeg);
        g2.rotate(-Math.toRadians(chickenRotateAngle), legRotatePositionX, legRotatePositionY);

        // left leg
        g2.rotate(-Math.toRadians(chickenRotateAngle), legRotatePositionX, legRotatePositionY);
        drawBlock(g2, (int) legPositionX, (int) legPositionY, Mob.chickenLeg);
        g2.rotate(Math.toRadians(chickenRotateAngle), legRotatePositionX, legRotatePositionY);

        drawBlock(g2, (int) bodyPositionX, (int) bodyPositionY, Mob.chickenBody);

    }

    public void drawPig(Graphics2D g2, int x, int y) {
        final double bodyWidth = 16 * BIT;
        final double bodyHeight = 8 * BIT;

        final double headSide = 8 * BIT;
        final double legWidth = 4 * BIT;

        double headPositionX = x + BIT;
        double headPositionY = y;

        double nosePositionX = x;
        double nosePositionY = y + (4 * BIT);

        double bodyPositionX = headPositionX + headSide - (2 * BIT);
        double bodyPositionY = headPositionY + (2 * BIT);

        double fLegPositionX = bodyPositionX;
        double fLegPositionY = bodyPositionY + bodyHeight;

        double bLegPositionX = bodyPositionX + bodyWidth - legWidth;
        double bLegPositionY = bodyPositionY + bodyHeight;

        double fLegRotatePositionX = fLegPositionX + (legWidth / 2);
        double fLegRotatePositionY = fLegPositionY;

        double bLegRotatePositionX = bLegPositionX + (legWidth / 2);
        double bLegRotatePositionY = bLegPositionY;

        drawBlock(g2, (int) headPositionX, (int) headPositionY, Mob.pigHead);
        drawBlock(g2, (int) nosePositionX, (int) nosePositionY, Mob.pigNose);

        // right front leg
        g2.rotate(Math.toRadians(pigRotateAngle), fLegRotatePositionX, fLegRotatePositionY);
        drawBlock(g2, (int) fLegPositionX, (int) fLegPositionY, Mob.pigLeg);
        g2.rotate(-Math.toRadians(pigRotateAngle), fLegRotatePositionX, fLegRotatePositionY);

        // right back leg
        g2.rotate(Math.toRadians(pigRotateAngle), bLegRotatePositionX, bLegRotatePositionY);
        drawBlock(g2, (int) bLegPositionX, (int) bLegPositionY, Mob.pigLeg);
        g2.rotate(-Math.toRadians(pigRotateAngle), bLegRotatePositionX, bLegRotatePositionY);

        drawBlock(g2, (int) bodyPositionX, (int) bodyPositionY, Mob.pigBody);

        // left front leg
        g2.rotate(-Math.toRadians(pigRotateAngle), fLegRotatePositionX, fLegRotatePositionY);
        drawBlock(g2, (int) fLegPositionX, (int) fLegPositionY, Mob.pigLeg);
        g2.rotate(Math.toRadians(pigRotateAngle), fLegRotatePositionX, fLegRotatePositionY);

        // right front leg
        g2.rotate(-Math.toRadians(pigRotateAngle), bLegRotatePositionX, bLegRotatePositionY);
        drawBlock(g2, (int) bLegPositionX, (int) bLegPositionY, Mob.pigLeg);
        g2.rotate(Math.toRadians(pigRotateAngle), bLegRotatePositionX, bLegRotatePositionY);
    }

    public void drawCharacter(Graphics2D g2, int x, int y) {

        final double bodyWidth = 4 * BIT;
        final double bodyHeight = 12 * BIT;

        final double headSide = 8 * BIT;

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
        g2.rotate(Math.toRadians(steveRotateAngle), rotatePositionX, armRotatePositionY);
        drawBlock(g2, (int) armPositionX, (int) armPositionY, Mob.rightArmColorCode);
        g2.rotate(-Math.toRadians(steveRotateAngle), rotatePositionX, armRotatePositionY);

        // right leg
        g2.rotate(-Math.toRadians(steveRotateAngle), rotatePositionX, legRotatePositionY);
        drawBlock(g2, (int) legPositionX, (int) legPositionY, Mob.rightLegColorCode);
        g2.rotate(Math.toRadians(steveRotateAngle), rotatePositionX, legRotatePositionY);

        // body
        drawBlock(g2, (int) bodyPositionX, (int) bodyPositionY, Mob.bodyColorCode);

        // head
        drawBlock(g2, (int) headPositionX, (int) headPositionY, Mob.headColorCode);

        // left arm
        g2.rotate(-Math.toRadians(steveRotateAngle), rotatePositionX, armPositionY);
        drawBlock(g2, (int) armPositionX, (int) armPositionY, Mob.leftArmColorCode);
        g2.rotate(Math.toRadians(steveRotateAngle), rotatePositionX, armPositionY);

        // left leg
        g2.rotate(Math.toRadians(steveRotateAngle), rotatePositionX, legPositionY);
        drawBlock(g2, (int) legPositionX, (int) legPositionY, Mob.leftLegColorCode);
        g2.rotate(-Math.toRadians(steveRotateAngle), rotatePositionX, legPositionY);
    }

    public void drawScene(Graphics2D g2, int x, int y, String[][][][] blockCodeColors) {
        if (blockCodeColors == null) {
            return;
        }
        for (int i = 0, dy = y; i < blockCodeColors.length; i++, dy += BIT_OF_BLOCK * BIT) {
            for (int j = 0, dx = x; j < blockCodeColors[0].length; j++, dx += BIT_OF_BLOCK * BIT) {
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
        for (int i = 0, dy = y; i < blockCodeColors.length; i++, dy += BIT_OF_BLOCK * BIT) {
            for (int j = 0, dx = x; j < blockCodeColors[0].length; j++, dx += BIT_OF_BLOCK * BIT) {
                if (blockCodeColors[i][j] != null) {
                    drawBlock(g2, dx, dy, blockCodeColors[i][j]);
                    gDark.fillRect(dx, dy, (BIT * BIT_OF_BLOCK), (BIT * BIT_OF_BLOCK));
                }
            }
        }
        g2.drawImage(bf, 0, 0, null);
    }

    public BufferedImage midpointCircle(Graphics g, int xc, int yc, int r) {

        BufferedImage circleImage = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D gCircle = circleImage.createGraphics();

        gCircle.setColor(Color.YELLOW);

        int x = 0;
        int y = r;
        int d = 1 - r;
        int dx = 2*x;
        int dy = 2*y;

        while(x <= y) {
            plot(gCircle, x + xc, y + yc, 2);
            plot(gCircle, -x + xc, y + yc, 2);
            plot(gCircle, x + xc, -y + yc, 2);
            plot(gCircle, -x + xc, -y + yc, 2);
            plot(gCircle, y + xc, x + yc, 2);
            plot(gCircle, -y + xc, x + yc, 2);
            plot(gCircle, y + xc, -x + yc, 2);
            plot(gCircle, -y + xc, -x + yc, 2);

            x++;
            dx += 2;
            d += dx + 1;

            if(d >= 0) {
                y--;
                dy -= 2;
                d -= dy;
            }
        }

        floodfill(circleImage, xc, yc, new Color(0, 0, 0, 0), Color.YELLOW);
        return circleImage;
    }

    private void plot(Graphics g, int x, int y,int size) {
        g.fillRect(x, y, size, size);
    }

    // fill color in shape
    public void floodfill(BufferedImage m, int x, int y, Color targetColor, Color replacementColor) {
        Graphics2D g2 = m.createGraphics();
        Queue<Point> q = new LinkedList<>();

        if (m.getRGB(x, y) == targetColor.getRGB()) {
            g2.setColor(replacementColor);
            plot(g2, x, y, 1);
            q.add(new Point(x, y));
        }

        while (!q.isEmpty()) {
            Point p = q.poll();
            // s
            if (p.y < 600 && m.getRGB(p.x, p.y + 1) == targetColor.getRGB()) {
                plot(g2, p.x, p.y + 1, 1);
                q.add(new Point(p.x, p.y + 1));
            }
            // n
            if (p.y > 0 && m.getRGB(p.x, p.y - 1) == targetColor.getRGB()) {
                plot(g2, p.x, p.y - 1, 1);
                q.add(new Point(p.x, p.y - 1));
            }
            // e
            if (p.x < 600 && m.getRGB(p.x + 1, p.y) == targetColor.getRGB()) {
                plot(g2, p.x + 1, p.y, 1);
                q.add(new Point(p.x + 1, p.y));
            }
            // w
            if (p.x > 0 && m.getRGB(p.x - 1, p.y) == targetColor.getRGB()) {
                plot(g2, p.x - 1, p.y, 1);
                q.add(new Point(p.x - 1, p.y));
            }
        }
    }
}
