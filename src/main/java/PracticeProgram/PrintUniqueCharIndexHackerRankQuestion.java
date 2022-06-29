package PracticeProgram;

import java.util.Locale;

public class PrintUniqueCharIndexHackerRankQuestion {
    public static int indexOfUniqueChar(String s){
        int indexx=-1;
        char c;
        String unique="";
        s=s.toLowerCase();
      //  int y=s.indexOf('c');
        char[] conS=s.toCharArray();
        for (int i=0;i<conS.length;i++){
            int count=0;
            for (int j=0;j<conS.length;j++){
                if(i!=j){
                    if(conS[i]==conS[j]){
                        count++;
                    }
                }
            }

            if(count==0){
               // c=conS[i];
                unique+=conS[i];
                System.out.print(conS[i]);
            }
        }
       // c=unique.charAt(0);
        System.out.println();
        System.out.println(unique);

        if(unique.isEmpty()==true)
        {return -1;}
        else{
            return s.indexOf(unique.charAt(0));
        }
    }
    public static void main(String []arg){
        //indexOfUniqueChar("falafal");
        int inx=indexOfUniqueChar("gagaga");
        System.out.println(inx);
    }
}
