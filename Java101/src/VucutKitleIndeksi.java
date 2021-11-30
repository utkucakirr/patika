import java.util.Scanner;
public class VucutKitleIndeksi {
    public static void main(String[] args) {
        double boy,kg,indeks;
        Scanner inp=new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy=inp.nextDouble();

        System.out.print("Kilonuzu giriniz: ");
        kg=inp.nextDouble();

        indeks=kg/(boy*boy);
        System.out.println("Vucut kitle indeksiniz: " + indeks);
        inp.close();
    }
}
