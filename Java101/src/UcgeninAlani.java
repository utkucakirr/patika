import java.util.Scanner;
public class UcgeninAlani {
    public static void main(String[] args) {
        double kenar1,kenar2,kenar3;
        Scanner input=new Scanner(System.in);

        System.out.print("Ucgenin 1. kenarinin uzunlugunu giriniz: ");
        kenar1=input.nextDouble();

        System.out.print("Ucgenin 2. kenarinin uzunlugunu giriniz: ");
        kenar2=input.nextDouble();

        System.out.print("Ucgenin 3. kenarinin uzunlugunu giriniz: ");
        kenar3=input.nextDouble();

        double alan,u;
        u=(kenar1+kenar2+kenar3)/2;
        alan=Math.sqrt(u*(u-kenar1)*(u-kenar2)*(u-kenar3));

        System.out.println("Ucgenin alani: " +alan);
        input.close();

    }
}
