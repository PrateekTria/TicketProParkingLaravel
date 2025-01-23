package com.ticketpro.util;

import android.os.Handler;
import android.os.Looper;
import java.io.BufferedInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


// This code is changed by Prateek on 1/4/2024
public class DownloadLogoTask {
    private CallbackHandler callback;
    private String errorMessage;

    public void execute(String... urls) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        executor.execute(() -> {
            if (urls.length < 2) {
                errorMessage = "Insufficient arguments provided";
                notifyFailure(errorMessage);
                return;
            }

            String fileURL = urls[0];
            String targetFile = urls[1];

            try {
                downloadFile(fileURL, targetFile);
                notifySuccess("Done");
            } catch (Exception e) {
                errorMessage = "Error downloading file: " + e.getMessage();
                notifyFailure(errorMessage);
            }

            executor.shutdown();
        });
    }

    private void downloadFile(String source, String target) throws Exception {
        URL url = new URL(source);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();
        connection.connect();

        // Make sure the response code indicates success
        int responseCode = connection.getResponseCode();
        if (responseCode != HttpURLConnection.HTTP_OK) {
            throw new Exception("Failed to download file. HTTP response code: " + responseCode);
        }

        InputStream input = new BufferedInputStream(connection.getInputStream());
        FileOutputStream output = new FileOutputStream(target);

        byte[] data = new byte[1024];
        int bytesRead;
        while ((bytesRead = input.read(data)) != -1) {
            output.write(data, 0, bytesRead);
        }

        output.flush();
        output.close();
        input.close();

        connection.disconnect();
    }

    private void notifySuccess(String message) {
        new Handler(Looper.getMainLooper()).post(() -> {
            if (callback != null) {
                callback.success(message);
            }
        });
    }

    private void notifyFailure(String message) {
        new Handler(Looper.getMainLooper()).post(() -> {
            if (callback != null) {
                callback.failure(message);
            }
        });
    }

    public void setCallback(CallbackHandler callback) {
        this.callback = callback;
    }

    public interface CallbackHandler {
        void success(String message);
        void failure(String errorMessage);
    }
}
