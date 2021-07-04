package com.zyk.nio01.netty;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

import java.io.IOException;

public class MyHttpClient {

    public static void main(String[] args) throws IOException {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("http://127.0.0.1:8801/")
                .build();

        Response response = null;
        response = client.newCall(request).execute();

        System.out.println(response.body().string());
    }
}
