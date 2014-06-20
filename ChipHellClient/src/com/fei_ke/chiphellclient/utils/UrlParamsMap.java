
package com.fei_ke.chiphellclient.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * 将url中的请求参数转换为map
 * 
 * @author 杨金阳
 * @2014-6-19
 */
public class UrlParamsMap extends HashMap<String, String> {
    public UrlParamsMap(String url) {

        int s = url.indexOf("?");
        if (s == -1)
            return;
        url = url.substring(s + 1);

        String[] params = url.split("&");
        Map<String, String> map = new HashMap<String, String>();
        for (int i = 0; i < params.length; i++) {
            String[] param = params[i].split("=");
            String key = param[0];
            String value = null;
            if (param.length > 1) {
                value = param[1];
            } else {
                value = "";
            }
            put(key, value);
        }
    }
}
