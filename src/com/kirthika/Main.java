package com.kirthika;

import java.util.*;

public class Main {

    static int count,max;

    public static void main(String[] args) {
	// write your code here
        count=0;
        max=0;
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0){
            convertToBinary(num);
        }
    }

    public static void convertToBinary(int num){

        if (num < 1) {
            max=(max<count)?count:max;
            System.out.print(max);
            return;
        }

        if (num %2==1){
            count+=1;
        } else{
            max=(max<count)?count:max;
            count=0;
        }
        convertToBinary(num/2);
    }
}
