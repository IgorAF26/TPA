
import java.util.Scanner;
public class Exercicio2 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int[] A = new int[5];
        
        for (int i = 0; i < A.length; i++) {
            System.out.print("Digite o valor para o elemento " + (i + 1) + " do vetor A: ");
            A[i] = ler.nextInt();
        }
        
        for (int i = 0; i < A.length; i++) {
            System.out.println("Tabuada do " + A[i] + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.println(A[i] + " x " + j + " = " + (A[i] * j));
            }
            System.out.println();
        }
        
        ler.close();
    }
}
