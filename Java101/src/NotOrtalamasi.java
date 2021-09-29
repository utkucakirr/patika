import java.util.Scanner;
public class NotOrtalamasi {
    public static void main(String[] args) {
        double mat, fizik, kimya, tr, tarih, muzik;
        Scanner inp=new Scanner(System.in);

        System.out.print("Matematik notunuzu giriniz: ");
        mat=inp.nextDouble();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik=inp.nextDouble();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya=inp.nextDouble();

        System.out.print("Turkce notunuzu giriniz: ");
        tr=inp.nextDouble();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih=inp.nextDouble();

        System.out.print("Muzik notunuzu giriniz: ");
        muzik=inp.nextDouble();

        double ort=(mat+fizik+kimya+tr+tarih+muzik)/6;
        boolean kosul=ort>60;
        System.out.println(kosul?"Gecti":"Kaldi");
    }
}
