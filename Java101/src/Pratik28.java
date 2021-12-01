import java.util.Scanner;

public class Pratik28 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[] list={15,12,788,1,-1,-778,2,0};
        int min=list[1],max=list[1];
        for(int i:list){
            if(i<min){
                min=i;
            }
            if(i>max){
                max=i;
            }
        }
        System.out.print("n: ");
        int n=input.nextInt();

        for(int i:list){
            if(i>n&&i<=max){
                max=i;
            }
            if(i<n&&i>=min){
                min=i;
            }
        }
        System.out.print(min + " " + max);
    }
}
