import javax.swing.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Exercicio12 {
    static HashMap<String, List<String>> setor = new HashMap<>();
    static HashMap<String, List<String>> funcionarios = new HashMap<>();

    public static void main(String[] args) {
        int continuar;

        do {
            String op = JOptionPane.showInputDialog("Setor (S) ou Funcionário (F): ");

            if (op.equalsIgnoreCase("S")) {
                String nome = JOptionPane.showInputDialog("Nome: ");
                String gerente = JOptionPane.showInputDialog("Gerente: ");
                String telefone = JOptionPane.showInputDialog("Telefone: ");
                cadastrarSetor(nome, gerente, telefone);

            } else if (op.equalsIgnoreCase("F")) {
                String nome = JOptionPane.showInputDialog("Nome: ");
                String cargo = JOptionPane.showInputDialog("Cargo: ");
                String salario = JOptionPane.showInputDialog("Salário: ");
                cadastrarFuncionarios(nome, cargo, salario);

            } else {
                JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
            continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?");
        }
        while(continuar == JOptionPane.YES_OPTION);

        for(String key : setor.keySet()){
            JOptionPane.showMessageDialog(null, "Setor "+key+"\n Informações: "+setor.get(key));
        }

        for(String key : funcionarios.keySet()){
            JOptionPane.showMessageDialog(null, "Funcionário "+key+"\n Informações: "+funcionarios.get(key));
        }
    }

    static void cadastrarSetor(String nome, String gerente, String telefone){
        setor.put(nome, Arrays.asList(gerente,telefone));
    }

    static void cadastrarFuncionarios(String nome, String cargo, String salario){
        funcionarios.put(nome, Arrays.asList(cargo,salario));
    }
}
