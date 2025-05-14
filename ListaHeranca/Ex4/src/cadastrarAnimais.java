import java.util.ArrayList;
import java.util.Scanner;

public class cadastrarAnimais {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Esse ArrayList vai guardar qualquer objeto que seja um Animal ou uma subclasse dele.
        ArrayList<Animal> animais = new ArrayList<>();
        int opcao;
        do{
            System.out.println("ESCOLHA A OPÇÃO\n0 - SAIR\n1 - CRIAR PEIXE\n2 - CRIAR MAMIFERO\n3 - CRIAR AVE\n4 - MOSTRAR ANIMAIS");
            opcao = sc.nextInt();
            if (opcao == 1){
                System.out.print("Digite o nome: ");
                sc.nextLine(); //limpa o buffer
                String nome = sc.nextLine();

                System.out.print("Digite o comprimento (em cm): ");
                float comprimento = sc.nextFloat();

                System.out.print("Digite o número de patas: ");
                int numPatas = sc.nextInt();

                System.out.print("Digite a cor: ");
                sc.nextLine();
                String cor = sc.nextLine();

                System.out.print("Digite o ambiente: ");
                String ambiente = sc.nextLine();

                System.out.print("Digite a velocidade média (em km/h): ");
                float velocMedia = sc.nextFloat();

                System.out.print("Digite a característica especial do peixe: ");
                sc.nextLine();
                String caracteristica = sc.nextLine();

                //não dá problema pq é new Peixe, ent mesmo o nome sendo o mesmo em todas as criações, é um novo objeto
                //oq difere eles é a memoria msm
                Peixe novoPeixe = new Peixe(nome, comprimento, numPatas, cor, ambiente, velocMedia, caracteristica);
                animais.add(novoPeixe);
                System.out.println("Peixe cadastrado com sucesso!");
            }
            if (opcao == 2){
                System.out.print("Digite o nome: ");
                sc.nextLine();
                String nome = sc.nextLine();

                System.out.print("Digite o comprimento (em cm): ");
                float comprimento = sc.nextFloat();

                System.out.print("Digite o número de patas: ");
                int numPatas = sc.nextInt();

                System.out.print("Digite a cor: ");
                sc.nextLine();
                String cor = sc.nextLine();

                System.out.print("Digite o ambiente: ");
                String ambiente = sc.nextLine();

                System.out.print("Digite a velocidade média (em km/h): ");
                float velocMedia = sc.nextFloat();

                System.out.print("Digite o alimento: ");
                sc.nextLine();
                String alimento = sc.nextLine();

                Mamifero novoMamifero = new Mamifero(nome, comprimento, numPatas, cor, ambiente, velocMedia, alimento);
                animais.add(novoMamifero);
                System.out.println("Mamifero cadastrado com sucesso!");
            }
            if (opcao == 3){
                System.out.print("Digite o nome: ");
                sc.nextLine();
                String nome = sc.nextLine();

                System.out.print("Digite o comprimento (em cm): ");
                float comprimento = sc.nextFloat();

                System.out.print("Digite o número de patas: ");
                int numPatas = sc.nextInt();

                System.out.print("Digite a cor: ");
                sc.nextLine();
                String cor = sc.nextLine();

                System.out.print("Digite o ambiente: ");
                String ambiente = sc.nextLine();

                System.out.print("Digite a velocidade média (em km/h): ");
                float velocMedia = sc.nextFloat();

                System.out.print("Digite o tipo de bico: ");
                sc.nextLine();
                String tipoBico = sc.nextLine();

                Ave novaAve = new Ave(nome, comprimento, numPatas, cor, ambiente, velocMedia, tipoBico);
                animais.add(novaAve);
                System.out.println("Ave cadastrada com sucesso!");
            }
            if (opcao == 4){
                for(Animal animal : animais){
                    System.out.println(animal.exibirDados());
                }
            }

        }while(opcao != 0);

        sc.close();


    }
}