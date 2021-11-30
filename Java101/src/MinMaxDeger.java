import java.util.Scanner;

public class MinMaxDeger {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        int n,sayi,min=0,max=0;
        System.out.print("Sayi adedi: ");
        n=input.nextInt();

        for(int i=0;i<n;i++){
            System.out.print("Sayi giriniz: ");
            sayi=input.nextInt();

            if(sayi>max){
                max=sayi;
                if(min==0){
                    min=sayi;
                }
            }
            if(sayi<min){
                min=sayi;
            }
        }

        System.out.println("Min: " + min + " Max: " + max);
    }
    
}
