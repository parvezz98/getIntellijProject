package PracticeProgram;

public class CcThisKeyWordAndRemoveDuplicateString {
    public static void main(String[] ar) {
        ThisKeyWordAndRemoveDuplicateString s = new ThisKeyWordAndRemoveDuplicateString();
        s.setAge(33);
        int a = s.getAge();
        System.out.println(a);
        EpamEmployee ep = new EpamEmployee();
        String str = "Java is java very easy is";
        str=str.toLowerCase();
        String unique = "";
        String Dupli = "";

        String[] arrStr = str.split(" ");
        for (int i = 0; i < arrStr.length; i++) {
            int count = 0;
            for (int j = i + 1; j < arrStr.length; j++) {
                if (!(arrStr[i]).equals(arrStr[j])) {
                    count++;
                } else {
                    arrStr[i] = "O";
                }
            }
            if (count > 0 && !arrStr[i].equals("O")) {
                unique += arrStr[i];
            }

            System.out.println("Dupli =" + Dupli);

        }
        System.out.println("Unioque =" + unique);
    }
}