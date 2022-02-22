/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se150037.p00055;

import java.util.Scanner;

/**
 *
 * @author Huynh Trung Tin - SE150037
 */
public class Utils {

    public static String getString(String message) {
        String result = "";
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        do {
            System.out.print(message);
            String tmp = sc.nextLine();
            if (!tmp.isEmpty()) {
                result = tmp;
                check = false;
            }
        } while (check);
        return result;
    }

    public static int getInt(String message) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        do {
            try {
                System.out.print(message);
                result = Integer.parseInt(sc.nextLine());
                check = false;
            } catch (Exception e) {
                System.out.print("Error! Integer number: ");
            }
        } while (check);
        return result;
    }

    public static int getPositiveInt(String message) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        boolean check = false;
        do {
            try {
                System.out.print(message);
                result = Integer.parseInt(sc.nextLine());
                check = false;
            } catch (Exception e) {
                System.out.print("Error! Integer number: ");
            }
            if (result < 0) {
                System.out.println("Number must be great than 0! Try again:");
                check = true;
            } else {
                check = false;
            }
        } while (check);
        return result;
    }

    public static String updateString(String oldValue, String message) {
        String result = oldValue;
        Scanner sc = new Scanner(System.in);
        System.out.print(message);
        String tmp = sc.nextLine();
        if (!tmp.isEmpty()) {
            result = tmp;
        }
        return result;
    }
    
    public static void printMenu() {
        System.out.println("========= Bubble Sort program =========");
        System.out.println("1. Input Element");
        System.out.println("2. Sort Ascending");
        System.out.println("3. Sort Descending");
        System.out.println("4. Exit");
    }
}
