import java.util.Scanner;

public class Ornek1 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen Bir Sayi Giriniz:");
        int sayi= scan.nextInt();
        int a=0;
        int b=0;
        double c;
        for(int i=0;i<=sayi;i++){
            if(i%3==0&&i%4==0){
                a++;
                b+=i;

            }
        }
        c=b/(a-1);
        System.out.println("Ortalama:"+c);
    }
}
