import javax.swing.*;

public class EX6 {
    public static void main(String[] args) {

        for(int i = 0; i<5; i++){
            double base = Double.parseDouble(JOptionPane.showInputDialog("Base: "));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));

            JOptionPane.showMessageDialog(null, "Área: " + calcularArea(base,altura));
        }

    }


    //um metodo static pode ser chamado sem precisar de uma instância (objeto) da classe. e o main é static também, ent os métodos chamados dentro dele precisam ser também
    static double calcularArea(double base, double altura){
        return (base*altura)/2;
    }
}
