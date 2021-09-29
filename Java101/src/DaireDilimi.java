import java.util.Scanner;
public class DaireDilimi {
    public static void main(String[] args) {
        double r,a,pi=3.14,alan;
        Scanner inp=new Scanner(System.in);

        System.out.print("Yaricapi giriniz: ");
        r=inp.nextDouble();

        System.out.print("Merkez aci olcusunu giriniz: ");
        a=inp.nextDouble();

        alan=(pi*r*r*a)/360;
        System.out.println("Daire diliminin alani: " + alan);
    }
}
