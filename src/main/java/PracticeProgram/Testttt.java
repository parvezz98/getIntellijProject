package PracticeProgram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//input: arr[] = {2,0,2 1,6,0, 2, 1, 6,9,9,5,1}
      //  Output: - {2,1,6},{1,6,9},{9,5,1}
public class Testttt {
    public static void main(String [] argsss){

       int arr[] = {2,0,2, 1,6,0, 2, 1, 6,9,9,5,1};
       int sizee=0;
       for(int m=0;m<arr.length;m++){
           if(arr[m]!=0){
               sizee++;

           }
       }
     //   {2,0,1,6,9,5}
        // 2,0,1  //6,9,5
       int mod[]=new int[sizee];
       int y=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                mod[y++]=arr[i];
            }

        }
        System.out.println(Arrays.toString(mod));
        int sArray=mod.length/3;
        int increment=0;
        if(mod.length%3!=0){
            increment=1;
        }
        int upsArray=increment+mod.length/3;

        int [] arr1=new int[3];
        int [] arr2=new int[3];
        int [] arr3=new int[3];
        int [] arr4=new int[3];
        int a1=0;
        int a2=0;
        int a3=0;


        for(int k=0;k<=mod.length;k++){
            if(k>=0 && k<=02){
                arr1[k]=mod[k];
            }
            else if(k>=3 && k<=5){
                arr2[a1++]=mod[k];
            }
            else if(k>=6 && k<=8){
                arr3[a2++]=mod[k];
            }
            else if(k>=9 && k< mod.length){
                arr4[a3++]=mod[k];
            }

        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        System.out.println(Arrays.toString(arr3));
        System.out.println(Arrays.toString(arr4));
    }

}
