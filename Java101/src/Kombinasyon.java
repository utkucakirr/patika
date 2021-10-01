import java.util.Scanner;
public class Kombinasyon {
    public static void main(String[] args) {
        int n,r,f1=1,f2=1,f3=1;
        Scanner inp=new Scanner(System.in);
        System.out.print("n degerini giriniz: ");
        n=inp.nextInt();
        System.out.print("r degerini giriniz: ");
        r=inp.nextInt();

        for(int i=1;i<=n;i++){
            f1=f1*i;
        }
        for(int i=1;i<=r;i++){
            f2=f2*i;
        }
        for(int i=1;i<=(n-r);i++){
            f3=f3*i;
        }

        double comb=f1/(f2*f3);
        System.out.println("Kombinasyon degeri: " +comb);
    }
}
