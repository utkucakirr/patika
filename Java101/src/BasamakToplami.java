import java.util.Scanner;
public class BasamakToplami {
    public static void main(String[] args) {
        int a = 1,sayi,toplam=0;
        Scanner input=new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        sayi=input.nextInt();

        while(a!=0){
            a=sayi%10;
            toplam=toplam+a;
            sayi=sayi/10;
        }

        System.out.println("Girilen sayinin basamak degerlerinin toplami: "+toplam);
    }
}
