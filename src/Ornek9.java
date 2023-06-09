import java.util.Scanner;

public class Ornek9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Basamak Sayisini Giriniz:");
        int basamak= scan.nextInt();
        for(int i=0;i<basamak;i++){
            for(int j=0;j<basamak-i;j++){
                System.out.print(" "); }
                for(int k=0;k<2*i+1;k++){
                    System.out.print("*");
                }
                System.out.println();

        }
    }
}
