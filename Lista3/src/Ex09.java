import javax.swing.*;

public class Ex09 {
    public static void main(String[] args) {
        int numAlunos = 4;
        int contMaiorIdade = 0, contMenorIdade = 0;
        int contMasculino = 0, contFeminino = 0;

        for (int i = 0; i < numAlunos; i++) {

            String nome = JOptionPane.showInputDialog("Digite o nome do aluno: ");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do aluno: "));
            String sexo = JOptionPane.showInputDialog("Digite o sexo do aluno (Masculino ou Feminino):");

            if (idade >= 18) {
                contMaiorIdade++;
            } else {
                contMenorIdade++;
            }

            if (sexo.equalsIgnoreCase("Masculino")) {
                contMasculino++;
            } else if (sexo.equalsIgnoreCase("Feminino")) {
                contFeminino++;
            } else {
                JOptionPane.showMessageDialog(null, "Sexo inválido para o aluno " + nome + ". Tente novamente.");
            }
        }

        JOptionPane.showMessageDialog(null, "Resultados:\n" +
                "Total de alunos maiores de idade: " + contMaiorIdade + "\n" +
                "Total de alunos menores de idade: " + contMenorIdade + "\n" +
                "Total de alunos do sexo Masculino: " + contMasculino + "\n" +
                "Total de alunos do sexo Feminino: " + contFeminino);
    }
}
