import javax.swing.*;

public class EX10 {
    public static void main(String[] args) {
                int contSolteiro = 0;
                int contCasado = 0;
                int contViuvo = 0;
                int contDivorciado = 0;

                for (int i = 0; i < 5; i++) {
                    String nome = JOptionPane.showInputDialog("Digite o nome da pessoa:");
                    String estadoCivil = JOptionPane.showInputDialog("Digite a sigla do estado civil (S - Solteiro, C - Casado, V - Viúvo, D - Divorciado):");

                    if (estadoCivil.equalsIgnoreCase("S")) {
                        contSolteiro++;
                    } else if (estadoCivil.equalsIgnoreCase("C")) {
                        contCasado++;
                    } else if (estadoCivil.equalsIgnoreCase("V")) {
                        contViuvo++;
                    } else if (estadoCivil.equalsIgnoreCase("D")) {
                        contDivorciado++;
                    } else {
                        JOptionPane.showMessageDialog(null, "Sigla inválida.");
                    }
                }

                JOptionPane.showMessageDialog(null, "Solteiros: " + contSolteiro + "\nCasados: " + contCasado +
                        "\nViúvos: " + contViuvo + "\nDivorciados: " + contDivorciado);
            }
        }

