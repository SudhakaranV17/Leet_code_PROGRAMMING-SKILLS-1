class Solution {
    public boolean isAnagram(String s, String t) {
        char[] ch1=s.toCharArray();
        Arrays.sort(ch1);
        char[] ch2=t.toCharArray();
        Arrays.sort(ch2);
        boolean res=Arrays.equals(ch1, ch2);
        return res;
    }
}