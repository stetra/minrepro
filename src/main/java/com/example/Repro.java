package com.example;

import com.google.cloud.monitoring.v3.MetricServiceClient;

import java.io.IOException;

public class Repro {
    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("Crash will occur on next line");
        MetricServiceClient metricServiceClient = MetricServiceClient.create();
    }
}
