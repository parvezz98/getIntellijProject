package newpackage;

public class Test22 {
    public static void main(String [] args){

        String input= "habbaqqq";
        input=input.toLowerCase();
        String temp="";
        String mod="";  //qqqabbah

        for(int h=input.length()-1;h>=0;h--){

            mod+=input.charAt(h);

        }
        String longestPali="";
        for(int i=0;i<input.length();i++){
          temp=mod.substring(i,mod.length());
            for(int k=temp.length()-1;k>=0;k--){

                String temp1=temp.substring(0,k);
                if(input.contains(temp1) && temp1.length()>longestPali.length()){
                   longestPali=temp1;

                }
//                if(input.charAt(i)==input.charAt(k)){
//
//                    //temp+=input.charAt(i);
//                }

            }

        }
        System.out.println(longestPali);
    }
}
