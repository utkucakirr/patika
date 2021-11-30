import java.util.Scanner;
public class HarmonikSeri {
    public static void main(String[] args) {
        int n;
        double sonuc=0.0;
        Scanner input=new Scanner(System.in);
        System.out.print("n degerini giriniz: ");
        n=input.nextInt();
        for(double i=1;i<=n;i++){
            sonuc=sonuc+(1/i);
        }
        System.out.println("Sonuc= "+sonuc);
        input.close();
    }
}
