package org.example;

import lombok.extern.slf4j.Slf4j;
import org.example.http.HttpConsole;

import java.util.Scanner;

@Slf4j
public class ServerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        switch (s){
            case "http":
                log.info("http start");
                HttpConsole.start();
                break;
            default:
                break;
        }
    }


}