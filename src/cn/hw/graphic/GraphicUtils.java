package cn.hw.graphic;

import cn.hw.object.Vertex;

import java.util.HashMap;
import java.util.Map;

/**
 * 图相关工具
 */
public class GraphicUtils {

    /**
     * 通过String数组建立图
     * @param input
     * @return
     */
    public static Map<Integer, Vertex> buildGraphic(String[] input) {

        Map<Integer, Vertex> graphic = new HashMap<>(input.length, 0.75f);

        // 第一遍扫描数据注册发送人的定点
        for (String s : input) {
            String[] record = s.split(",");
            Integer sender = Integer.valueOf(record[0]);
            if (graphic.containsKey(sender) == false) {
                graphic.put(sender, new Vertex(sender));
            }
        }

        // 第二遍扫描将图中存在的顶点构建成图
        for (String s : input) {
            String[] record = s.split(",");
            Integer sender = Integer.valueOf(record[0]);
            Integer receiver = Integer.valueOf(record[1]);

            if (graphic.containsKey(receiver)) {
                Vertex vertex = graphic.get(sender);
                vertex.add(graphic.get(receiver));
            }
        }

        // 遍历各个顶点，将各个顶点的邻接链表排序
        graphic.values().forEach((v) -> {
            v.adjacentSort();
        });

        return graphic;
    }
}
