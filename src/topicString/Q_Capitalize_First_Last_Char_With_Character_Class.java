package topicString;

public class Q_Capitalize_First_Last_Char_With_Character_Class {
    public static String[] capitalFirstLastChar(String[] sarr){
        for(int i =0 ; i<sarr.length ; i++){
            sarr[i] = Character.toUpperCase(sarr[i].charAt(0)) + sarr[i].substring(1,sarr[i].length()-1)+ Character.toUpperCase(sarr[i].charAt(sarr[i].length()-1));
        }
        return sarr;
    }

    public static void main(String[] args) {
        String str = "Hello bhai kaise ho";
        System.out.println(String.join(" " , capitalFirstLastChar(str.split(" "))));
    }
}
