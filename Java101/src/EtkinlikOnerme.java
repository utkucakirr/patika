import java.util.Scanner;
public class EtkinlikOnerme {
    public static void main(String[] args) {
        int sicaklik;
        Scanner inp=new Scanner(System.in);
        System.out.print("Sicaklik degerini giriniz: ");
        sicaklik=inp.nextInt();

        if(sicaklik<5){
            System.out.println("Kayak");
        }else if(sicaklik>=5&&sicaklik<15){
            System.out.println("Sinema");
        }else if(sicaklik>=15&&sicaklik<25){
            System.out.println("Piknik");
        }else if(sicaklik>=25){
            System.out.println("Yüzme");
        }
    }
}
