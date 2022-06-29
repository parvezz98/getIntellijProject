public class RemoveSuplicateStringFromArray {
    public static void main(String []args){
        String given= "Is Java is very easy Java Java easy";
        given=given.toLowerCase();
        String str[]=given.split(" ");
        for (int i=0;i<str.length;i++){
            for(int j=0;j<str.length;j++){
                if(str[i].equals(str[j])){
                    if(i!=j){
                        str[i]="";
                    }
                }
            }
        }
        for (int k=0;k<str.length;k++) {
            if(str[k] !="")
                System.out.println(str[k]);
        }
    }
}
