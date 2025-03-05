import javax.swing.*;

public class Ex07 {
    public static void main(String[] args) {
        int numFunc = 3;
        int contA = 0, contP = 0, contC = 0, contV = 0;
        double totalSalarios = 0;

        for (int i = 0; i < numFunc; i++){
            String setor = JOptionPane.showInputDialog("Digite a sigla do setor (A, P, C, V)");
            double salario = Double.parseDouble(JOptionPane.showInputDialog("SALÁRIO:"));

            totalSalarios += salario;

            switch(setor.toUpperCase()){
                case "A" -> contA++;
                case "P" -> contP++;
                case "C" -> contC++;
                case "V" -> contV++;
                default -> JOptionPane.showMessageDialog(null, "Inválido.");
            }

        }

        JOptionPane.showMessageDialog(null, "Total de funcionários por setor:\n" +
                "Almoxarifado (A): " + contA + "\n" +
                "Produção (P): " + contP + "\n" +
                "Contabilidade (C): " + contC + "\n" +
                "Vendas (V): " + contV + "\n\n" +
                "Total de salários: R$ " + totalSalarios);
    }
}
