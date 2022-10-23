class Solution {
    public String mergeAlternately(String word1, String word2) {
        String s="";
        for(int i=0;i<word1.length();i++){
            for(int j=0;j<word2.length();j++){
                if(i==j){s=s+word1.charAt(i)+word2.charAt(j);}
                else if(i==word1.length()-1 && j>i){s=s+word2.charAt(j);}
                else if(j==word2.length()-1 && i>j){s=s+word1.charAt(i);}
            }
        }
        return s;
    }
}