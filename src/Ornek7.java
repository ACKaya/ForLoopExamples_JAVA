import java.util.Scanner;

public class Ornek7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Bir Sayi Giriniz:");
        int sayi= scan.nextInt();
        int ust=0;
        int gsayi;
        int taban;
        int result=0;
        gsayi=sayi;
        while(gsayi!=0){
            gsayi/=10;
            ust++;
        }
        gsayi=sayi;
        while(gsayi!=0){
            taban=gsayi%10;
            int a=1;
            for(int i=1;i<=ust;i++){

                a*=taban;

            }
            result+=a;

            gsayi/=10;


        }
        System.out.println(result);
    }
}
