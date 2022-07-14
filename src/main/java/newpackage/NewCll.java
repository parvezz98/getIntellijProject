package newpackage;

import java.util.ArrayList;
import java.util.Stack;

public class NewCll {
    public static void main(String [] ar){
//        String input="Abcde";
//        //
//        String temp2="";
//        char [] temp=input.toCharArray();
//        Stack st= new Stack<>();
//        for(int i=temp.length-1;i>=0;i--){
//           temp2+=input.charAt(i);
//
//        }
//        st.add(temp2);
//        System.out.println(st);


      // input--->"Hello Parvez"
        // ouput---> "olleH zevraP"
        String input="Hello Parvez";
     //"Hello Parvez! Welcome to Livspace"

        ArrayList arl= new ArrayList<>();
        String [] arStr=input.split(" ");
        String temp="";
        String temp2="";
        for (int i=arStr[0].length()-1;i>=0;i--){
            temp+=arStr[0].charAt(i);

        }
        for (int k=arStr[1].length()-1;k>=0;k--){
            temp2+=arStr[1].charAt(k);

        }
        String asStringPrint= temp + " "+ temp2;
        arl.add(temp);
        arl.add(temp2);

        System.out.println(arl);
        System.out.println(asStringPrint);


    }
}
