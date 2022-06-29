public class Palindrome {
    public static void main(String [] args){
        String given="Madam";
        given=given.toLowerCase();
        String reverse="";
        for(int i=given.length()-1;i>=0;i--){
            reverse+=given.charAt(i);

        }
      // System.out.println("Rever>"+reverse);
        //System.out.println("Given>" +given);
        if(given.equals(reverse)){
            System.out.println("Yes its Palindrome");

        }
        else
            System.out.println("No Its not Palindrome");
    }

}
