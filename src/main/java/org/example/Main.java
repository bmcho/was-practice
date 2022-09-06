package org.example;

import java.io.IOException;

/**
 * Requesting GET (/calculate) RestAP And queryParams(operand1, operator, operand2)
 */
public class Main {
    public static void main(String[] args) throws IOException {
        new CustomWebApplicationsServer(8080).start();
    }
}