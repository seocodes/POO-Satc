import javax.swing.*;

public class Exercicio7 {
    //essas variaveis sao da CLASSE agora, podem ser usadas/modificadas em qualquer metodo
    //pois como eu to somando as variaveis no metodo Cadastrar e printando as mesmas variáveis na Main
    //eu to usando nos 2 métodos, ent precisa ser de classe pra contagem dar certo
    //se fosse só na função, toda vez que chamasse ia resetar a contagem
    static int contA = 0, contP = 0, contC = 0;
    public static void main(String[] args) {
        for(int i = 0; i<5; i++){
            String nome = JOptionPane.showInputDialog("Nome: ");
            String setor = JOptionPane.showInputDialog("Setor: (A) Almoxarifado - (P) Produção - (C) Contabilidade");
            cadastrarFuncionarios(nome, setor);
        }
        JOptionPane.showMessageDialog(null, "Almoxarifado: "+contA+"\nProdução: "+contP+"\nContabilidade: "+contC);
    }

    static void cadastrarFuncionarios(String nome, String setor){
        if(setor.equalsIgnoreCase("A")){
            contA++;
        }
        else if(setor.equalsIgnoreCase("P")){
            contP++;
        }
        else if(setor.equalsIgnoreCase("C")){
            contC++;
        }
        else{
            JOptionPane.showMessageDialog(null, "Setor inválido.");
        }
    }
}
