import javax.swing.*;

public class Exercicio3 {
    public static void main(String[] args) {
        String nome = JOptionPane.showInputDialog("Nome: ");
        double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura (em METROS): "));

        JOptionPane.showMessageDialog(null,nome + " seu IMC é de: "+calcularIMC(peso,altura));

    }

    public static double calcularIMC(double peso, double altura){
        return peso/(altura*altura);
    }
}