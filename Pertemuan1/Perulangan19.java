import java.util.Scanner;
public class Perulangan19 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        
        System.out.println("--- PROGRAM MENCETAK DERETAN BILANGAN 1 - N ---");
        System.out.println("======================================");

        System.out.print("Masukkan n Bilangan Asli: ");
        n = sc.nextInt();

        System.out.println("======================================");
        System.out.println("Tampilan deret bilangan: ");
        
        for (int i = 1 ; i <= n ; i++){
            if (i == 10 || i == 15){
                continue;
            } else if (i % 3==0){
                System.out.print("# ");
            } else if (i % 2 != 0){
                System.out.print("* ");
            } else System.out.print(i + " ");
        }
    }
}