public class Main {
    public static void main(String[] args) {
        String mesaj = "Bugün hava cok güzel";
        String yeniMesaj = sehirVer();
        System.out.println(mesaj);
        int sayi = topla(15, 7);
        System.out.println(sayi);
        int toplam=topla2(2,5,8);
        System.out.println(toplam);
    }


    public static void ekle() {

    }

    {
        System.out.println("Eklendi");

    }

    public static void sil() {
        System.out.println("Silindi");

    }

    public static void guncelle() {
        System.out.println("Güncellendi");

    }

    public static int topla(int sayi1, int sayi2) {
        return sayi1 + sayi2;
    }

    // Variables arguments int...  3 tane nokta oluyor sonunda.
    //Burdaki sayilar aslinda bir int array gibi calisiyor.
    //Buraya integer array göndermis gibi oluyor.
    public static int topla2(int... sayilar) {
        int toplam=0;
        for (int sayi:sayilar){
            toplam+=sayi;
        }

        return toplam;
    }


    public static String sehirVer() {
        return "Ankara";
    }
}