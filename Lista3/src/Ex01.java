import javax.swing.JOptionPane;

public class Ex01 {
    public static void main(String[] args) {

        String name = JOptionPane.showInputDialog("Enter your name: ");
        String curso = JOptionPane.showInputDialog("Digite o curso: ADM = Administração\n" +
                "DIR -  Direto\n" +
                "CEX - Comércio Exterior");

        if (curso.equalsIgnoreCase("ADM")){
            JOptionPane.showMessageDialog(null, name + " seu curso é Administração");
        }
        else if (curso.equalsIgnoreCase("DIR")){
            JOptionPane.showMessageDialog(null, name + " seu curso é Direito");
        }
        else if (curso.equalsIgnoreCase("CEX")){
            JOptionPane.showMessageDialog(null, name + " seu curso é Comércio Exterior");
        }
        else{
            JOptionPane.showMessageDialog(null, "Tu não faz nada.");
        }
        }
    }
