package com.h3xstream.scriptgen;

import java.util.HashMap;
import java.util.Map;

public class HttpRequestInfoFixtures {

    public static HttpRequestInfo getPostRequest() {
        Map<String, String> getParams = new HashMap<String, String>();
        getParams.put("id", "12345");
        getParams.put("hash", "3012451c92c89ed9b48dcdc817d6a527");

        Map<String, String> postParams = new HashMap<String, String>();
        postParams.put("username", "admin");
        postParams.put("password", "admin");

        Map<String, String> headers = new HashMap<String, String>();
        headers.put("Cookie", "SID=Aualz4Rx0_8t3GJda; LANG=en-US");
        headers.put("User-Agent", "Mozilla/5.0 (Windows NT 6.1; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/31.0.1650.57 Safari/537.36");
        headers.put("Accept", "*/*");

        HttpRequestInfo req = new HttpRequestInfo("POST", "http://hack.me/injection", getParams, postParams, headers);
        return req;
    }
}