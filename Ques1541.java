// 1541. Minimum Insertions to Balance a Parentheses String

class Solution {
    public int minInsertions(String s) {
        int insert = 0;
        int open = 0;

        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(') {
                if(open % 2 == 1) {
                    insert++;
                    open--;
                }
                open += 2;
            } else {
                open--;
                if(open < 0) {
                    insert++;
                    open = 1;
                }
            }
        }

        return insert + open;
    }
}