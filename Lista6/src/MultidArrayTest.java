import javax.swing.*;
import java.util.Scanner;

public class MultidArrayTest {
    public static void main(String[] args) {
        double[][] medias = new double[3][3];

        for(int i=0; i<medias.length; i++){
            for(int j=0; j<medias[i].length; j++) {
                double nota = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do aluno "+i+1+": "));
                medias[i][j] = nota;
            }
        }
        calcularMedia(medias);
    }

    public static void calcularMedia(double[][] medias){
        for (int i = 0; i<medias.length; i++){
            double soma = 0;
            for(int j = 0; j<medias[i].length; j++){
                soma += medias[i][j];
            }
            double media = soma/medias[i].length;
            System.out.println("A média do aluno "+i+1+" é "+String.format("%.2f", media));
        }
    }
}
