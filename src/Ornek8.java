import java.util.Scanner;

public class Ornek8 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("n degerini giriniz:");
        int n= scan.nextInt();
        double result=0;
        for(double i=1.0;i<=n;i++){
            result+=1/i;
        }
        System.out.println(result );

    }
}
