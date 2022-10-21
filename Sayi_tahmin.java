
// Sayı Tahmin Uygulaması 

package sayi_tahmin;
import java.util.Random;
import java.util.Scanner;


public class Sayi_tahmin {

    
    public static void main(String[] args) {
        
        Random rdn = new Random();
        Scanner input = new Scanner(System.in);
        
        
        System.out.println("Sayı Tahmin Oyununa Hoş Geldiniz .!");
        
        System.out.println("Lütfen 0 İle 100 Arasında Bir Sayı Giriniz :");
        int sayi1 = input.nextInt();
        
        int randomsayi = rdn.nextInt(101);
        
        while (sayi1 != randomsayi) {
            if (sayi1 <0 || sayi1 >100){
            System.out.println("Lütfen 0 İle 100 Arasında Bir Değer Giriniz :");
            sayi1 = input.nextInt();
            }
            else if (sayi1 < randomsayi){
                System.out.println("Lütfen Daha Büyük Bir Sayı Giriniz :");
                sayi1 = input.nextInt();
            }
            else if (sayi1 > randomsayi){
                System.out.println("Lütfen Daha Küçük Bir Sayı Giriniz :");
                sayi1 = input.nextInt();
            }
            
           
        }
         if (sayi1 == randomsayi){
                System.out.println("Doğru Sayıyı Buldunuz. Doğru Sayı :"+sayi1+" "+"Tebrikler :)");
                
        }
        
        
    }
    
}
