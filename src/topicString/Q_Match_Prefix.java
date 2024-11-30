package topicString;


public class Q_Match_Prefix {
    public  static  int countWordsWithPrefix(String[] sarr ,String pref){
        int count = 0;
        for (String str : sarr) {
            if(str.startsWith(pref))count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String[] sarr = {"pay","attention","practice","attend"} ;
        String pref = "at";
        System.out.println("Total word count that have same pref are "+countWordsWithPrefix(sarr,pref));
    }
}
