package cn.hw.concurrent;

import cn.hw.object.Vertex;

import java.util.concurrent.Callable;

/**
 * 单线程任务
 */
public class SingleThreadSearch implements Callable<Boolean> {

    public SingleThreadSearch(Vertex vertex) {
        this.vertex = vertex;
    }

    @Override
    public Boolean call() throws Exception {
        return false;
    }

    private Vertex vertex;
}
