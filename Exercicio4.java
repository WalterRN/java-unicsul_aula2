import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args){
        float  salario ;
        int  percentual;

        salario = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o salário do funcionario: " ));
        
        percentual = 25;

        float aumento = salario*percentual/100;         
        float novosalario = salario+aumento;

        JOptionPane.showMessageDialog(null, String.format( "O valor total e de: %.2f ", novosalario)); 
    }
}