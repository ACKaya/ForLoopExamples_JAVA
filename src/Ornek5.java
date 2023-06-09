import java.util.Scanner;

public class Ornek5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Tabani Giriniz:");
        int taban= scan.nextInt();
        System.out.println("Ustu Giriniz:");
        int ust = scan.nextInt();
        int a=1;
        for(int i=0;i<ust;i++){
            a*=taban;

        }
        System.out.println("Islemin Sonucu:"+a);
    }
}
