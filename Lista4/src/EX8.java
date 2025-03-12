import javax.swing.*;

public class EX8 {
    public static void main(String[] args) {
        int i = 0;
        double salarios = 0;

        while(i<5){
            int horas = Integer.parseInt(JOptionPane.showInputDialog("Horas: "));
            double valor = Double.parseDouble(JOptionPane.showInputDialog("Valor hora: "));

            double salarioBruto = (horas*valor*30);
            double salarioFinal = salarioBruto - (salarioBruto*0.02);
            JOptionPane.showMessageDialog(null, "Salário final: "+salarioFinal);

            salarios = salarios + salarioFinal;
            i++;
        }

        JOptionPane.showMessageDialog(null,"Folha de pagamento da empresa: "+salarios);



    }
}
