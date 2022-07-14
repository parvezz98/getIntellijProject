package newpackage;

public class ArrayP {
    public static void main(String [] args){

        int [] arr={1,2,3,4,5,6,7,8,9,10};
        int k=1002;
       int element = 5;

       for (int i=0;i<arr.length;i++){


       }
       switch (k){

           case 0:

               for (int i=0;i<arr.length;i++){
                   if(arr[i]==element){
                       System.out.println(i);
                   }

               }
           case 1:

               for (int i=arr.length-1;i>=0;i--){
                  if(arr[i]==element){
                      System.out.println(i);
                  }

               }
           case 2:
               for (int i=arr.length-2;i>=0;i--){

                   if(arr[i]==element){
                       System.out.println(i);
                   }
               }
       }

    }
}
