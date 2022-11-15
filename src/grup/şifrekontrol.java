package grup;

import java.util.Scanner;

public class şifrekontrol {

    /*
        Soru 2- Kullanicidan bir sifre girmesini isteyin.
        Girilen sifreyi asagidaki sartlara gore kontrol edin ve sifredeki hatalari yazdirin.
        Kullanici gecerli bir sifre girinceye kadar bu islemi tekrar edin
        ve gecerli sifre girdiginde "Sifreniz Kabul edilmistir" yazdirin.
        - Sifre kucuk harf icermelidir ŞART 1
        - Sifre buyuk harf icermelidir ŞART 2
        - Sifre ozel karakter icermelidir ŞART 3
        - Sifre en az 8 karakter olmalidir. ŞART 4
           SADECEa54
         */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String sifre;
        int bayrak=0;

        do {
            System.out.println("Lütfen bir şifre giriniz.");
            sifre=scan.nextLine();
            bayrak = kucukHarfKontrolEt(sifre) + buyukHarfKontrolEt(sifre) + ozelKarakterKontrolEt(sifre) + sifreUzunlukKontrolEt(sifre);
        }
        while (bayrak!=4);
        System.out.println("Sifreniz basarili bir sekilde kaydedilmiştir.");
    }
    public static int kucukHarfKontrolEt(String sifre){
        int kontrolBayrak=0;

        for (int i=0;i<sifre.length();i++){

            if(sifre.charAt(i)>='a' && sifre.charAt(i)<='z') // string ifadesindeki her bir indeksin a ve z aralığında olup olmadığını kontrol et
            {
                kontrolBayrak++;
                break;
            }
        }

        if ( kontrolBayrak==0)
        {
            System.out.println("Lütfen şifrenizde en az 1 küçük harf kullanınız.");
            return 0;
        }
        else return 1;

    }
    public static int buyukHarfKontrolEt(String sifre){
        int kontrolBayrak=0;

        for (int i=0;i<sifre.length();i++){

            if(sifre.charAt(i)>='A' && sifre.charAt(i)<='Z') // string ifadesindeki her bir indeksin a ve z aralığında olup olmadığını kontrol et
            {
                kontrolBayrak++;
                break;
            }
        }

        if ( kontrolBayrak==0)
        {
            System.out.println("Lütfen şifrenizde en az 1 büyük harf kullanınız.");
            return 0;
        }
        else return 1;
    }
    public static int ozelKarakterKontrolEt(String sifre){
        int kontrolBayrak=0;
        String ozelKarakterler = "§±@!$%^&*()_-+=?/>.<,`~#";

        for (int i=0;i<sifre.length();i++){

            if(sifre.contains(ozelKarakterler.substring(i,i+1))) //Burası Sifre değişkeninde özelkarakterler değişkenine ait herhangi bir char içeriyor mu?
            {
                kontrolBayrak++;
                break;
            }

        }

        if ( kontrolBayrak==0)
        {
            System.out.println("Lütfen şifrenizde en az 1 adet özel karakter kullanınız.");
            return 0;
        }
        else return 1;

    }
    public static int sifreUzunlukKontrolEt(String sifre){
        if(sifre.length()<8)
        {
            System.out.println("Şifreni az 8 karakterden oluşmalıdır.");
            return 0;
        }
        else return 1;
    }

}

