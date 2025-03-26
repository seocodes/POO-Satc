import javax.swing.*;

public class Exercicio6 {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Número 1: "));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Número 2: "));
        String operacao = JOptionPane.showInputDialog("Operação\n A (Adição)\n S (Subtração)\n M (Multiplicação)\n D (Divisão) ");

        JOptionPane.showMessageDialog(null, "Resultado: "+calcular(num1,num2,operacao));
    }

    static double calcular(double num1, double num2, String op){
        if(op.equalsIgnoreCase("A")){
            return num1+num2;
        }
        else if(op.equalsIgnoreCase("S")){
            return num1-num2;
        }
        else if(op.equalsIgnoreCase("M")){
            return num1*num2;
        }
        else if(op.equalsIgnoreCase("D")){
            if(num2 != 0){
                return num1/num2;
            }
            else{
                JOptionPane.showMessageDialog(null, "Não dá pra dividir por zero");
                return 0;
            }

        }
        else{
            JOptionPane.showMessageDialog(null, "Inválido");
            return 0;
        }
    }
}
