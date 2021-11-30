import java.util.Scanner;
public class ManavKasa {
    public static void main(String[] args) {
        double armutf=2.14,elmaf=3.67,domatesf=1.11,muzf=0.95,patlicanf=5.00,armutkg, elmakg, domateskg, muzkg, patlicankg, toplam;
        Scanner inp=new Scanner(System.in);

        System.out.print("Kaç kilo armut aldiniz: ");
        armutkg=inp.nextDouble();
        System.out.print("Kaç kilo elma aldiniz: ");
        elmakg=inp.nextDouble();
        System.out.print("Kaç kilo domates aldiniz: ");
        domateskg=inp.nextDouble();
        System.out.print("Kaç kilo muz aldiniz: ");
        muzkg=inp.nextDouble();
        System.out.print("Kaç kilo patlican aldiniz: ");
        patlicankg=inp.nextDouble();

        toplam=armutf*armutkg+elmaf*elmakg+domatesf*domateskg+muzf*muzkg+patlicanf*patlicankg;
        System.out.println("Toplam tutar: "+toplam);
        inp.close();
    }
}
