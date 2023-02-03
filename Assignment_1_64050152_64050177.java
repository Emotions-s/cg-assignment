
// 64050152 ปิยะวัชร์ หมื่นศรี
// 64050177 พิสิษฐ์ เปรื่องปราชญ์
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class Assignment_1_64050152_64050177 extends JPanel {
    public static void main(String[] args) {
        JFrame f = new JFrame();
        Assignment_1_64050152_64050177 m = new Assignment_1_64050152_64050177();

        f.add(m);
        f.setTitle("Assignment 1");
        f.setSize(600, 600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {

        drawBackGround(g);
    }

    // **********
    // * Layers *
    // **********

    // Draw background layer
    public void drawBackGround(Graphics g) {

        // all layers
        ArrayList<BufferedImage> layers = new ArrayList<>();

        // Create gradient layer
        BufferedImage gradientLayer = makeGradient(0, 600, 600, 0, new Color(75, 35, 44, 255),
                new Color(39, 36, 63, 255), 601, 601,
                -45);
        layers.add(gradientLayer);

        // Create upper layer
        BufferedImage backGround = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D gBackGround = backGround.createGraphics();

        // draw line and fill color
        gBackGround.setColor(new Color(65, 34, 52, 255));
        BresenhamLine(gBackGround, 0, 583, 600, 16);
        floodfill(backGround, 200, 200, new Color(0, 0, 0, 0), new Color(28, 74, 89,
                255));
        layers.add(backGround);

        // tracery
        layers.add(drawPolygon(new Point[] { new Point(460, 150), new Point(539, 210), new Point(600, 150) },
                new Color(72, 80, 93, 255)));

        layers.add(drawPolygonFill(new Point[] { new Point(460, 150), new Point(539, 210), new Point(509, 174) },
                new Color(72, 80, 93, 255), new Color(72, 80, 93, 255)));

        layers.add(drawPolygon(new Point[] { new Point(600, 150), new Point(539, 210), new Point(600, 235) },
                new Color(72, 80, 93, 255)));

        layers.add(drawPolygonFill(
                new Point[] { new Point(538, 211), new Point(516, 287), new Point(508, 290), new Point(460, 150) },
                new Color(41,33,57,255), new Color(41,33,57,255)));

        layers.add(drawPolygonFill(new Point[] { new Point(519, 286), new Point(539, 210), new Point(600, 235) },
                new Color(42, 45, 64, 255), new Color(62, 48, 61, 255)));

        drawLeftEar(layers);

        // Draw to Graphics
        drawLayerToImages(g, layers);

    }

    public void drawLeftEar(ArrayList<BufferedImage> layers){
        layers.add(drawPolygonFill(new Point[]{new Point(191,39), new Point(215,52), new Point(183,48)}, new Color(115, 54, 106), new Color(115, 54, 106)));
        layers.add(drawPolygonFill(new Point[]{new Point(191,39), new Point(217,51), new Point(221,52), new Point(194, 36)}, new Color(192, 190, 200), new Color(192, 190, 200)));
        layers.add(drawPolygonFill(new Point[]{new Point(183,48), new Point(181,53), new Point(230,70), new Point(220, 53)}, new Color(85, 170, 167), new Color(85, 170, 167)));
        layers.add(drawPolygonFill(new Point[]{new Point(230,71), new Point(235,87), new Point(215,89), new Point(184, 65), new Point(181, 54)}, new Color(161, 212, 176), new Color(161, 212, 176)));
        layers.add(drawPolygonFill(new Point[]{new Point(216,89), new Point(228,101), new Point(229,132), new Point(248, 154), new Point(247,121), new Point(235,88)}, new Color(238, 231, 188), new Color(238, 231, 188)));
        layers.add(drawPolygonFill(new Point[]{new Point(218,91), new Point(204,100), new Point(213,115), new Point(228, 132), new Point(227,99)}, new Color(250, 246, 212), new Color(250, 246, 212)));
        layers.add(drawPolygonFill(new Point[]{new Point(203,100), new Point(219,92), new Point(184,66)}, new Color(250, 240, 187), new Color(250, 240, 187)));
        layers.add(drawPolygonFill(new Point[]{new Point(206,102), new Point(204,101), new Point(204,101), new Point(249,172), new Point(249, 194)}, new Color(248, 227, 162), new Color(248, 227, 162)));
        layers.add(drawPolygonFill(new Point[]{new Point(217,121), new Point(219,121), new Point(218,121), new Point(249,155), new Point(250, 174)}, new Color(223, 206, 173), new Color(223, 206, 173)));
        layers.add(drawPolygonFill(new Point[]{new Point(246,120), new Point(250,168), new Point(249,197), new Point(252,203), new Point(260, 198), new Point(260,159), new Point(260,150)}, new Color(243, 189, 87), new Color(243, 189, 87)));
        layers.add(drawPolygonFill(new Point[]{new Point(233,79), new Point(245,113), new Point(268,96), new Point(234, 60), new Point(218, 49)}, new Color(155, 63, 113), new Color(155, 63, 113)));
        layers.add(drawPolygonFill(new Point[]{new Point(267,97), new Point(245,114), new Point(261,154), new Point(268, 146)}, new Color(188, 70, 61), new Color(188, 70, 61)));
        layers.add(drawPolygonFill(new Point[]{new Point(268,97),new Point(269,145), new Point(261,153), new Point(276,174), new Point(280, 113)}, new Color(201, 82, 50), new Color(201, 82, 50)));
        layers.add(drawPolygonFill(new Point[]{new Point(280,114), new Point(298,137), new Point(277,173)}, new Color(179,69,57), new Color(179,69,57)));
        layers.add(drawPolygonFill(new Point[]{new Point(261,150), new Point(276,175), new Point(261,184)}, new Color(89,44,83), new Color(89,44,83)));
        layers.add(drawPolygonFill(new Point[]{new Point(299,137), new Point(276,175), new Point(284, 181), new Point(296, 173)}, new Color(110, 53, 72), new Color(110, 53, 72)));
        layers.add(drawPolygonFill(new Point[]{new Point(299,137), new Point(298,161), new Point(308, 178), new Point(313, 162)}, new Color(144, 45, 55), new Color(144, 45, 55)));
        layers.add(drawPolygonFill(new Point[]{new Point(297,161), new Point(295,173), new Point(283, 181), new Point(304, 194), new Point(320, 194)}, new Color(41, 55, 84), new Color(41, 55, 84)));
        layers.add(drawPolygonFill(new Point[]{new Point(262,184), new Point(275,175), new Point(296, 190), new Point(276, 189)}, new Color(161, 144, 130), new Color(161, 144, 130)));
        layers.add(drawPolygonFill(new Point[]{new Point(262,184), new Point(283,190), new Point(261,196)}, new Color(43,59,101), new Color(43,59,101)));
        layers.add(drawPolygonFill(new Point[]{new Point(261,198), new Point(283,191), new Point(296, 190), new Point(306, 196), new Point(292, 201)}, new Color(173, 147, 129), new Color(173, 147, 129)));
    }

    // *********
    // * Tools *
    // *********

    // Draw all BufferedImage to Graphics
    public void drawLayerToImages(Graphics g, ArrayList<BufferedImage> layers) {
        for (BufferedImage layer : layers) {
            g.drawImage(layer, 0, 0, null);
        }
    }

    // Create Traingle and fill color in BufferedImage
    public BufferedImage drawPolygonFill(Point[] points, Color lineColor, Color fillColor) {

        BufferedImage polyImage = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D gPoly = polyImage.createGraphics();

        int[] xPoly = new int[points.length];
        int[] yPoly = new int[points.length];

        int x = 0;
        int y = 0;

        for (int i = 0; i < points.length; i++) {
            xPoly[i] = points[i].x;
            x += points[i].x;
            yPoly[i] = points[i].y;
            y += points[i].y;
        }

        Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);
        gPoly.setColor(lineColor);
        gPoly.drawPolygon(poly);

        floodfill(polyImage, x / xPoly.length, y / yPoly.length, new Color(0, 0, 0, 0), fillColor);

        return polyImage;
    }

    // Create Traingle in BufferedImage
    public BufferedImage drawPolygon(Point[] points, Color lineColor) {

        BufferedImage polyImage = new BufferedImage(601, 601, BufferedImage.TYPE_INT_ARGB);
        Graphics2D gPoly = polyImage.createGraphics();

        int[] xPoly = new int[points.length];
        int[] yPoly = new int[points.length];

        for (int i = 0; i < points.length; i++) {
            xPoly[i] = points[i].x;
            yPoly[i] = points[i].y;
        }

        Polygon poly = new Polygon(xPoly, yPoly, xPoly.length);
        gPoly.setColor(lineColor);
        gPoly.drawPolygon(poly);

        return polyImage;
    }

    // Create BufferedImage with gradient rectangle color
    public BufferedImage makeGradient(int startX, int startY, int endX, int endY, Color startColor, Color endColor,
            int width, int height, int angleDegree) {

        BufferedImage image = new BufferedImage(width, height, BufferedImage.TYPE_INT_RGB);
        Graphics2D gImage = image.createGraphics();

        int deltaX = endX - startX;
        int deltaY = endY - startY;

        double angle = Math.toRadians(angleDegree);

        for (int x = 0; x < width; x++) {
            for (int y = 0; y < height; y++) {
                float fraction = (x - startX) / (float) deltaX;
                float rotatedFraction = (float) (fraction * Math.cos(angle)
                        - (y - startY) / (float) deltaY * Math.sin(angle));

                int red = Math.min(255, Math.max(0,
                        (int) (startColor.getRed() + rotatedFraction * (endColor.getRed() - startColor.getRed()))));
                int green = Math.min(255, Math.max(0, (int) (startColor.getGreen()
                        + rotatedFraction * (endColor.getGreen() - startColor.getGreen()))));
                int blue = Math.min(255, Math.max(0,
                        (int) (startColor.getBlue() + rotatedFraction * (endColor.getBlue() - startColor.getBlue()))));
                int alpha = Math.min(255, Math.max(0, (int) (startColor.getAlpha()
                        + rotatedFraction * (endColor.getAlpha() - startColor.getAlpha()))));

                gImage.setColor(new Color(red, green, blue, alpha));
                gImage.fillRect(x, y, 1, 1);
            }
        }

        return image;
    }

    // fill color in shape
    public BufferedImage floodfill(BufferedImage m, int x, int y, Color targetColor, Color replacementColor) {
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

        return m;
    }

    // Draw Curve Line
    public void bezienCurve(Graphics g, int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4) {

        for (int i = 0; i <= 1000; i++) {
            double t = i / 1000.0;

            int x = (int) (Math.pow((1 - t), 3) * x1
                    + 3 * t * Math.pow((1 - t), 2) * x2
                    + 3 * Math.pow(t, 2) * (1 - t) * x3
                    + Math.pow(t, 3) * x4);

            int y = (int) (Math.pow((1 - t), 3) * y1
                    + 3 * t * Math.pow((1 - t), 2) * y2
                    + 3 * Math.pow(t, 2) * (1 - t) * y3
                    + Math.pow(t, 3) * y4);

            plot(g, x, y, 1);
        }
    }

    // Draw Line
    public void BresenhamLine(Graphics g, int x1, int y1, int x2, int y2) {
        int dx = Math.abs(x2 - x1);
        int dy = Math.abs(y2 - y1);

        int sx = (x1 < x2) ? 1 : -1;
        int sy = (y1 < y2) ? 1 : -1;

        boolean isSwap = false;

        if (dy > dx) {
            dx ^= dy;
            dy ^= dx;
            dx ^= dy;
            isSwap = true;
        }

        int D = 2 * dy - dx;

        int x = x1;
        int y = y1;

        for (int i = 0; i <= dx; i++) {
            plot(g, x, y, 1);
            if (D >= 0) {
                if (isSwap) {
                    x += sx;
                } else {
                    y += sy;
                }

                D -= 2 * dx;
            }

            if (isSwap) {
                y += sy;
            } else {
                x += sx;
            }

            D += 2 * dy;
        }
    }

    // Draw a dot
    public void plot(Graphics g, int x, int y, int size) {
        g.fillRect(x, y, size, size);
    }
}