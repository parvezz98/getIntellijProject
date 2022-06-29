public class KangarooHacker {
    public static void main(String []args){
        int x1=0;
        int v1=2;
        int ev1=v1;
        int x2=5;
        int v2=3;
        int ev2=v2;
    int i=1;
        int h=0;
        v1=x1+v1;
        v2=x2+v2;
       // v1=v1+ev1;
      //  v1=v1+ev1;
      //  v1=v1+ev1;
       String value="";
        if( v1 % v2==0){
            System.out.println("Yes");
          value="Yes";
        }
        else {
            System.out.println("no");
            value="No";
        }

        for(int j=0;j<=10;j++){

            System.out.println("v1> "+(v1=v1+ev1));
            System.out.println("v2> "+(v2=v2+ev2));
            System.out.println("Reminder is > "+(v1=v1+ev1) % (v2=v2+ev2));
            if( (v1=v1+ev1) % (v2=v2+ev2)==0){
                System.out.println("Yes");
                value="Yes";
                break;
            }
            else {
                System.out.println("no");
                value="no";
            }
        }
    }
}
