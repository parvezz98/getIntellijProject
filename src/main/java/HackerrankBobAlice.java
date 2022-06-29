import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HackerrankBobAlice {
    public static void main(String []args){
        List<Integer> a =new ArrayList<Integer>();
        List<Integer> b=new ArrayList<Integer>();
        a.add(17);
        a.add(28);
        a.add(30);

        b.add(99);
        b.add(16);
        b.add(8);
       // int []arr=new int [2];
       // List<Integer> arr= new ArrayList<>();
        int arr[]=new int [2];
        for(int i=0;i<3;i++) {
            if (a.get(i) > b.get(i)) {
                // arr.add(0, x);
                arr[0] = arr[0] + 1;
            }
        }
            for (int j = 0; j < 3; j++) {
                if (b.get(j) > a.get(j)) {
                    //arr.add(1, y);
                    arr[1]=arr[1]+1;
                }

            }
        System.out.println(Arrays.toString(arr));
        List<Integer> lst= new ArrayList<Integer>();
        lst.add(0,arr[0]);
        lst.add(1,arr[1]);

        System.out.println(lst);
        }

    }
