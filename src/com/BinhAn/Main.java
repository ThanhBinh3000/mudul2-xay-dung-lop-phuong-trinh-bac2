package com.BinhAn;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("mời nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("mời nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("mời nhập c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a,b,c);
        System.out.println(  "đen ta = " + quadraticEquation.getDiscriminant());
        double number = quadraticEquation.getDiscriminant();
        if (number>0){
            System.out.println("x1= " + quadraticEquation.getRoot1());
            System.out.println("x2= "+ quadraticEquation.getRoot2());
        }else if (number==0){
            System.out.print("X = "+ -b/2*a);
        }else {
            System.out.print("phương trình vô nghiện");
        }
    }
}
