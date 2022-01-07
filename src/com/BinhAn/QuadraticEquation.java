package com.BinhAn;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;
    private double delta;
    public QuadraticEquation(double a, double b, double c){
        this.a=a;
        this.b=b;
        this.c=c;
    }

    public void setDelta(double delta) {
        this.delta = delta;
    }

    public double getDelta() {
        return delta;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }



    public double getDiscriminant(){
        return delta = b*b-4*a*c;
    }
    public double getRoot1(){
        return (-b+Math.pow(delta, 0.5))/2*a;
    }
    public double getRoot2(){
        return (-b-Math.pow(delta, 0.5))/2*a;
    }
}
