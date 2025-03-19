import javax.swing.*;

public class Exercicio4 {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Digite o número 1: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Digite o número 2: "));

        calcularMedia(num1,num2);

    }

    public static void calcularMedia(double n1, double n2){
        double media = (n1+n2)/2;

        if(media<5){
            JOptionPane.showMessageDialog(null,"Reprovado.");
        }
        else if(media>=5 && media<7){
            JOptionPane.showMessageDialog(null,"Recuperação.");
        }
        if(media>=7){
            JOptionPane.showMessageDialog(null,"Aprovado.");
        }
    }
}
