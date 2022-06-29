public class RemoveDuplicateFromString
{
    public static void main(String [] args){
        String real="Ttttttttttotallllllllllllllllllllllllllllllllllll";
        real = real.toLowerCase();
        String temp="";
        System.out.println(real.length());
        for(int i=0;i<real.length();i++){
            if(temp.indexOf(real.charAt(i))==-1){
            temp+=real.charAt(i);
            }
        }
        System.out.println("The Real is>  "+real);
        System.out.println("After the modification> "+temp);
    }
}
