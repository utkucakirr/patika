import java.util.Scanner;

public class EbobEkok {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sayi1, sayi2, kalan=0,ebob,ekok=1,max,min;
        
        System.out.print("1. sayiyi giriniz: ");
        sayi1 = input.nextInt();

        System.out.print("2. sayiyi giriniz: ");
        sayi2 = input.nextInt();

        if(sayi1>=sayi2){
            max=sayi1;
            min=sayi2;
        }else{
            max=sayi2;
            min=sayi1;
        }

        while(max%min>0){
            kalan=max%min;
            max=min;
            min=kalan;
        }
        ebob=min;
        if(sayi1==sayi2)
        {
            ebob=sayi1;
        }
        ekok=(sayi1*sayi2)/ebob;
        
        System.out.println("Ebob: " + ebob + " Ekok: " + ekok);

        input.close();
        
    }

}
