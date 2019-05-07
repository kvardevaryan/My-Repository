package com.bdg;

public class App_21 {


    public static void main(String[] args) {



        int a = 3;
        int b = 7;
        int c = 12;


        if (a < b) {
            if (a < c) {

                System.out.println("min : " + a);
            } else System.out.println("min : " + c);
        } else {
            if (b < c) {

                System.out.println("min : " + b);
            } else {
                System.out.println("min : " + c);
            }
        }


    }
}
