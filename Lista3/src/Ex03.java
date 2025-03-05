import javax.swing.*;

public class Ex03 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        String cargo = JOptionPane.showInputDialog("Seu cargo é:\n T - Técnico\n E - Engenheiro\n A - Analista de Sistemas\n P - Programador\n W - Web designer\n G - Gerente de Projetos");        if (cargo.equalsIgnoreCase("T")) {
            JOptionPane.showMessageDialog(null, name + " seu cargo é Técnico");
        }
        else if (cargo.equalsIgnoreCase("E")) {
            JOptionPane.showMessageDialog(null, name + " seu cargo é Engenheiro");
        }
        else if (cargo.equalsIgnoreCase("A")) {
            JOptionPane.showMessageDialog(null, name + " seu cargo é Analista de Sistemas");
        }
        else if (cargo.equalsIgnoreCase("P")) {
            JOptionPane.showMessageDialog(null, name + " seu cargo é Programador");
        }
        else if (cargo.equalsIgnoreCase("W")) {
            JOptionPane.showMessageDialog(null, name + " seu cargo é Web designer");
        }
        else if (cargo.equalsIgnoreCase("G")) {
            JOptionPane.showMessageDialog(null, name + " seu cargo é Gerente de Projetos");
        }
        else {
            JOptionPane.showMessageDialog(null, "Opção invalida");
        }
    }
}
