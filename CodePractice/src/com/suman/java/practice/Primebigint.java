package com.suman.java.practice;
import java.io.*;
import java.math.*;




public class Primebigint  {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String n = bufferedReader.readLine();
        BigInteger bnum=new BigInteger(n);
        System.out.println(bnum);
        if(bnum.isProbablePrime(20))
         System.out.println("prime");
         else
         System.out.println("not prime");
        bufferedReader.close();
    }
}


