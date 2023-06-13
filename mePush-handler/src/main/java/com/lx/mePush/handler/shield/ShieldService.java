package com.lx.mePush.handler.shield;

import com.lx.mePush.common.domain.TaskInfo;

/**
 * 屏蔽服务
 *
 * @author lx
 */
public interface ShieldService {


    /**
     * 屏蔽消息
     *
     * @param taskInfo
     */
    void shield(TaskInfo taskInfo);
}
