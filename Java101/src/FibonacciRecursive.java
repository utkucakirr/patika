import java.util.Scanner;

public class FibonacciRecursive {
    static int Fibonacci(int number) {
    if(number==1 || number==2){
        return 1;
    }
    return Fibonacci(number-1) + Fibonacci(number-2);
}
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("n: ");
        int n=input.nextInt();
        int fibo=Fibonacci(n);
        System.out.print(fibo);
    }


}
