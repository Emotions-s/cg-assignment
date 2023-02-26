import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;

public class Assignment_2_64050152_64050177 extends JPanel implements Runnable {

    final int bitOfBlock = 16;
    final int aBit = 4;

    double rotateAngle = 0;
    double roatateSpeed = 250;
    final double MAX_ARM_RATATION = 45;

    double speed = 300;

    double stevePositionX = 150;
    double stevePositionY = 375;

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

        g2.setColor(Color.RED);
        g2.rotate(Math.toRadians(rotateAngle), stevePositionX, legPositionY);
        drawBlock(g2, (int) (stevePositionX - (legWidth / 2)), (int) legPositionY, BlockCodeColor.rightLegColorCode);
        g2.rotate(-Math.toRadians(rotateAngle), stevePositionX, legPositionY);

        g2.setColor(Color.ORANGE);
        g2.rotate(-Math.toRadians(rotateAngle), stevePositionX, armPositionY);
        drawBlock(g2, (int) (stevePositionX - (legWidth / 2)), (int) armPositionY, BlockCodeColor.rightArmColorCode);
        g2.rotate(Math.toRadians(rotateAngle), stevePositionX, armPositionY);

        drawBlock(g2, (int) (stevePositionX - (bodyWidth / 2)), (int) (stevePositionY - (bodyHeight / 2)), BlockCodeColor.bodyColorCode);

        drawBlock(g2, (int) (stevePositionX - (headSide / 2)), (int) (headPositionY - (headSide / 2)), BlockCodeColor.headColorCode);

        g2.setColor(Color.GREEN);
        g2.rotate(-Math.toRadians(rotateAngle), stevePositionX, legPositionY);
        drawBlock(g2, (int) (stevePositionX - (legWidth / 2)), (int) legPositionY, BlockCodeColor.leftLegColorCode);
        g2.rotate(Math.toRadians(rotateAngle), stevePositionX, legPositionY);

        g2.rotate(Math.toRadians(rotateAngle), stevePositionX, armPositionY);
        drawBlock(g2, (int) (stevePositionX - (legWidth / 2)), (int) armPositionY, BlockCodeColor.leftArmColorCode);
        g2.rotate(-Math.toRadians(rotateAngle), stevePositionX, armPositionY);

        drawBlock(g2, 0, 600 - 2 * bitOfBlock * aBit, BlockCodeColor.grassColorCode);
        drawBlock(g2, bitOfBlock * aBit, 600 - 2 * bitOfBlock * aBit, BlockCodeColor.grassColorCode);
        drawBlock(g2, 2 * bitOfBlock * aBit, 600 - 2 * bitOfBlock * aBit, BlockCodeColor.grassColorCode);
        drawBlock(g2, 3 * bitOfBlock * aBit, 600 - 2 * bitOfBlock * aBit, BlockCodeColor.grassColorCode);
        drawBlock(g2, 4 * bitOfBlock * aBit, 600 - 2 * bitOfBlock * aBit, BlockCodeColor.grassColorCode);
        drawBlock(g2, 5 * bitOfBlock * aBit, 600 - 2 * bitOfBlock * aBit, BlockCodeColor.grassColorCode);
        drawBlock(g2, 6 * bitOfBlock * aBit, 600 - 2 * bitOfBlock * aBit, BlockCodeColor.grassColorCode);
        drawBlock(g2, 7 * bitOfBlock * aBit, 600 - 2 * bitOfBlock * aBit, BlockCodeColor.grassColorCode);
        drawBlock(g2, 8 * bitOfBlock * aBit, 600 - 2 * bitOfBlock * aBit, BlockCodeColor.grassColorCode);
        drawBlock(g2, 9 * bitOfBlock * aBit, 600 - 2 * bitOfBlock * aBit, BlockCodeColor.grassColorCode);

        drawBlock(g2, 0, 600 - bitOfBlock * aBit, BlockCodeColor.dirtColorCode);
        drawBlock(g2, bitOfBlock * aBit, 600 - bitOfBlock * aBit, BlockCodeColor.dirtColorCode);
        drawBlock(g2, 2 * bitOfBlock * aBit, 600 - bitOfBlock * aBit, BlockCodeColor.dirtColorCode);
        drawBlock(g2, 3 * bitOfBlock * aBit, 600 - bitOfBlock * aBit, BlockCodeColor.dirtColorCode);
        drawBlock(g2, 4 * bitOfBlock * aBit, 600 - bitOfBlock * aBit, BlockCodeColor.dirtColorCode);
        drawBlock(g2, 5 * bitOfBlock * aBit, 600 - bitOfBlock * aBit, BlockCodeColor.dirtColorCode);
        drawBlock(g2, 6 * bitOfBlock * aBit, 600 - bitOfBlock * aBit, BlockCodeColor.dirtColorCode);
        drawBlock(g2, 7 * bitOfBlock * aBit, 600 - bitOfBlock * aBit, BlockCodeColor.dirtColorCode);
        drawBlock(g2, 8 * bitOfBlock * aBit, 600 - bitOfBlock * aBit, BlockCodeColor.dirtColorCode);
        drawBlock(g2, 9 * bitOfBlock * aBit, 600 - bitOfBlock * aBit, BlockCodeColor.dirtColorCode);

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
            stevePositionX += speed * elapsedTime / 1000.0;

            if (rotateAngle >= MAX_ARM_RATATION) {
                rotateAngle = MAX_ARM_RATATION;
                roatateSpeed = -roatateSpeed;
            } else if (rotateAngle <= -MAX_ARM_RATATION) {
                rotateAngle = -MAX_ARM_RATATION;
                roatateSpeed = -roatateSpeed;
            }
            if (stevePositionX <= 0) {
                stevePositionX = 0;
                speed = -speed;
            } else if (stevePositionX >= 600) {
                stevePositionX = 600;
                speed = -speed;
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
}
