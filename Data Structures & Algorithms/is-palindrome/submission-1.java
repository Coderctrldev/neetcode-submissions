class Solution {
    public boolean isPalindrome(String s) {
        char[] arr= new char[s.length()];
        char[] reverse=new char[s.length()];
        int k=0;
        int r=0;
        for(int i=0;i<s.length();i++){
            char t=s.charAt(i);
            if(Character.isLetterOrDigit(t)) 
            {
                if(Character.isUpperCase(t)){
                t=Character.toLowerCase(t);
                }
                arr[k++]=t;
                }
        }
        for(int j=s.length()-1;j>=0;j--){
            char m=s.charAt(j);
            if(Character.isLetterOrDigit(m))
            {
                if(Character.isUpperCase(m)){
                m=Character.toLowerCase(m);
                }
                reverse[r++]=m;
                }
        }
        boolean d= (Arrays.equals(arr,reverse));
        return d ;

    }
}
