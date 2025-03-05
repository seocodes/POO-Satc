import javax.swing.*;

public class Ex04 {
    public static void main(String[] args) {

        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Número 1:"));
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Número 2:"));

        String operacao = JOptionPane.showInputDialog("Operação: + - * /");

        if (operacao.equalsIgnoreCase("+")){
            JOptionPane.showMessageDialog(null, num1+num2);
        }
        else if (operacao.equalsIgnoreCase("-")){
            JOptionPane.showMessageDialog(null, num1-num2);
        }
        else if (operacao.equalsIgnoreCase("*")){
            JOptionPane.showMessageDialog(null, num1*num2);
        }
        else if (operacao.equalsIgnoreCase("/")){
            JOptionPane.showMessageDialog(null, num1/num2);
        }
        else{
            JOptionPane.showMessageDialog(null, "Operação invalida");
        }


    }
}
