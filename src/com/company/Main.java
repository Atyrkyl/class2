package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        String name = "Atyra";
        int age = 27;
        int temp = +15;

        if (age < 19 || age > 46 || temp >(+30) || temp <(-20)){

            System.out.println("Можно идти гулять");
        }
        else if (age > 20 || temp > 28 || temp < 0){

            System.out.println("Можно гулять");
        }
        else if (age <45 || temp <(-10) || temp >25){
            System.out.println("Можно идти гулять");
        }

    }
}