package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String s1 = "abcdef";
        String s2 = "123@#$!";
        String[] stringArr = {"abc","def","ghi"};

//        System.out.println(s1.length());
//        System.out.println(s2.length());
//        System.out.println(stringArr.length);

        char c1 = 'a';
//        System.out.println(s1.charAt(0));
//        System.out.println(s1.charAt(5));
////        System.out.println(s1.charAt(6));
//        System.out.println(s1.charAt(s1.length()-1));
//        printLastChar(s1);
//        printLastChar(s2);
//        printLastChar(stringArr[0]);

//        char c2 =  getLastChar(s1);
//        System.out.println(c2);
//        System.out.println(getLastChar(s1));

//        System.out.println(s1.substring(0,1));
//        System.out.println(s1.substring(0,2));
//        System.out.println(s1.substring(0,3));

        System.out.println("Pls write the first string");
        String s3 = scanner.nextLine();
        System.out.println("Pls write the second string");
        String s4 = scanner.nextLine();

        if (s3.equals(s4)){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    static void printLastChar (String str){
        System.out.println(str.charAt(str.length()-1));
    }

    static char getLastChar (String str){
        return str.charAt(str.length()-1);
    }
}
