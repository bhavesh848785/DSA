package strings;

public class S4_StringBuilder {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < 26; i++) {
            char ch = (char) ('A' + i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
    }
}
