import javax.swing.*;

public class EX9 {
    public static void main(String[] args) {
        int contBebe = 0;
        int contCrianca = 0;
        int contAdolescente = 0;
        int contAdulto = 0;
        int contVelho = 0;

        for(int i = 0; i<5; i++){
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));

            if (idade>=0 && idade<=3){
                contBebe++;
            }
            else if(idade>3 && idade<=11){
                contCrianca++;
            }
            else if(idade>11 && idade<=17){
                contAdolescente++;
            }
            else if(idade>17 && idade<=60){
                contAdulto++;
            }
            else if(idade>60 &&  idade<=99){
                contVelho++;
            }
            else{
                JOptionPane.showMessageDialog(null,"Idade inválida.");
            }
        }

        JOptionPane.showMessageDialog(null,"Bebês: " + contBebe +
        "\nCrianças: " + contCrianca + "\nAdolescentes: " + contAdolescente + "\nAdultos: " + contAdulto + "\nVelhos: " + contVelho);

    }
}
