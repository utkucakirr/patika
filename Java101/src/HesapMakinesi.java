import java.util.Scanner;
public class HesapMakinesi {
    public static void main(String[] args) {
        double sayi1,sayi2;
        int islem;
        Scanner input=new Scanner(System.in);
        System.out.print("1. sayiyi giriniz: ");
        sayi1= input.nextDouble();
        System.out.print("2. sayiyi giriniz: ");
        sayi2= input.nextDouble();

        System.out.println("1-Toplama\n2-Cikarma\n3-Carpma\n4-Bolme");
        System.out.print("Seciminiz: ");
        islem= input.nextInt();
        switch (islem){
            case 1:
                System.out.println("Islem sonucu: " + (sayi1+sayi2));
                break;
            case 2:
                System.out.println("Islem sonucu: " + (sayi1-sayi2));
                break;
            case 3:
                System.out.println("Islem sonucu: " + (sayi1*sayi2));
                break;
            case 4:
                System.out.println("Islem sonucu: " + (sayi1/sayi2));
                break;
            default:
                System.out.println("Hatali secim.");
                break;
        }
    }
}
