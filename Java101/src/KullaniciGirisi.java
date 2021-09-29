import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String userName,password;
        Scanner inp=new Scanner(System.in);

        System.out.print("Kullanici Adiniz: ");
        userName=inp.nextLine();

        System.out.print("Sifreniz: ");
        password= inp.nextLine();

        if(userName.equals("utkucakirr") && password.equals("123")){
            System.out.println("Giris Basarili.");
        }else{
            System.out.println("Yanlis sifre girdiniz. Sifrenizi sifirlamak ister misiniz? Evet icin 1, Hayir icin 2");
            int secim=inp.nextInt();
            if(secim==1){
                System.out.print("Yeni sifreyi giriniz:");
                String newPassword=inp.next();
                if (newPassword.equals("123")||newPassword.equals(password)){
                    System.out.println("Islem basarisiz.");
                }else{
                    System.out.println("Sifreniz degistirildi.");
                }
            }else{
                System.out.println("Islem iptal edildi");
            }
        }

    }
}
