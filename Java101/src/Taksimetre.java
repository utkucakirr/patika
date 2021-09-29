import java.util.Scanner;
public class Taksimetre {
    public static void main(String[] args) {
        double km, acilis=10, min=20, kmbasi=2.2, total,odenecek;
        Scanner inp=new Scanner(System.in);
        System.out.print("Gidilen mesafe: ");
        km=inp.nextDouble();
        total=acilis+km*kmbasi;
        boolean kosul=total>=20;
        odenecek=kosul?total:min;

        System.out.println("Odenecek miktar:" + odenecek);
    }
}
