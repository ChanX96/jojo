package cn.hw.test;

import cn.hw.graphic.GraphicUtils;
import cn.hw.io.IOUtils;
import cn.hw.object.Vertex;

import java.util.Map;

/**
 * 测试图的各种方法
 */
public class TestGraphic {

    public static void main(String[] args) {
        testBuildGraphic();
    }

    private static void testBuildGraphic() {

        String inputPath = "/Users/chanx/Documents/file/华为软件精英挑战赛/初赛/test_data.txt";
        String[] datas = IOUtils.readDataFile(inputPath);

        Map<Integer, Vertex> graphic = GraphicUtils.buildGraphic(datas);

        graphic.values().forEach((v) -> {
            System.out.println(v);
        });
    }
}
