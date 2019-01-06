package com.company;

import java.util.ArrayList;
import java.util.Scanner;
public class Demo {

    public static void main(String[] args) {
        int max=20000;
        int straight=0;
        Boolean result=false;
        Boolean outOfRange=false;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int distance=sc.nextInt();
            String direction=sc.next();
            switch (direction){
                case "South":
                   straight+=distance;
                    break;
                case "North":
                    straight-=distance;
                    break;
                default:
                    if(straight==0||straight==max){
                        outOfRange=true;
                    }

            }
            if(straight<0||straight>max){
                outOfRange=true;
            }
        }
        if(straight==0&&!outOfRange) result=true;

        if(result) System.out.print("YES");
        else System.out.print("NO");

    }
}
