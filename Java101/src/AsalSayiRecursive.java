import java.util.Scanner;

public class AsalSayiRecursive {

    static int PrimeNum(int n, int k){
        if(k<n){
            if(n%k==0){
                return 0;
            }else{
                return PrimeNum(n,k+1);
            }
        }
        return 1;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("n: ");
        int n=input.nextInt();
        if(PrimeNum(n,2)==0){
            System.out.print(n + " asal sayi degildir.");
        }else{
            System.out.print(n + " asal sayidir.");
        }
        input.close();
    }
}
