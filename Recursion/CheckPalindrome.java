public class CheckPalindrome {
    public static void main(String args[]){
        String text="MADAM";
        boolean result= isPalindrome(0,text.length(),text);
        System.out.println("Result:"+result);
    }
    static boolean isPalindrome(int i, int n, String data){
        if(i>n/2){
            return  true;
        }
        if(data.charAt(i)!=data.charAt(n-i-1)){
            return false;
        }
        return isPalindrome(i+1, n, data);
    }
}
