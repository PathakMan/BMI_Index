package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

        float Hieght_Pathak, Weight_Pathak, BMI_Pathak;

        BufferedReader Buffread= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("The Program will calculate your BMI");
        System.out.println("Enter your height in cm and press on enter");
        Hieght_Pathak = Float.parseFloat(Buffread.readLine())/100;
        System.out.println("Enter your Weight and press on enter");
        Weight_Pathak = Float.parseFloat(Buffread.readLine());

        BMI_Pathak = (float) (Weight_Pathak / (Math.pow(Hieght_Pathak, 2)));
        System.out.printf("Your BMI is: " +  "%2.2f, \n", BMI_Pathak);

        if(BMI_Pathak<16){

            System.out.println("You are Starving");

        } else if((BMI_Pathak >= 16)&&(BMI_Pathak < 16.99)){

            System.out.println("You are Emaciated");

        }   else if((BMI_Pathak >= 17)&&(BMI_Pathak < 18.49)){

        System.out.println("You are Emaciated");

        } else if((BMI_Pathak >= 18.50)&&(BMI_Pathak < 22.99)){

            System.out.println("You are Emaciated");

        } else if((BMI_Pathak >= 23)&&(BMI_Pathak < 24.99)){

            System.out.println("You are Emaciated");

        } else if((BMI_Pathak >= 25)&&(BMI_Pathak < 27.49)){

            System.out.println("You are Emaciated");

        } else if((BMI_Pathak >= 27.50)&&(BMI_Pathak < 29.99)){

            System.out.println("You are Emaciated");

        } else if((BMI_Pathak >= 30)&&(BMI_Pathak < 34.99)){

            System.out.println("You have 1st degree obesity");

        } else if((BMI_Pathak >= 35)&&(BMI_Pathak < 39.99)){

            System.out.println("You have 2nd degree obesity");

        } else if((BMI_Pathak > 40)){

            System.out.println("You have 3rd degree obesity");

        }





























    }
}
