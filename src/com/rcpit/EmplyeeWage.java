package com.rcpit;

import java.util.Random;

public class EmplyeeWage {
    public static void main(String[] args) {
        Random random = new Random();
        int a = random.nextInt() % 2;
        if(a == 0){
            System.out.println("Employee is Absent");
        }else{
            System.out.println("Employee is present");
            int b = random.nextInt() % 2;
            if(b == 0){
                System.out.println("Employee is Part time");
            }else{
                System.out.println("Employee is Full time");
            }
        }
    }
}

