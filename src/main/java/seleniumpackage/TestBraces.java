package seleniumpackage;

public class TestBraces {
    public static  void main(String [] args) {
        System.out.println(checkBraces("{}}()[]"));
    }
    public static boolean checkBraces(String g){
       // String g="{}{}(]";
        int count1=0; int count11=0;
        int count2=0; int count22=0;
        int count3=0; int count33=0;

        char [] ch= g.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='('){
                count1++;
            }
            if(ch[i]=='{'){
                count2++;
            }
            if(ch[i]=='['){
                count3++;
            }
            if(ch[i]==')'){
                count11++;
            }
            if(ch[i]==']'){
                count33++;
            }
            if(ch[i]=='}'){
                count22++;
            }
        }
        if(count1==count11 && count2==count22 &&count3==count33){
            return true;
        }

        else
            return false;
    }
}
