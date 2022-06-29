package PracticeProgram;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class RefixOnlyUniqueChar {
    public static void main(String [] args) {
        Scanner sc= new Scanner(System.in);
        String str = sc.nextLine();
        char value = 0;

        String str1[] = str.split(" ");
        System.out.println(Arrays.toString(str1));

        for (int k=0;k<str1.length;k++){

            char string[] = str1[k].toLowerCase().toCharArray();

            for (int i=0;i<string.length;i++){
                int count=0;
                for (int j=0;j<string.length;j++){
                    if(i!=j){
                        if(string[i]==string[j]){
                            count++;
                        }
                    }
                }

                if(count==0){
                    System.out.print(string[i]);
                }
            }
            System.out.print(" ");

        }
                        }
                    }
