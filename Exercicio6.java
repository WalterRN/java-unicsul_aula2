import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {

        Scanner Input = new Scanner(System.in);
	    System.out.println("Digite o valor da Base");
	    double base = Input.nextDouble();
	    System.out.println("Digite o valor da Altura");
	    double altura = Input.nextDouble();
	    double area = (base * altura)/2;
	    System.out.println("A Area do triangulo é: " + area);
    
      }
}
