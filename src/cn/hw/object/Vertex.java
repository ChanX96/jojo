package cn.hw.object;

import java.util.Comparator;
import java.util.LinkedList;

public class Vertex {

    /**
     * 构造方法
     * @param val
     */
    public Vertex(int val) {
        this.val = val;
        adjacent = new LinkedList<>();
    }

    /**
     * 加入数据
     * @param vertex
     */
    public void add(Vertex vertex) {
        adjacent.add(vertex);
    }

    /**
     * 得到出度
     * @return
     */
    public int getDegree() {
        return adjacent.size();
    }

    /**
     * 将邻接链表排序
     */
    public void adjacentSort() {

        if (adjacent.size() <= 1) {
            return;
        }

        adjacent.sort(new VertexComparator());
    }

    private int val;
    private LinkedList<Vertex> adjacent;

    /**
     * Vertex的比较器，用于邻接链表的排序
     */
    private static class VertexComparator implements Comparator<Vertex> {

        @Override
        public int compare(Vertex v1, Vertex v2) {
            return v1.val < v2.val ? -1 : ((v1.val == v2.val) ? 0 : 1);
        }
    }
}
