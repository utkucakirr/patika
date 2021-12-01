import java.util.Scanner;

public class SayiTahmin {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int num=(int)(Math.random()*100),right=5,predict;
        while(true){
            System.out.print("0 ile 100 arasinda sayi giriniz: ");
            predict=input.nextInt();
            if(predict==num) {
                System.out.println("Dogru tahmin");
                break;
            }
            right--;
            if(right==0){
                System.out.println("Tahmin hakkiniz kalmamistir. Tahmin etmeniz gereken sayi: " + num);
                break;
            }
            System.out.println("Yanlis tahmin. Kalan hakkiniz: " + right);

        }
    }
}
