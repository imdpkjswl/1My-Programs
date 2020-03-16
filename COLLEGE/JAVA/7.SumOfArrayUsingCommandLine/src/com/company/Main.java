package com.company;

public class Main {

    public static void main(String[] args) {

        int i,sum=0,num;

        for(i=0;i<args.length;i++){
            num = Integer.parseInt(args[i]);
            sum += num;
        }

        System.out.println("Sum  of CMD Values :  "+sum);

    }
}
