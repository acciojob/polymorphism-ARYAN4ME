package com.driver;
import java.util.*;
public class Main {
    public static class Product{
        public int product(int x, int y) {
            return x*y;
        }
        public int product(int x, int y, int z) {
            return x*y*z;
        }
        public double product(double x, double y) {
            return x*y;
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double d = sc.nextDouble();
        double e = sc.nextDouble();
        Product p = new Product();
        p.product(a,b);
        p.product(a,b,c);
        p.product(d,e);
    }

}