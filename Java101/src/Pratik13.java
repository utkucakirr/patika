import java.util.Scanner;
public class Pratik13 {
    public static void main(String[] args) {
        int toplam=0,sayi;
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        sayi=inp.nextInt();
        if(sayi%4==0){
            toplam+=sayi;
        }
        while(sayi%2==0){
            System.out.print("Sayi giriniz: ");
            sayi=inp.nextInt();
            if(sayi%4==0){
                toplam+=sayi;
            }
        }
        System.out.println(toplam);
        inp.close();
    }
}
