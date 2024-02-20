package RECERSSION;

public class FibonacciDemo {
    public static void main(String[] args) {
        int fib_num = fibo(10);
        System.out.println(fib_num);
    }
    public static int fibo(int n){
        if(n<=1) return n;
        return fibo(n-1)+fibo(n-2);

    }
}
