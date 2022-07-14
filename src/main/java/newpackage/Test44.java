package newpackage;

import java.util.ArrayList;
import java.util.HashMap;

public class Test44 {
    public static void main(String [] args) {


        //My nam2e is parve4ez
        //zeevra2p si eman 4yM

        String input=
                "My nam2e is parve4ez";
        String mod="";
        String temp="";
        ArrayList<Integer> lst=new ArrayList<Integer>();
        //HashMap<Integer, Integer>
        char []str=input.toCharArray();

       ArrayList ne= new ArrayList<>();
        for(int p=0;p<input.length();p++){

            if (Character.isDigit(str[p])){

                lst.add(p);
            }

        }

        for(int i=str.length-1;i>=0;i--){
            if (Character.isDigit(str[i])==false){

                ne.add(str[i]);
            }


        }

        System.out.println(lst);
        System.out.println(ne);
        for(int z :lst)
        {

            ne.add(z,input.charAt(z));

        }

        System.out.println(ne);
    }

}
