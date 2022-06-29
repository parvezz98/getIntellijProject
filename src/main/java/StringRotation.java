public class StringRotation {
    public static void main(String [] args){
        String given="Prashant";
        String Rotate="tnahsarP";
        String temp="";
        for(int i=Rotate.length()-1;i>=0;i--){
            temp+=Rotate.charAt(i);
        }
        //System.out.println(temp);
        if(given.equals(temp)){
            System.out.println("Its Roation");
        }
        else
            System.out.println("Its not Roation");
    }
}
