package RECERSSION;

public class FindPowDemo {
    public static void main(String[] args) {
        int res = pow(10,3);
        System.out.println(res);
    }
    public static int pow(int a,int n){
        if(n==0) return 1;
       return a*pow(a,n-1);

    }
}
