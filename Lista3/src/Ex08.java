import javax.swing.*;

public class Ex08 {
    public static void main(String[] args) {
        int numAlunos = 3;
        int contFundamental = 0, contMedio = 0, contTecnico = 0, contGraduacao = 0;

        for (int i = 0; i < numAlunos; i++){
            String nome = JOptionPane.showInputDialog("Digite o nome do aluno:");
            String formacao = JOptionPane.showInputDialog("Digite a formação do aluno (Fundamental, Médio, Técnico, Graduação):");

            switch(formacao.toUpperCase()){
                case "FUNDAMENTAL" -> contFundamental++;
                case "MÉDIO" -> contMedio++;
                case "TÉCNICO" -> contTecnico++;
                case "GRADUAÇÃO" -> contGraduacao++;
                default -> JOptionPane.showMessageDialog(null, "Formação inválida. Tente novamente.");
            }
        }

        JOptionPane.showMessageDialog(null, "Total de alunos por formação:\n" +
                "Ensino Fundamental: " + contFundamental + "\n" +
                "Ensino Médio: " + contMedio + "\n" +
                "Ensino Técnico: " + contTecnico + "\n" +
                "Graduação: " + contGraduacao);
    }
}
