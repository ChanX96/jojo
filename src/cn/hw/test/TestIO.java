package cn.hw.test;

import cn.hw.io.IOUtils;

import java.util.Arrays;

public class TestIO {

    public static void main(String[] args) {
        testReadFile();
    }

    /**
     * 测试IOUtils::readDataFile
     */
    private static void testReadFile() {
        String inputPath = "/Users/chanx/Documents/file/华为软件精英挑战赛/初赛/test_data.txt";
        String[] datas = IOUtils.readDataFile(inputPath);

        //System.out.println("查看最后一行是否为空格->" + datas[datas.length - 1]);

        for (String data : datas) {
            System.out.println(data);
        }
    }
}
