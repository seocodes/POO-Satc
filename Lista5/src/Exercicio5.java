import javax.swing.*;

public class Exercicio5 {
    //essas variaveis sao da CLASSE agora, podem ser usadas/modificadas em qualquer metodo
    //pois como eu to somando as variaveis no metodo Cadastrar e printando as mesmas variáveis na Main
    //eu to usando nos 2 métodos, ent precisa ser de classe pra contagem dar certo
    //se fosse só na função, toda vez que chamasse ia resetar a contagem
    static int contS = 0, contC = 0, contV = 0, contD = 0;

    public static void main(String[] args) {
        int continuar;
        do {
            String estadoCivil = JOptionPane.showInputDialog("Estado civil: (S, C, V, D)");
            classificarEstado(estadoCivil);
            continuar = JOptionPane.showConfirmDialog(null, "Deseja inserir outro estado civil?", "Continuar", JOptionPane.YES_NO_OPTION);
        } while (continuar == JOptionPane.YES_OPTION);  //janela de yes/no, bom pra loop

        JOptionPane.showMessageDialog(null, "Solteiros: " + contS + "\nCasados: " + contC +
                "\nViúvos: " + contV + "\nDivorciados: " + contD);
    }

    static void classificarEstado(String estadoCivil) {
        if (estadoCivil.equalsIgnoreCase("S")) {
            JOptionPane.showMessageDialog(null, "Solteirasso aproveita ai sla");
            contS++;
        } else if (estadoCivil.equalsIgnoreCase("C")) {
            JOptionPane.showMessageDialog(null, "Casadera");
            contC++;
        } else if (estadoCivil.equalsIgnoreCase("V")) {
            JOptionPane.showMessageDialog(null, "boooh morreu o cara meu viuvo");
            contV++;
        } else if (estadoCivil.equalsIgnoreCase("D")) {
            JOptionPane.showMessageDialog(null, "que triste divorciado");
            contD++;
        }
    }
}
