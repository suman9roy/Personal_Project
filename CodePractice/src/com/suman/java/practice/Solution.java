package com.suman.java.practice;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        String s;
        while(sc.hasNext()){
            s=sc.nextLine();
            if(s.length()%2!=0 || s.charAt(0)=='}'|| s.charAt(0)==']'||s.charAt(0)==')')
            System.out.println("false");
            else
            System.out.println("true");
        }
   
 
    }
}
