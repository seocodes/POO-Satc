import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = sc.nextLine();

        System.out.print("Endereço: ");
        String endereco = sc.nextLine();

        System.out.print("Bairro: ");
        String bairro = sc.nextLine();

        System.out.print("Cidade: ");
        String cidade = sc.nextLine();

        System.out.print("Estado: ");
        String estado = sc.nextLine();

        System.out.print("Fone: ");
        String fone = sc.nextLine();

        System.out.printf("%s, você mora em %s, %s, %s, %s. Seu telefone é: %s ",nome,endereco,bairro,cidade,estado,fone);


        sc.close();
    }
}