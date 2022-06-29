public class DuplicateStringWordCount {
    public static void main(String [] args){
        String givenString= "Cyraxxx";
        givenString=givenString.toLowerCase();
        String temp="";
        int duplicateCount=0;
        for(int i=0;i<givenString.length();i++){
            if(temp.indexOf(givenString.charAt(i))==-1){
                temp+=givenString.charAt(i);
            }
            else
                duplicateCount++;

        }
        System.out.println(temp);//  Printing String Without Duplicate
        System.out.println("Duplcate Words in this strin are  > "+duplicateCount); // Duplicate word count
        //cyrax
        // Output= 2
    }
}
