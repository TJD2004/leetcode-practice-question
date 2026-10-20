// 151. Reverse Words in a String

// class Solution {
//     public String reverseWords(String s) {
//         String ans = "";
//         int n = s.length();
//         String temp = "";
//         for (int i = n - 1; i >= 0; i--) {
//             char ch = s.charAt(i);
//             if (ch == ' ' && !temp.isEmpty()) {
//                 if (!ans.isEmpty()) {
//                     ans += " ";
//                 }
//                 ans += temp;
//                 temp = "";
//             } else if (ch == ' ' && temp.isEmpty()) {
//                 continue;
//             } else {
//                 temp = ch + temp;
//             }
//         }

//         if (!temp.isEmpty()) {
//             ans = ans + " "+ temp;
//         }

//         return ans.trim();
//     }
// }

class Solution {
    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int i= s.length()-1;

        while(i >= 0) {
            while(i >=0 && s.charAt(i) == ' '){
                i--;
            }
            
            if(i < 0) {
                break;
            }

            int j = i;
            while(j >= 0 && s.charAt(j) != ' '){
                j--;
            }

            ans.append(s.substring(j+1, i+1));

            while(j >=0 && s.charAt(j) == ' ') {
                j--;
            }

            if(j >= 0) {
                ans.append(' ');
            }

            i = j;
        }

        return ans.toString();
    }
}