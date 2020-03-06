package com.company;

import java.util.*;

class student{

    Scanner sobj = new Scanner(System.in);
    String usn, name, branch, phone ;


    void read_info() {
        System.out.println("Enter usn : ");
        usn = sobj.nextLine();

        System.out.println("Enter name : ");
        name = sobj.nextLine();

        System.out.println("Enter branch : ");
        branch = sobj.nextLine();

        System.out.println("Enter phone : ");
        phone = sobj.nextLine();
    }


    void write_info() {
        System.out.println(usn+"\t\t\t"+name+"\t\t\t\t"+branch+"\t\t\t\t"+phone);
    }

}


class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n,i;
        System.out.println("Enter no. of students");
        n = in.nextInt();

        student []s = new student[n];  // creating student type array.

        for(i=0;i<n;i++)
            s[i] = new student(); // Initializing objects of Students class.


        for(i=0;i<n;i++)
        {
            System.out.println("Enter "+(i+1)+" student details:");
            s[i].read_info();
        }


        System.out.println("USN\t\t\t\tNAME\t\t\t\tBRANCH\t\t\tPHONE");
        for(i=0;i<n;i++)
            s[i].write_info();


    }
}
