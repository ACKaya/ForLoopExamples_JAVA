import java.util.Scanner;

public class Ornek3 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Bir Sayi Giriniz:");
        int sayi= scan.nextInt();
        for(int i=1;i<sayi;i*=4){
            System.out.println(i);
        }
        System.out.println("---------------");
        for(int i=1;i<sayi;i*=5){
            System.out.println(i);
        }

    }
}
