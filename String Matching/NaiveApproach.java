public class NaiveApproach {

    public static void main(String args[]) {
        String text = "Hello There, Arnav this side, its glad to meet you";
        String pattern = "Arnav";

        for (int i = 0; i<=text.length()-1; i++) {
            int j;
            for (j = 0;j<pattern.length(); j++) {
                if (text.charAt(i+j)!=pattern.charAt(j)) {
                    break;
                }
            }
            if (j == pattern.length()) {
                System.out.println("Pattern found at index " + i);
                break;
            }
        }
    }
}