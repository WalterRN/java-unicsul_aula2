import javax.swing.JOptionPane;



public class Exercicio1{
    public static void main (String[] args) {
        int anos, meses, dias;

        anos = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite sua idades em anos: " ));
        meses = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os meses: " ));
        dias = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os dias: " ));

        dias = anos * 360 + meses * 30 + dias;

        JOptionPane.showMessageDialog(null, "Você viveu" + dias + "dias.");


    }
}