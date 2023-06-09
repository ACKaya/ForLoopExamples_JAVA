import java.util.Scanner;

public class Ornek4 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Faktoriyelini Almak Istediginiz N Sayiyi Girin:");
        int sayi= scan.nextInt();
        int a=1;
        int b=1;

        for(int i=sayi;i>0;i--){
            a*=i;

        }
        System.out.println("Faktoriyelini Almak Istediginiz R Sayiyi Girin:");
        int sayi2= scan.nextInt();
        for(int i=sayi2;i>0;i--){
            b*=i;

        }



    }
}
