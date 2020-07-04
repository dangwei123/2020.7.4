给定一个只包含 '(' 和 ')' 的字符串，找出最长的包含有效括号的子串的长度。
class Solution {
    public int longestValidParentheses(String s) {
        int n=s.length();
        int[] dp=new int[n];
        int ret=0;
        for(int i=1;i<n;i++){
            if(s.charAt(i)==')'){
                int j=i-dp[i-1]-1;
                if(j>=0&&s.charAt(j)=='('){
                    dp[i]=dp[i-1]+2+(j>0?dp[j-1]:0);
                    ret=Math.max(ret,dp[i]);
                }
            }
        }
        return ret;
    }
}