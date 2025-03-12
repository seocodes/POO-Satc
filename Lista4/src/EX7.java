import javax.swing.*;

public class EX7 {
    public static void main(String[] args) {

        for(int i = 0; i<5; i++){
            String nome = JOptionPane.showInputDialog("Nome: ");
            double peso = Double.parseDouble(JOptionPane.showInputDialog("Peso: "));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura (em metros): "));

            double massa = peso/(altura*altura);

            JOptionPane.showMessageDialog(null,"IMC: "+ String.format("%.2f", massa)); //comando q descobri pra n printar muita casa decimal
        }
    }
}
