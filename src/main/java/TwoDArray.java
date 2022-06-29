public class TwoDArray {
    public static void main(String[]args){


        int diff;
        int [][]arr= new int[3][3];
        arr[0][0]=6; //1
        arr[0][1]=4;
        arr[0][2]=8;//l2

        arr[1][0]=4;
        arr[1][1]=5;//2  //l2
        arr[1][2]=4;

        arr[2][0]=2; //l1
        arr[2][1]=4;
        arr[2][2]=1;//3
      //  System.out.println(arr.length);
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
              //  System.out.println(i);
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
       int lr= arr[0][0]+arr[1][1]+arr[2][2];
        int rl=arr[0][2]+arr[1][1]+arr[2][0];
        System.out.println("lr >"+lr);
        System.out.println("rl >"+rl);
       // int size=Math.abs(lr*rl);
        System.out.println(rl%lr);
     if(rl>lr){
        diff = rl-lr;
     }
     else {
         diff=lr-rl;
     }
        System.out.println("Difference is  > "+diff);

    }
    public static int diff(){
        System.out.println("Cyrax");
    return 4;
    }

}
