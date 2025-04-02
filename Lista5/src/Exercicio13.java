import javax.swing.*;

public class Exercicio13 {
    public static void main(String[] args) {

        for(int i = 0; i<5; i++){
            String op = JOptionPane.showInputDialog("Cadastro\n Curso (C) - Coordenador (CO) - Aluno (A)");

            if (op.equalsIgnoreCase("C")){
                String nome = JOptionPane.showInputDialog("Nome do curso: ");
                String periodo = JOptionPane.showInputDialog("Período: ");
                cadastrarCurso(nome,periodo);
            }
            else if(op.equalsIgnoreCase("CO")){
                String nome = JOptionPane.showInputDialog("Nome do curso: ");
                double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário: "));
                cadastrarCoordenador(nome,salario);
            }
            else if(op.equalsIgnoreCase("A")){
                String nome = JOptionPane.showInputDialog("Nome do curso: ");
                int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
                String sexo = JOptionPane.showInputDialog("Sexo: ").toUpperCase();
                cadastrarCurso(nome,idade,sexo);
            }
            else{
                JOptionPane.showMessageDialog(null, "Inválido.");
            }
        }
    }

    static void cadastrarCurso(String nome, String periodo){
        JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nPeríodo: "+periodo);
    }

    static void cadastrarCoordenador(String nome, double salario){
        JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nSalário: "+salario);
    }

    static void cadastrarCurso(String nome, int idade, String sexo){
        JOptionPane.showMessageDialog(null, "Nome: "+nome+"\nIdade: "+idade+"\nSexo: "+sexo);
    }
}
