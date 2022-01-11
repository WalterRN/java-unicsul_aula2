import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main (String[] args) {
        float salarioBase, salarioReceber;
        
        salarioBase = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o seu salário base: " ));
        

        salarioReceber = (float) (salarioBase + salarioBase * 0.05 - salarioBase * 0.07);

        JOptionPane.showMessageDialog(null, String.format( "O seu Salário final é de: %.2f ", salarioReceber));

    }

    
}
