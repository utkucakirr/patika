import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("n: ");
        n=input.nextInt();

        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int l=0;l<=2*n-2*i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
