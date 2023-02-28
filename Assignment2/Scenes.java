public class Scenes {

    private static String[][][][] scene1 = {
        {null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null},
        {Block.grass, Block.grass, Block.grass, Block.grass, Block.grass, Block.grass, Block.grass, Block.grass, Block.grass, Block.grass},
        {Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt},
        {Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt},
        {Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt},
        {Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt}
    };

    private static String[][][][] scene3 = {
        {null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null},
        {Block.grass, Block.grass, Block.grass, Block.grass, Block.grass, Block.grass, Block.grass, Block.grass, Block.grass, Block.grass},
        {Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt},
        {Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt},
        {Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt},
        {Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt},
        {Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt, Block.dirt}
    };

    private static String[][][][] end = {
        {null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null},
        {null, null, null, null, null, null, null, null, null, null}
    };

    public static String[][][][][] scenes = {
        scene1, scene3, scene1, scene3, end
    };
}
