package org.example;

import org.example.cs1.CS1Console;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        while (flag){
            System.out.println("q for quit or number i for cs{i}demo {i}s/{i}p");
            String next = scanner.nextLine();
            switch (next){
                case "q":
                    flag=false;
                    break;
                case "1s":
                    System.out.println("CS1Console start");
                    CS1Console.start();
                    break;
                case "1e":
                    CS1Console.stopDemo();
                    break;
                default:
                    System.out.println("请重新输入");
            }
        }
    }
}