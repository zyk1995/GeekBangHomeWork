package com.zyk.nio02.week3;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class MyHttpClient2 {

    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();

        // 请求网关地址
        Request request = new Request.Builder()
                .url("http://127.0.0.1:8888/test")
                .build();

        Response response = null;
        response = client.newCall(request).execute();

        System.out.println(response.body().string());
    }
}
