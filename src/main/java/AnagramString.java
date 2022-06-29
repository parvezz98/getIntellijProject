import java.util.Arrays;

public class AnagramString {
    public static void main(String [] arg){
        String s1="Grab"; //'g','r','a','b'
        String s2="Brga";
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();
        if (s1.length()!=s2.length())
        {
            System.out.println("Not Anagram");
        }
        else{
            char [] s1c=s1.toCharArray();
            char [] s2c=s2.toCharArray();
            Arrays.sort(s1c);
            Arrays.sort(s2c);
            if(Arrays.equals(s1c,s2c)==true){
                System.out.println("Both the strings are anagram");
            }
            else{
                System.out.println("Both the strings are not anagram");
            }
        }



    }
}
