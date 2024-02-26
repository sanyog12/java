https://leetcode.com/problems/to-lower-case/submissions/1186670209/


class Solution {
    public String toLowerCase(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char x = s.charAt(i);
            if (x >= 'A' && x <= 'Z') {
                x = (char) (x + 32);
            }

            sb.append(x);
        }

        return sb.toString();
    }
}