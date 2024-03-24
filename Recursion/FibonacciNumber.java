class FibonacciNumber{
    public static void main(String args[]){
        int n=10;
        int ans=fibonacii(n);
        System.out.println(ans);
    }

    static int fibonacii(int n){
        if(n<=1){
            return n;
        }
        return fibonacii(n-1)+fibonacii(n-2);
    }
}