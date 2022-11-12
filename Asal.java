import java.util.Scanner;

public class Asal {
    public static void main(String[] args) {
        System.out.println("Sayı giriniz.");
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        boolean asal=true;
        if(number<=1){
            System.out.println("Sayı asal değildir.");
            return;
        }
        for (int i=2;i<number;i++){
            if(number%i==0){
                asal=false;
                System.out.println("Sayı asal değildir");
                return;
            }

        }
        if(asal){
            System.out.println("Sayı asaldır.");
        }
    }
}
