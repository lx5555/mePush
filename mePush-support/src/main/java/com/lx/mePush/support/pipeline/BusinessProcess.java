package com.java3y.austin.support.pipeline;

/**
 * 业务执行器
 *
 * @author lx
 */
public interface BusinessProcess<T extends ProcessModel> {

    /**
     * 真正处理逻辑
     *
     * @param context
     */
    void process(ProcessContext<T> context);
}
