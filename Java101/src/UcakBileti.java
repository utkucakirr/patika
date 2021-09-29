import java.util.Scanner;
public class UcakBileti {
    public static void main(String[] args) {
        double kmUcret=0.10;
        int km,yas,secim;
        Scanner inp=new Scanner(System.in);
        System.out.print("Mesafeyi giriniz: ");
        km= inp.nextInt();
        System.out.print("Yasinizi giriniz: ");
        yas= inp.nextInt();
        System.out.print("Gidis tipi seciniz (Tek yon icin 1, Gidis gelis icin2): ");
        secim=inp.nextInt();

        if(km<0||yas<0||secim<1||secim>2) {
            System.out.println("Hatali veri girdiniz.");
        }else{
            double toplamUcret=km*kmUcret;
            double yasIndirimOrani;
            double indirimliTutar;
            indirimliTutar=toplamUcret;
            if(yas<12){
                yasIndirimOrani=0.5;
                indirimliTutar=toplamUcret-toplamUcret*yasIndirimOrani;
            }else if(yas>=12&&yas<24){
                yasIndirimOrani=0.1;
                indirimliTutar=toplamUcret-toplamUcret*yasIndirimOrani;
            }else if(yas>=65) {
                yasIndirimOrani = 0.3;
                indirimliTutar=toplamUcret-toplamUcret*yasIndirimOrani;
            }

            if(secim==2){
                indirimliTutar=(indirimliTutar-(indirimliTutar*0.2))*2;
            }
            System.out.println("Toplam tutar: " + indirimliTutar);
        }
    }
}
