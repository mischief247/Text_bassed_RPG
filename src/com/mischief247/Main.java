package com.mischief247;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name= "";
        String gender = "";
        String height = "";
        Player mainChachter;
        int weight = 0;
        boolean isSetUp = false;

        while(!isSetUp) {
            query("Welcome adventurer what is your name?");
            name = sc.nextLine();
            query("nice to meet you " + name + " I'm getting old in my years and cant see to well are you a boy or  a girl?");
            gender = sc.nextLine();
            query("ahh so you're a " + gender);
            query("now to fill out your registration I need to know your weight and height nothing personal just a formality. so weight in Kilos if you please");
            weight = Integer.parseInt(sc.nextLine());
            query("and height?");
            height = sc.nextLine();
            query("ok so to confirm you are " + name);
            query("who is a " + gender + " of " + weight + " and  a height of " + height);
            query("is that correct?");
            String temp = sc.nextLine();
            if(temp.startsWith("y")){
                isSetUp = true;
            }
        }
        mainChachter= new Player(20,1,5,10,10,80,weight,0,0,name,gender,height);

    }
    private static void query(String s){
        System.out.println(s);
    }
}
