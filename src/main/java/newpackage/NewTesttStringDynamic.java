package newpackage;

import java.util.ArrayList;
import java.util.Stack;

public class NewTesttStringDynamic {

    public static void main(String [] ar) {
//        String input="Abcde";
        String input="Hello Parvez! Welcome to Livspace Done";
        String [] arStr=input.split(" ");
        ArrayList lst=new ArrayList<>();
        String temp="";
        String temp2="";
        Stack st=new Stack<>();
       int sizeTotal= arStr.length;
        System.out.println("Size is -"+sizeTotal);
       int num=0;
        for(int i= 0;i< arStr.length;i++){
            for(int k=arStr[i].length()-1;k>=0;k--){
                temp+=arStr[i].charAt(k);
            }
           temp+=" ";
        }
       // lst.add(temp);
        System.out.println(temp);
    }
}
