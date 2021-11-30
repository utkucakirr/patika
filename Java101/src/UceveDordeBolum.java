import java.util.Scanner;
public class UceveDordeBolum {
    public static void main(String[] args) {
        int sayi,toplam=0,count=0;
        Scanner inp=new Scanner(System.in);
        System.out.print("Bir sayi giriniz: ");
        sayi=inp.nextInt();
        for(int i=1;i<sayi;i++){
            if(i%3==0&&i%4==0){
                count=count+1;
                toplam=toplam+i;
            }
        }
        double ortalama;
        if(count==0){
            System.out.println("Bulunamadi!");
        }else{
            ortalama = toplam/count;
            System.out.println(toplam);
            System.out.println(count);
            System.out.println("Ortalama= " + ortalama);
        }
        inp.close();


    }
}
