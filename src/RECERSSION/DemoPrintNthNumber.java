package RECERSSION;

public class DemoPrintNthNumber {
    public static void main(String[] args) {
        PrintNthNumber(10);
    }
    public static void PrintNthNumber(int n){
        if(n!=0){
            System.out.println(n);
            PrintNthNumber(n-1);

        }
    }
}
