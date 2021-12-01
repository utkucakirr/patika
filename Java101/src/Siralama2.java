import java.util.Arrays;
import java.util.Scanner;

public class Siralama2 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("n: ");
        int n=input.nextInt();
        int[] numbers=new int[n];
        for(int i=0;i<n;i++){
            System.out.print((i+1) + ". eleman: ");
            numbers[i]=input.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(numbers[j]<numbers[i]){
                    int temp=numbers[i];
                    numbers[i]=numbers[j];
                    numbers[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(numbers));
    }
}
