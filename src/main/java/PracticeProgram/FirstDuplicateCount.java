package PracticeProgram;

import java.util.Locale;

public class FirstDuplicateCount {
    public static  void main(String []args){
        String s= "Hackthegame";
        String word="";
        s=s.toLowerCase();
        char[] scon=s.toCharArray();
        int index=-1;
        char f=' ';
        String temp="";
        String dupli="";
        for(int i=0;i<scon.length;i++){
            for(int j=i+1;j<scon.length;j++){
                if(scon[i]!=scon[j]){
                  //  System.out.println("If");
                    if(j==scon.length-1){
                       // System.out.println("Double");
                        dupli+=scon[i];
                    }

                } else if (scon[i]==scon[j]) {
                    //System.out.println("else if");
                    scon[j]='O';
                    break;
                }
                else{
                   // System.out.println("else");
                }
            }
          //  System.out.println(scon[i]+ "- Not in list");
            }

      System.out.println("Dupli -"+dupli);
//        System.out.println("Word -"+word);
       System.out.println("F +"+f);

    }



    }


