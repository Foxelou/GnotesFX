package org.openjfx.sio2E4.service;

import java.net.HttpURLConnection;
import java.net.URL;

public class NetworkService {
    public static boolean isOnline() {
        try {
            var url = new URL("http://localhost:8080");
            var conn = (HttpURLConnection) url.openConnection();
            conn.setConnectTimeout(2000);
            conn.connect();
            return conn.getResponseCode() == 200;
        } catch (Exception e) {
            return false;
        }
    }
}

