import javax.swing.JOptionPane;

public class Exercicio3 
{
    public static void main(String[] args) {


        float valorPrestação,multa,resultado;

        int qtdeDias;

        valorPrestação = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da prestacao: " ));
        multa = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o valor da multa em porcentagem: " ));
        qtdeDias = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite quantidade de dias de atraso: " ));
    
    
        resultado = valorPrestação+(valorPrestação*(multa/100)*qtdeDias);

        JOptionPane.showMessageDialog(null, String.format( "O valor total e de: %.2f ", resultado));
    
    }
}