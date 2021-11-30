import java.util.Scanner;

public class Odev13 {
    static int Desen(int n, boolean check, int count){
        if(check){
            if(n>0){
                System.out.print(n + " ");
                count++;
                return Desen(n-5,true,count);
            }else{
                return Desen(n,false,count);
            }
        }
        System.out.print(n + " ");
        if(count>0){
            count--;
            return Desen(n+5,false,count);
        }else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("n: ");
        int n=input.nextInt();
        Desen(n,true,0);
    }
}
