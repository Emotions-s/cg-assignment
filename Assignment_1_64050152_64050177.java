
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
        f.setSize(620, 640);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }

    @Override
    public void paintComponent(Graphics g) {

        drawBackGround(g);
        drawRabbit(g);
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

        // Draw to Graphics
        drawLayerToImages(g, layers);

    }

    public void drawRabbit(Graphics g){

        // all layers
        ArrayList<BufferedImage> layers = new ArrayList<>();

        // Draw Rabbit organ
        drawLeftEar(layers);
        drawRightEar(layers);
        drawNeck(layers);

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

    public void drawRightEar(ArrayList<BufferedImage> layers) {

        layers.add(drawPolygonFill(new Point[]{new Point(436,38), new Point(422,52), new Point(398,77), new Point(418, 49)}, new Color(225, 183, 194), new Color(225, 183, 194)));
        layers.add(drawPolygonFill(new Point[]{new Point(460,33), new Point(439,37), new Point(399, 77), new Point(398,79), new Point(447,45)}, new Color(11, 12, 114), new Color(11, 12, 114)));
        layers.add(drawPolygonFill(new Point[]{new Point(460,34), new Point(426,82), new Point(399,80)}, new Color(111, 27, 152), new Color(111, 27, 152)));
        layers.add(drawPolygonFill(new Point[]{new Point(461,34), new Point(425,83), new Point(444,76)}, new Color(188, 81, 104), new Color(188, 81, 104)));
        layers.add(drawPolygonFill(new Point[]{new Point(462,34), new Point(442,76), new Point(461,77), new Point(474,62), new Point(469, 38)}, new Color(217, 112, 112), new Color(217, 112, 112)));
        layers.add(drawPolygonFill(new Point[]{new Point(442,76), new Point(424,84), new Point(429, 133), new Point(460,78)}, new Color(235, 111, 163), new Color(235, 111, 163)));
        layers.add(drawPolygonFill(new Point[]{new Point(397,82), new Point(425,82), new Point(394,99)}, new Color(11, 12, 114), new Color(11, 12, 114)));
        layers.add(drawPolygonFill(new Point[]{new Point(424,83), new Point(394,99), new Point(388,139), new Point(424, 97)}, new Color(25, 18, 135), new Color(25, 18, 135)));
        layers.add(drawPolygonFill(new Point[]{new Point(424,98), new Point(418,104), new Point(427, 129)}, new Color(41, 36, 123), new Color(41, 36, 123)));
        layers.add(drawPolygonFill(new Point[]{new Point(418,105), new Point(388,138), new Point(384,171), new Point(415,138), new Point(427, 130)}, new Color(35, 109, 149), new Color(35, 109, 149)));
        layers.add(drawPolygonFill(new Point[]{new Point(428,131), new Point(415,138), new Point(384,171), new Point(388, 174), new Point(429,134)}, new Color(13, 54, 117), new Color(13, 54, 117)));
        layers.add(drawPolygonFill(new Point[]{new Point(428,133), new Point(387,173), new Point(442, 167), new Point(439,147)}, new Color(41, 144, 192), new Color(41, 144, 192)));
        layers.add(drawPolygonFill(new Point[]{new Point(473,62), new Point(462,75), new Point(429, 132), new Point(439,146), new Point(451, 153), new Point(462,156), new Point(461,142), new Point(460,123)}, new Color(242, 164, 168), new Color(242, 164, 168)));
        layers.add(drawPolygonFill(new Point[]{new Point(473,67), new Point(460,122), new Point(459,137), new Point(463, 157), new Point(469,140)}, new Color(166, 219, 184), new Color(166, 219, 184)));
        layers.add(drawPolygonFill(new Point[]{new Point(436,145), new Point(443,167), new Point(464,158)}, new Color(98, 132, 148), new Color(98, 132, 148)));
        layers.add(drawPolygonFill(new Point[]{new Point(398,76), new Point(379,99), new Point(393,99)}, new Color(107, 178, 175), new Color(107, 178, 175)));
        layers.add(drawPolygonFill(new Point[]{new Point(380,99), new Point(367,116), new Point(365,134), new Point(390,113), new Point(392,100)}, new Color(185, 150, 113), new Color(185, 150, 113)));
        layers.add(drawPolygonFill(new Point[]{new Point(389,115), new Point(365,135), new Point(362,161), new Point(360,198), new Point(378,167)}, new Color(213, 138, 54), new Color(213, 138, 54)));
        layers.add(drawPolygonFill(new Point[]{new Point(388,125), new Point(376,181), new Point(372,231), new Point(384,206), new Point(389,174), new Point(383,170)}, new Color(150, 37, 18), new Color(150, 37, 18)));
        layers.add(drawPolygonFill(new Point[]{new Point(379,163), new Point(367,187), new Point(369,232), new Point(373, 228)}, new Color(100, 63, 98), new Color(100, 63, 98)));
        layers.add(drawPolygonFill(new Point[]{new Point(367,116), new Point(339,157), new Point(363,158)}, new Color(229, 221, 188), new Color(229, 221, 188)));
        layers.add(drawPolygonFill(new Point[]{new Point(339,156), new Point(352,171), new Point(363,159)}, new Color(212, 200, 153), new Color(212, 200, 153)));
        layers.add(drawPolygonFill(new Point[]{new Point(347,167), new Point(328,184), new Point(344,183), new Point(352, 172)}, new Color(235, 210, 125), new Color(235, 210, 125)));
        layers.add(drawPolygonFill(new Point[]{new Point(361,162), new Point(361,198), new Point(352,219), new Point(344, 193), new Point(344, 183)}, new Color(210, 105, 18), new Color(210, 105, 18)));
        layers.add(drawPolygonFill(new Point[]{new Point(328,184), new Point(322,195), new Point(351,216), new Point(343, 184)}, new Color(175, 141, 107), new Color(175, 141, 107)));
        layers.add(drawPolygonFill(new Point[]{new Point(368,184), new Point(353,219), new Point(370,259), new Point(374, 256), new Point(369, 236)}, new Color(157, 153, 123), new Color(157, 153, 123)));
        layers.add(drawPolygonFill(new Point[]{new Point(464,158), new Point(451,178), new Point(431,195), new Point(410, 196), new Point(422, 183)}, new Color(126, 192, 158), new Color(126, 192, 158)));
        layers.add(drawPolygonFill(new Point[]{new Point(408,197), new Point(430,195), new Point(407,220), new Point(401, 237), new Point(401, 258), new Point(388, 258), new Point(388, 232)}, new Color(214, 227, 188), new Color(214, 227, 188)));
        layers.add(drawPolygonFill(new Point[]{new Point(369,232), new Point(361,237), new Point(366,252), new Point(374, 255)}, new Color(114, 184, 157), new Color(114, 184, 157)));
        layers.add(drawPolygonFill(new Point[]{new Point(388,174), new Point(373,231), new Point(387,221), new Point(427, 169)}, new Color(7, 15, 78), new Color(7, 15, 78)));
        layers.add(drawPolygonFill(new Point[]{new Point(389,173), new Point(388,177), new Point(401,179), new Point(411,177), new Point(421, 170)}, new Color(76, 107, 156), new Color(76, 107, 156)));
        layers.add(drawPolygonFill(new Point[]{new Point(422,170), new Point(443,169), new Point(417,186), new Point(410, 181)}, new Color(76, 107, 156), new Color(76, 107, 156)));
        layers.add(drawPolygonFill(new Point[]{new Point(410,181), new Point(417,186), new Point(386,204), new Point(386,201), new Point(393, 195)}, new Color(173, 205, 199), new Color(173, 205, 199)));
        layers.add(drawPolygonFill(new Point[]{new Point(415,189), new Point(401,202), new Point(386,223), new Point(370,233), new Point(375, 256)}, new Color(28, 138, 152), new Color(28, 138, 152)));
        layers.add(drawPolygonFill(new Point[]{new Point(389,234), new Point(379,251), new Point(387,257)}, new Color(96, 218, 186), new Color(96, 218, 186)));
        layers.add(drawPolygonFill(new Point[]{new Point(378,251), new Point(376,254), new Point(399,276), new Point(404,268), new Point(402,260), new Point(388,258)}, new Color(118, 227, 195), new Color(118, 227, 195)));

    }

    public void drawNeck(ArrayList<BufferedImage> layers) {

        layers.add(drawPolygonFill(new Point[]{new Point(301,554), new Point(264,535), new Point(269,563), new Point(287, 572)}, new Color(76, 19, 19), new Color(76, 19, 19)));
        layers.add(drawPolygonFill(new Point[]{new Point(300,554), new Point(286,572), new Point(336,592)}, new Color(42, 11, 7), new Color(42, 11, 7)));
        layers.add(drawPolygonFill(new Point[]{new Point(343,521), new Point(301,554), new Point(338,593)}, new Color(23, 0, 2), new Color(23, 0, 2)));
        layers.add(drawPolygonFill(new Point[]{new Point(329,476), new Point(302,554), new Point(343,519)}, new Color(99, 16, 5), new Color(99, 16, 5)));
        layers.add(drawPolygonFill(new Point[]{new Point(265,534), new Point(265,501), new Point(300,554)}, new Color(186, 71, 4), new Color(186, 71, 4)));
        layers.add(drawPolygonFill(new Point[]{new Point(301,554), new Point(266,501), new Point(268,477), new Point(266,473), new Point(271,451), new Point(268,428), new Point(280,454), new Point(291,468), new Point(272,481)}, new Color(136, 66, 41), new Color(136, 66, 41)));
        layers.add(drawPolygonFill(new Point[]{new Point(294,467), new Point(271,482), new Point(300,550)}, new Color(170, 50, 3), new Color(170, 50, 3)));
        layers.add(drawPolygonFill(new Point[]{new Point(268,562), new Point(234,528), new Point(234,479), new Point(264,539)}, new Color(251, 166, 93), new Color(251, 166, 93)));
        layers.add(drawPolygonFill(new Point[]{new Point(265,538), new Point(230,469), new Point(249,430), new Point(253,430), new Point(259,459), new Point(267,478)}, new Color(239, 128, 6), new Color(239, 128, 6)));
        layers.add(drawPolygonFill(new Point[]{new Point(234,460), new Point(220,491), new Point(233,528)}, new Color(221, 143, 89), new Color(221, 143, 89)));
        layers.add(drawPolygonFill(new Point[]{new Point(248,430), new Point(219,490), new Point(216,465), new Point(228,427)}, new Color(244, 190, 122), new Color(244, 190, 122)));
        layers.add(drawPolygonFill(new Point[]{new Point(328,475), new Point(301,553), new Point(295,468), new Point(284,437), new Point(297,430)}, new Color(214, 172, 60), new Color(214, 172, 60)));
        layers.add(drawPolygonFill(new Point[]{new Point(291,420), new Point(325,469), new Point(322,427), new Point(305,414)}, new Color(29, 29, 56), new Color(29, 29, 56)));
        layers.add(drawPolygonFill(new Point[]{new Point(322,428), new Point(326,450), new Point(326,470), new Point(328,474), new Point(333,472), new Point(330,434)}, new Color(155, 143, 44), new Color(155, 143, 44)));
        layers.add(drawPolygonFill(new Point[]{new Point(330,433), new Point(331,473), new Point(357,454)}, new Color(103, 67, 38), new Color(103, 67, 38)));
        layers.add(drawPolygonFill(new Point[]{new Point(329,477), new Point(344,522), new Point(360,484)}, new Color(124, 58, 21), new Color(124, 58, 21)));
        layers.add(drawPolygonFill(new Point[]{new Point(329,476), new Point(361,484), new Point(365,472), new Point(357,453)}, new Color(105, 39, 14), new Color(105, 39, 14)));
        layers.add(drawPolygonFill(new Point[]{new Point(365,474), new Point(345,521), new Point(340,557), new Point(338,586), new Point(357,532)}, new Color(83, 11, 4), new Color(83, 11, 4)));
        layers.add(drawPolygonFill(new Point[]{new Point(412,502), new Point(360,456), new Point(365,476), new Point(358,528), new Point(338,591)}, new Color(101, 31, 8), new Color(101, 31, 8)));
        layers.add(drawPolygonFill(new Point[]{new Point(411,503), new Point(337,593), new Point(346,591), new Point(397,530), new Point(413,504)}, new Color(32, 2, 2), new Color(32, 2, 2)));
        layers.add(drawPolygonFill(new Point[]{new Point(399,529), new Point(343,592), new Point(393,571)}, new Color(50, 7, 6), new Color(50, 7, 6)));
        layers.add(drawPolygonFill(new Point[]{new Point(414,505), new Point(398,530), new Point(392,571), new Point(405,567)}, new Color(108, 20, 5), new Color(108, 20, 5)));

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