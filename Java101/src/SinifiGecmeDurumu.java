import java.util.Scanner;
public class SinifiGecmeDurumu {
    public static void main(String[] args) {
        int matematik, fizik, turkce, kimya, muzik, dersSayisi = 5;
        double ortalama;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen matematik notunuzu giriniz : ");
        matematik = input.nextInt();

        System.out.print("Lütfen fizik notunuzu giriniz : ");
        fizik = input.nextInt();

        System.out.print("Lütfen Türkçe notunuzu giriniz : ");
        turkce = input.nextInt();

        System.out.print("Lütfen kimya notunuzu giriniz : ");
        kimya = input.nextInt();

        System.out.print("Lütfen müzik notunuzu giriniz : ");
        muzik = input.nextInt();

        if (matematik < 0 || matematik > 100) {
            matematik = 0;
            dersSayisi--;
        }
        if (fizik < 0 || fizik > 100) {
            fizik = 0;
            dersSayisi--;
        }
        if (turkce < 0 || turkce > 100) {
            turkce = 0;
            dersSayisi--;
        }
        if (kimya < 0 || kimya > 100) {
            kimya = 0;
            dersSayisi--;
        }
        if (muzik < 0 || muzik > 100) {
            muzik = 0;
            dersSayisi--;
        }
        ortalama = (matematik + fizik + turkce + kimya + muzik) / dersSayisi;

        if (ortalama >= 55) {
            System.out.print("Geçtiniz");
        } else{
            System.out.print("Kaldınız");
        }
        input.close();
    }
}
