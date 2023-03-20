import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName,password ,checked,newpassword;



        for (int i = 1;i<=3;i++){
            System.out.print("Enter Username:");
            userName=scanner.nextLine();

            System.out.print("Enter Password");
            password = scanner.nextLine();

            if (userName.equals("mhrrmsmsk") && password.equals("12345")){
                System.out.println("Başarılı bir şekilde giriş yaptınız ");

            }else System.out.println("Kullanıcı adı veya şifre yanlış !");
            System.out.println("Tekrar deneyiniz kalan hak:"+(3-i));
        }


            System.out.print("Şifre sıfırlamak ister misiniz?(Evet veya Hayır):");
            checked = scanner.nextLine();
            if (checked.equals("Evet") || checked.equals("evet") || checked.equals("EVET")){
                for (int j=1;j<=3;j++){
                    System.out.print("Yeni şifre girin:");
                    newpassword = scanner.nextLine();
                    if (newpassword.equals("12345")){
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz");

                    }else {
                        System.out.println("Şifre oluşturuldu");
                    }
                    System.out.println("Tekrar deneyiniz kalan hak:"+(3-j));
                }
                System.out.println("Deneme hakkı bitti !");

            }
            else if (checked.equals("Hayır") || checked.equals("hayır") || checked.equals("HAYIR"))
                System.out.println("Yeni şifre oluşturulamadı !");



    }
}