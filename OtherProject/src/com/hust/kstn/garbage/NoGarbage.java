package com.hust.kstn.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
    public static void main(String[] args) throws IOException {
        String fileName = "D:\\IT\\Java\\Oop\\OOPPROJECT\\OtherProject\\src\\com\\hust\\kstn\\garbage\\test.txt";
        byte[] inputBytes = {0};
        long startTime, endTime;

        inputBytes = Files.readAllBytes(Paths.get(fileName));
        startTime = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        startTime = System.currentTimeMillis();
        for (byte b : inputBytes) {
            sb.append((char) b);  // Sử dụng append, tránh garbage
        }
        String outputString = sb.toString();
        endTime = System.currentTimeMillis();
        System.out.println("Time: " + (endTime - startTime));

    }
}