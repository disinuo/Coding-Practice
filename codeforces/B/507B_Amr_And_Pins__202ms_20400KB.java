package com.company;
import java.util.ArrayList;
import java.lang.Math;
import java.util.Scanner;
//202 ms 	20400 KB
public class Demo {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int x0=sc.nextInt();
        int y0=sc.nextInt();
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        int count=0;
        double square_root=Math.sqrt(Math.pow((x0-x1),2)+Math.pow((y0-y1),2));
        double r_2=r*2;
        count=(int)Math.ceil(square_root/r_2);
        System.out.print(count);
    }
}
