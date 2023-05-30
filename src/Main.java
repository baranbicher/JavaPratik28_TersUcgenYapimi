import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Basamak sayısını Girin: ");
        int n = input.nextInt();
        for (int i = n; i>=0;i--){
            System.out.println();
            for (int m = 0;m <= (n-i);m++){
                System.out.print(" ");
            }
            for (int j = 1; j <=(2*i)-1;j++){
                System.out.print("*");
            }
        }
    }
}