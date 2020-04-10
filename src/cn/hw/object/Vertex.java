package cn.hw.object;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

public class Vertex {

    private int val;
    private List<Vertex> adjacent;

    /**
     * 构造方法
     * @param val
     */
    public Vertex(int val) {
        this.val = val;
        adjacent = new LinkedList<>();
    }

    public int getVal() {
        return val;
    }

    public List<Vertex> getAdjacent() {
        return adjacent;
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

    @Override
    public String toString() {

        StringBuilder sb = new StringBuilder("");
        sb.append(val);
        adjacent.forEach((v) -> {
            sb.append(" ");
            sb.append(v.val);
        });

        return sb.toString();
    }

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
