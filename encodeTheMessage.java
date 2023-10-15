https://www.codingninjas.com/studio/guided-paths/data-structures-algorithms/content/118626/offering/1377976?leftPanelTab=0


public class Solution {
    public static String encode(String message) {
        if (message == null || message.isEmpty()) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int count = 1;

        for (int i = 0; i < message.length(); i++) {
            if (i < message.length() - 1 && message.charAt(i) == message.charAt(i + 1)) {
                count++;
            } else {
                sb.append(message.charAt(i));
                sb.append(count);
                count = 1;
            }
        }

        return sb.toString();
    }
}
