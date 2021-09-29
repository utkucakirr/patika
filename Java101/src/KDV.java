import java.util.Scanner;
public class KDV {
    public static void main(String[] args) {
        double fiyat, kdv18=0.18,kdv8=0.08, kdv, kdvMiktar, kdvliFiyat;
        Scanner inp=new Scanner(System.in);
        System.out.print("Urun fiyatini giriniz: ");
        fiyat=inp.nextDouble();

        boolean kosul1=fiyat>=0;
        boolean kosul2=fiyat<=1000;
        boolean sonuc=kosul1&&kosul2;

        kdv=sonuc?kdv18:kdv8;
        kdvMiktar=fiyat*kdv;
        kdvliFiyat=fiyat+kdvMiktar;

        System.out.println("KDV tutari: " +kdvMiktar);
        System.out.println("KDV dahil fiyat: " +kdvliFiyat);
    }
}
