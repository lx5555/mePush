package com.java3y.austin.service.api.service;

import com.java3y.austin.service.api.domain.SendRequest;
import com.java3y.austin.service.api.domain.SendResponse;

/**
 * 撤回接口
 *
 * @author lx
 */
public interface RecallService {


    /**
     * 根据模板ID撤回消息
     *
     * @param sendRequest
     * @return
     */
    SendResponse recall(SendRequest sendRequest);
}
