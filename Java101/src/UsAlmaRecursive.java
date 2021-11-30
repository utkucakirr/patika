import java.util.Scanner;

public class UsAlmaRecursive {
    static int Us(int n, int m){
        if(m==1){
            return n;
        }
        return n*Us(n,m-1);
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.print("n: ");
        int n=input.nextInt();
        System.out.print("m: ");
        int m =input.nextInt();
        System.out.print("Sonuc: " + Us(n,m));
    }
}
