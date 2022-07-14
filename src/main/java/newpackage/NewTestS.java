package newpackage;

import java.util.Scanner;

public class NewTestS {
    public static void main(String [] ar){

        Scanner sc= new Scanner(System.in);
        String input=sc.next();
        //input= "aabaa" ==>  yes aa 2
        //"abcdabcaahaa" ==> yes abc 2 aa 2
        //"abcde" ==> no
        int index=0;
        int patterncount=0;
        String temp="";
        for(int i=0;i<input.length();i++){
            for(int k=1+i;k<input.length();k++) {
                if (input.charAt(i) ==input.charAt(k)){
                    temp+=input.charAt(i);

                }
                else if (input.charAt(i) !=input.charAt(k)){
                    index=i;

                    break;


                }
            }
        }
        System.out.println(temp);
        System.out.println(index);
        if(input.substring(0,index).contains(temp)==true){
            patterncount=2;
        }
       else if(input.substring(0,index).contains(temp)!=true){
            patterncount=1;
        }
        System.out.println(patterncount);
    }
}
