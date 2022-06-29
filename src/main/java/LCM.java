public class LCM {
    public static void main(String [] args){
        int gcd=0;
  int arr[]={2,7};
  int lcm= arr[0]*arr[1];
  System.out.println(lcm);
        if(lcm%arr[0]==0 && lcm%arr[1]==0){
            System.out.println("Yes varified");
        }
        int Arr2smallest;
        int []arr2={24,36};
        if (arr2[0] > arr2[1]) {
            Arr2smallest=arr2[1];
        }
        else {
            Arr2smallest=arr2[0];
        }
        String name="Ray";
        String name2="uu";
        System.out.println(name+"Feiek os"+name2);

       // System.out.println(Arr2smallest);
        for(int i=2;i<Arr2smallest;i++)
        {
         if(arr2[0]%i==0 && arr2[1]%i==0){
             gcd=i;
         }
        }
        System.out.println("GCD >"+gcd);
    }
}
