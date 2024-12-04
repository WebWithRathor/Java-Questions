package topicString;

public class Q_Match_Prefix_Without_Method {

    public static int countWordsWithPrefix(String[] sarr, String pref) {
        int count = 0;
        for (String str : sarr) {
            for (int i = 0; i < pref.length(); i++) {
                if (pref.length() > str.length()) break;
                if (str.charAt(i) != pref.charAt(i)) {
                    break;
                }
                if (i == pref.length() - 1) count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] sarr = {"pay", "attention", "practice", "attend"};
        String pref = "at";
        System.out.println("Total word count that have same pref are " + countWordsWithPrefix(sarr, pref));
    }

}
