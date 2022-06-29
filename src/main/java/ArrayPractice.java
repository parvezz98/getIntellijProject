public class ArrayPractice {
    public static void main(String [] args) {
        String[] arr = new String[5];
        arr[0] = "Rain";
        arr[1] = "Jax";
        arr[2] = "Max";
        arr[3] = "Rain";
        arr[4] = "Rain";
        String temp="";
        for (String h:arr) {
            System.out.println(h);
            temp=temp+h+"*";

        }
        System.out.println(temp);
        String supertemp="";
        for (int i=0;i<temp.length();i++){
            if(supertemp.indexOf(temp.charAt(i))==-1){
                supertemp+=temp.charAt(i);
            }
        }
        System.out.println("Modification>" +supertemp);
    }
}
