package leetcode;
//
class Solution383 {
    public boolean canConstruct(String ransomNote, String magazine) {
        boolean bol=true;
        for(int i=1;i<magazine.length();i++){
            for(int j=0;j<=i;j++){
                if(magazine.substring(j,i+1)==ransomNote){
                    bol=true;
                }
                else{
                    bol=false;
                }
            }
        }
        return bol;
    }
    public static void main(String[] args){
        Solution383 sol=new Solution383();
        String a="123";
        String b="1234";
        boolean bol=sol.canConstruct(a,b);
        System.out.print(bol);
    }
}
