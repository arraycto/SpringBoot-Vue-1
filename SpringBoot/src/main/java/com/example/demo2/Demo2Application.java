package com.example.demo2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Demo2Application {

    public static void main(String[] args) {
        System.out.println("__     __    _                         \n" +
                "\\ \\   / /   (_)                        \n" +
                " \\ \\_/ /   _ ___      ____ _  ___ _ __ \n" +
                "  \\   / | | | \\ \\ /\\ / / _` |/ _ \\ '__|\n" +
                "   | || |_| | |\\ V  V / (_| |  __/ |   \n" +
                "   |_| \\__,_|_| \\_/\\_/ \\__, |\\___|_|   \n" +
                "                          | |          \n" +
                "                          |_|          ");
        SpringApplication.run(Demo2Application.class, args);
    }

}
