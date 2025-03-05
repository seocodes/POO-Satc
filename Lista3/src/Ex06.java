import javax.swing.*;

public class Ex06 {
    public static void main(String[] args) {
        int numAlunos = 3;

        int contINF = 0, contMEC = 0, contELE = 0, contDES = 0;  //contadores

        for (int i = 0; i < numAlunos; i++) {
            String nomeAluno = JOptionPane.showInputDialog("Digite o nome do aluno " + (i+1) + ":");

            String siglaCurso = JOptionPane.showInputDialog("Digite a sigla do curso (INF, MEC, ELE, DES) para " + nomeAluno + ":").toUpperCase();

            switch(siglaCurso.toUpperCase()) {
                case "INF":
                    contINF++;
                    break;
                case "MEC":
                    contMEC++;
                    break;
                case "ELE":
                    contELE++;
                    break;
                case "DES":
                    contDES++;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Sigla invalid. O aluno não foi contado.");
                    break;
            }
        }

        JOptionPane.showMessageDialog(null, "Total de alunos em cada curso:\n" +
                "Informática: " + contINF + "\n" +
                "Mecatrônica: " + contMEC + "\n" +
                "Eletrônica: " + contELE + "\n" +
                "Design: " + contDES);
    }
}
