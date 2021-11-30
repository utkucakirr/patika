import java.util.Scanner;

public class AsalSayi {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n;
        System.out.print("n: ");
        n=input.nextInt();
        for(int i=3;i<=n;i++){
            int prime=1;
            for(int j=2;j<i;j++){
                if(i%j==0){
                    prime=0;
                }
            }
            if(prime!=0){
                System.out.print(i + ", ");
            }
        }

        input.close();
    }
    
}
