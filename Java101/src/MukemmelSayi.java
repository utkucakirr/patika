import java.util.Scanner;

public class MukemmelSayi {
    public static void main(String[] args) {
        int sayi,sum=0;
        Scanner input=new Scanner(System.in);

        System.out.print("Sayi giriniz: ");
        sayi=input.nextInt();

        for(int i=1;i<sayi;i++){
            if(sayi%i==0){
                sum+=i;
            }
        }

        if(sayi==sum){
            System.out.println(sayi + " mukemmel sayidir.");
        }else{
            System.out.println(sayi + " mukemmel sayi degildir.");
        }
    }
}
