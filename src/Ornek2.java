import java.util.Scanner;

public class Ornek2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int a=0;
        int b=0;
            for(int i=0;i>=0;i++){

                System.out.println("Lutfen Bir Sayi Giriniz:");
                int sayi= scan.nextInt();
                if(sayi%2==1){
                    a+=sayi;

                }
                if(sayi%2==0&&sayi%4==0){
                    b+=sayi;

                }
                if(sayi%2==1){

                    break;
                }

            }
            System.out.println("Tek Sayilarin Toplami:"+a);
            System.out.println("Toplami:"+b);


    }
}
