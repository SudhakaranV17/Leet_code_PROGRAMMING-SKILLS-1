public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        short counter=0;
        String result=Integer.toBinaryString(n);
        for(int i =0;i<result.length();i++){
            if(result.charAt(i)=='1'){
                counter++;
            }
        }
        return counter;
    }
}