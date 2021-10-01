import java.util.Scanner;
public class Pratik16 {
    public static void main(String[] args) {
        int sayi,kuvvet,sonuc=1;
        Scanner input=new Scanner(System.in);
        System.out.print("Taban sayıyı giriniz: ");
        sayi = input.nextInt();

        System.out.print("Üssü giriniz: ");
        kuvvet = input.nextInt();

        for (int x = 1; x <= kuvvet; x++) {
            sonuc *= sayi;
        }
        System.out.println(sayi + "^" + kuvvet + ": " + sonuc);
    }
}
