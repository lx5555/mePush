package com.java3y.austin.handler.config;

import com.alipay.api.AlipayApiException;
import com.alipay.api.AlipayConfig;
import com.alipay.api.DefaultAlipayClient;
import com.java3y.austin.common.dto.account.AlipayMiniProgramAccount;

import java.util.HashMap;
import java.util.Map;

/**
 * 初始化支付宝小程序 单例
 *
 * @author 丁新东
 * @date 2022-12-07
 */
public class AlipayClientSingleton {

    private static volatile DefaultAlipayClient alipayClientSingleton;

    private static Map<String, DefaultAlipayClient> alipayClientMap = new HashMap<>();

    private AlipayClientSingleton() {
    }

    public static DefaultAlipayClient getSingleton(AlipayMiniProgramAccount alipayMiniProgramAccount) throws AlipayApiException {
        if (!alipayClientMap.containsKey(alipayMiniProgramAccount.getAppId())) {
            synchronized (DefaultAlipayClient.class) {
                if (!alipayClientMap.containsKey(alipayMiniProgramAccount.getAppId())) {
                    AlipayConfig alipayConfig = new AlipayConfig();
                    alipayConfig.setServerUrl("https://openapi.alipaydev.com/gateway.do");
                    alipayConfig.setAppId(alipayMiniProgramAccount.getAppId());
                    alipayConfig.setPrivateKey(alipayMiniProgramAccount.getPrivateKey());
                    alipayConfig.setFormat("json");
                    alipayConfig.setAlipayPublicKey(alipayMiniProgramAccount.getAlipayPublicKey());
                    alipayConfig.setCharset("utf-8");
                    alipayConfig.setSignType("RSA2");
                    alipayClientSingleton = new DefaultAlipayClient(alipayConfig);
                    alipayClientMap.put(alipayMiniProgramAccount.getAppId(), alipayClientSingleton);
                    return alipayClientSingleton;
                }
            }
        }
        return alipayClientMap.get(alipayMiniProgramAccount.getAppId());
    }
}
