import java.util.Arrays;

public class TestBL {
    //1,0,0,1,0,0,1,1,1
    //0,0,0,0,1,1,1,1,1
    public static void main(String [] args){
        int [] inputData={1,0,0,1,0,0,1,1,1};
        int [] updated=new int[inputData.length];
        int temp=0;
        for (int i=0;i<inputData.length;i++){
//            if(inputData[i]==0){
//
//            }

            for(int j=1+i;j< inputData.length;j++){
                if(inputData[i]>inputData[j]){
                   temp= inputData[i];
                    inputData[i]=inputData[j];
                    inputData[j]=temp;
                    //inputData[i]=inputData[j];
                }
                else{

                }
            }
        }
        System.out.println(Arrays.toString(inputData));
       // System.out.println(Arrays.sort(inputData));
    }
}
