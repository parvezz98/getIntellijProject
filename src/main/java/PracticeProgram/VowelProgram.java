package PracticeProgram;

public class VowelProgram {
    public static String vowelCount(String s){
        //Apple
        int count=0;
        int nonvowelCount=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='O'||s.charAt(i)=='I'|| s.charAt(i)=='U'){
                count++;
            } else if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='o'||s.charAt(i)=='i'|| s.charAt(i)=='u'){
                count++;
            }
            else {
                nonvowelCount++;
            }
        }
        System.out.println("Non Vowel Count is- "+nonvowelCount);
        String countt=String.valueOf(count);
        return countt;
    }
    public static void main(String [] args){
        System.out.println(vowelCount("Apple"));
    }
}
