import java.util.Scanner;

public class PalindromSayi {
    static void IsPalindrome(int number){
        int temp=number,sum=0;
        while(temp>0){
            int b=temp%10;
            sum=sum*10+b;
            temp=temp/10;
        }
        if(sum==number){
            System.out.print(number + " palindrom sayidir.");
        }else{
            System.out.print(number + " palindrom sayi degildir.");
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("n: ");
        int n=input.nextInt();
        IsPalindrome(n);
        input.close();
    }
}
