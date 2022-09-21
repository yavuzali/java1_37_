public class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i+=5) {
            System.out.println(i);

        }
        System.out.println("For döngüsü bitti");

        int i=1;
        while (i<10){
            System.out.println(i);
            i+=3;

        }
        System.out.println("While döngüsü bitti");

        int j=1;
        do{
            System.out.println(j);
            j++;
        }
        while (j<=10);

        System.out.println(" Loglandi");
    }
}