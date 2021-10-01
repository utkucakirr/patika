import java.util.Scanner;
public class Kuvvetler {
    public static void main(String[] args) {
        int sayi,sayac=0;
        System.out.print("Lütfen bir sınır değeri giriniz: ");
        Scanner inp=new Scanner(System.in);
        sayi = inp.nextInt();

        System.out.println("4'ün katları\n");

        for (int y = 1; y <= sayi; y *= 4) {
            System.out.println(4 + "^" + sayac + " = " + y);
            sayac++;
        }
        sayac=0;
        System.out.println("5'in katları\n");

        for (int z = 1; z <= sayi; z *= 5) {
            System.out.println(5 + "^" + sayac + " = " + z);
            sayac++;
        }
    }
}
