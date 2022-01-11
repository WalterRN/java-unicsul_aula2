import java.util.Scanner;

public class Exercicio2 {

   public static void main(String[] args) {

       Scanner imput = new Scanner(System.in);

       System.out.println("Digite a primeira nota: \n");

       double n1 = imput.nextDouble();

       System.out.println("Digite a segunda nota: \n");

       double n2 = imput.nextDouble();

       System.out.println("Digite a terceira nota: \n");

       double n3 = imput.nextDouble();

       double media = (n1+n2+n3)/3;

       System.out.printf(String.format("Sua media aritmética é: %.2f5", media));    

   }  

}