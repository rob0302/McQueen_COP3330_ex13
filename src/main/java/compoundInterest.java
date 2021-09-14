/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 ROBERT MCQUEEN
 */
import java.util.Scanner;
import java.lang.Math;
public class compoundInterest {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle: ");
        double princi = sc.nextDouble();

        System.out.print("Enter the rate of interest (as a percent): ");
        double interest = sc.nextDouble();
        double interestDeci = interest/100.00;

        System.out.print("Enter the number of years: ");
        int time = sc.nextInt();

        System.out.print("What is the number of times the interest is compounded each year: ");
     int comTime = sc.nextInt();

double p1 = (1+(interestDeci/comTime));
double p2 = comTime * time;
double p3 = Math.pow(p1,p2);
double endInvest = (princi * p3);


      System.out.print("$"+princi+" invested at "+interest+"% for "+time+" years compunded "+comTime+" times per year is $"+(float)endInvest);
    }
}
