import java.util.Scanner;
public class ATM {
    public static void main(String[] args) {
        String userName,password;
        Scanner input=new Scanner(System.in);
        int right=3;
        int balance=1500;
        int secim;
        while(right>0){
            System.out.print("Kullanici adiniz: ");
            userName= input.nextLine();
            System.out.print("Sifreniz: ");
            password= input.nextLine();
            if(userName.equals("utkucakirr")&&password.equals("123")){
                System.out.println("Merhaba, hosgeldiniz.");
                System.out.println("1-Para yatirma\n2-Para Cekme\n3-Bakiye Sorgulama\n4-Cikis Yap");
                System.out.print("Yapmak istediginiz islemi seciniz: ");
                secim= input.nextInt();
                switch (secim){
                    case 1:
                        System.out.print("Para miktari: ");
                        int price=input.nextInt();
                        balance+=price;
                        System.out.println("Yeni bakiyeniz: "+balance);
                        break;
                    case 2:
                        System.out.print("Para miktari: ");
                        int price2 = input.nextInt();
                        if(price2>balance){
                            System.out.println("Bakiye yetersiz.");
                        }else{
                            balance-=price2;
                            System.out.println("Yeni bakiyeniz: "+balance);
                        }
                        break;
                    case 3:
                        System.out.println("Bakiyeniz: "+balance);
                        break;
                    case 4:
                        System.out.println("Gorusuruz.");
                        break;
                }
                break;

            }else{
                right--;
                System.out.println("Hatali kullanici adi veya sifre. Tekrar deneyiniz.");
                if(right==0){
                    System.out.println("Hesabiniz bloke olmustur. Banka ile iletisime geciniz.");
                }else{
                    System.out.println("Kalan hakkiniz: "+right);
                }
            }
        }
        input.close();
    }
}
