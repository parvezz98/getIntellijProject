package newpackage;

import java.util.Scanner;

public class TestPal {
    public static void main(String [] args){

        Scanner sc= new Scanner(System.in);
        String input=sc.next();
       // String input="racecarkayakanna";
        // annakayakracecar
        // "racecar","kayak","anna"
        input=input.toLowerCase();
        String mod="";
        String temp="";
        String firstPalin="";
        for (int i=input.length()-1;i>=0;i--){
            mod+=input.charAt(i);
        }
        System.out.println(mod);
        for (int k=0;k<mod.length();k++){

            temp=mod.substring(k,temp.length());

            for (int p=0;p<input.length();p++){

              //  if()






        }

    }
}}
