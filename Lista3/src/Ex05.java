import javax.swing.*;

public class Ex05 {
    public static void main(String[] args) {
        int numAlunos = 30;

        for(int i = 0; i < numAlunos; i++){
            double num1 = Double.parseDouble(JOptionPane.showInputDialog("Nota 1:"));
            double num2 = Double.parseDouble(JOptionPane.showInputDialog("Nota 2:"));

            double media = (num1+num2)/2;

            if(media < 5.0){
                System.out.println("Reprovado.");
            }  //botei JOption e Sout misturado pq achei legal
            else if(media >= 5.0 && media <=7.0){
                System.out.println("Recuperação.");
            }
            else if(media > 7.0){
                System.out.println("Aprovado.");
            }
            else{
                System.out.println("Ai tu trollou.");
            }
        }
    }
}
