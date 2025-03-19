import javax.swing.*;

public class Exercicio5 {
    public static void main(String[] args) {
        String estadoCivil = JOptionPane.showInputDialog("Estado civil: ");
        classificarEstado(estadoCivil);

    }

    public static void classificarEstado(String estadoCivil){
        int contS = 0, contC = 0, contV = 0, contD = 0;
        if(estadoCivil.equalsIgnoreCase("S")){
            JOptionPane.showMessageDialog(null,"Solteirasso aproveita ai sla");
            contS++;
        }
        else if(estadoCivil.equalsIgnoreCase("C")){
            JOptionPane.showMessageDialog(null,"Casadera");
            contC++;
        }
        else if(estadoCivil.equalsIgnoreCase("V")){
            JOptionPane.showMessageDialog(null,"boooh morreu o cara meu viuvo");
            contV++;
        }
        else if(estadoCivil.equalsIgnoreCase("D")){
            JOptionPane.showMessageDialog(null,"que triste divorciado");
            contD++;
        }

        //ISSO PRA CASO FOSSE UM LOOP, SÓ TO MOSTRANDO Q TEM Q SER DENTRO DA FUNÇÃO MESMO, PQ (PESQUISAR NO GPT)
        JOptionPane.showMessageDialog(null,"Solteiros: "+contS+"\n Casados: "+contC+
                "\nViúvos: "+contV+"\nDivorciados: "+contD);

    }
}
