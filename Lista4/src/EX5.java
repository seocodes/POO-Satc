import javax.swing.*;

public class EX5 {
    public static void main(String[] args) {

        double salarios = 0;

        for (int i = 0; i<5; i++){  //5 funcionários
            String nome = JOptionPane.showInputDialog("Nome: ");
            String cargo =  JOptionPane.showInputDialog("Cargo: ");
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário: "));
            double aumento = salario + (salario*0.05);
            JOptionPane.showMessageDialog(null,"Seu novo salário é de: " + salario);

            salarios = salarios + salario;
        }
        JOptionPane.showMessageDialog(null, "Folha de pagamento da empresa: " + salarios);



    }
}