package grup;

public class asalsayi {


    //10-100 arasındaki asal sayıları yazdıran programı yazınız.
    public static void main(String[] args) {

        //10-100 arasındaki asal sayıları yazdıran programı yazınız.

        int kontrolBayrak=0;
        for (int sayi=10;sayi<100;sayi++) // 10'dan 100'e kadar sayıları dolaşıcak.
        {
            for (int i=2;i<sayi;i++) // sayi degiskenine kadar i=2'den tüm sayilari dolasicak.
            {
                kontrolBayrak=0; //Her döngünün başında kontrolü sıfırlıyoruz.
                if(sayi%i==0) // i'den sayiya kadar sayi'yi i'ye böl ve kalanı == 0 içeri gir.
                {
                    kontrolBayrak=1;
                    break;
                }
            }
            if (kontrolBayrak==0)
            {
                System.out.print(sayi+" , ");
            }
        }
    }
}