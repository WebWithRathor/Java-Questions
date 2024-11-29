package topicString;

public class Q_Sort_the_Sentence {
    public static void main(String[] args) {
        String sentence = "a b c z w t f";
        String[] words = sentence.split(" ");
        for (int j = 0; j < words.length; j++) {
            for (int i = 1; i < words.length; i++) {
                if (words[i].compareTo(words[i - 1]) < 0) {
                    String temp = words[i];
                    words[i] = words[i - 1];
                    words[i - 1] = temp;
                }
            }
        }
        sentence = String.join(" ", words);
        System.out.println(sentence);
    }
}
