public class StringReverse {
    public static void main(String[]args){
        String s="Java is very easy";
        String [] arr=s.split(" ");
        int size=arr.length;


        for(int i= size-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
