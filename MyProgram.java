import java.util.Scanner;

public class MyProgram
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);

        // Menü fiyatları
        int lahmacunFiyat = 200;
        int hamburgerFiyat = 400;
        int makarnaFiyat = 250;
        int tatliFiyat = 300;
        int corbaFiyat = 100;

        // Boolean variable ekleme
        boolean restoranAcik = true;

        System.out.println("MENÜ:");
        System.out.println("Lahmacun        200 TL");
        System.out.println("Hamburger       400 TL");
        System.out.println("Spaghetti       250 TL");
        System.out.println("Künefe           300 TL");
        System.out.println("Çorba           100 TL");

        System.out.println();

        int tutar = 0;
       

        // Kullanıcıdan siparişleri al
        System.out.println("Kaç lahmacun sipariş etmek istersiniz?");
        int lahmacun = input.nextInt();


        System.out.println("Kaç hamburger sipariş etmek istersiniz?");
        int hamburger = input.nextInt();
       

        System.out.println("Kaç spaghetti sipariş etmek istersiniz?");
        int makarna = input.nextInt();
       

        System.out.println("Kaç künefe sipariş etmek istersiniz?");
        int tatli = input.nextInt();
       
        System.out.println("Kaç çorba sipariş etmek istersiniz?");
        int corba = input.nextInt();
       
        // Her ürünün fiyatını toplam tutara ekle
        tutar += hesap(lahmacun, lahmacunFiyat);
        tutar += hesap(hamburger, hamburgerFiyat);
        tutar += hesap(makarna, makarnaFiyat);
        tutar += hesap(tatli, tatliFiyat);
        tutar += hesap(corba, corbaFiyat);

       
        // %10 servis ücreti ekle
        double KDV_Dahil = tutar * 1.10;

        // Casting kullanarak küsürattan kurtuluyoruz
        int yaklasikTutar = (int) KDV_Dahil;


        // Çıktılar
       
        System.out.println("Restoran açık mı? " + restoranAcik);
       
       
        System.out.println();
        System.out.println(" Fişiniz");

        System.out.println(tutar + " TL tuttu. ");
        System.out.println("KDV dahil " + KDV_Dahil + " TL oluyor.");
        System.out.println(yaklasikTutar + " verseniz yeter");

       
       
    }

    // Ürün miktarı ile ürün fiyatını çarpar ve toplam fiyatı döndürür
    public static int hesap(int adet, int fiyat)
    {
        int sonuc = adet * fiyat;
        return sonuc;
    }
}
