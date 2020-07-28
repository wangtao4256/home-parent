package com.home.wangtao.homeuser.common;

import com.google.common.collect.Maps;

import java.util.Map;

public class UserEnv {
    private static ThreadLocal<Map<String, String>> userEnv = new ThreadLocal<>();


    public static void set(String key, String value) {
        Map<String, String> env = userEnv.get();
        if (null == env) {
            env = Maps.newHashMap();
            userEnv.set(env);
        }
        env.put(key, value);

    }

    public static String get(String key) {
        if (null == key) {
            return "";
        }
        Map<String, String> map = userEnv.get();
        if (null == map) {
            return "";
        }
        String value = map.get(key);
        return value;
    }


}
