import javax.swing.*;

public class Ex02 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        String estadoCivil = JOptionPane.showInputDialog("Seu estado civil é:\n S - Solteiro\n - C - Casado\n V - Viúvo\n D - Divorciado");
        if (estadoCivil.equalsIgnoreCase("S")){
            JOptionPane.showMessageDialog(null, name + " seu estadoCivil é Solteiro");
        }
        else if (estadoCivil.equalsIgnoreCase("C")){
            JOptionPane.showMessageDialog(null, name + " seu estadoCivil é Casado");
        }
        else if (estadoCivil.equalsIgnoreCase("V")){
            JOptionPane.showMessageDialog(null, name + " seu estadoCivil é Viúvo");
        }
        else if (estadoCivil.equalsIgnoreCase("D")){
            JOptionPane.showMessageDialog(null, name + " seu estadoCivil é Divorciado");
        }
        else{
            JOptionPane.showMessageDialog(null, "Tu nao existe lol fahsdj ghfsdj");
        }

    }
}
