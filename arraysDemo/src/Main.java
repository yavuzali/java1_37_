public class Main {


    public static void main(String[] args) {
        String[] ogrenciler = new String[5];
        ogrenciler[0] = "Ali";
        ogrenciler[1] = "Yasin";
        ogrenciler[2] = "Akif";
        ogrenciler[3] = "Nisa";
        ogrenciler[4] = "Engin";


        for (int i = 0; i < ogrenciler.length; i++) {
            System.out.println(ogrenciler[i]);
        }
        System.out.println("-------------------------------------------");
        // Genelde alltaki yöntem kullanilir.

        for (String ogrenci: ogrenciler) // ögrenciler dizinindeki her bir elemani gez. ve ona takma isim verebilirsin. Biz burd ogrenci verdik. konu anlasilsin diye.
        {
System.out.println(ogrenci);
        }




    }

}