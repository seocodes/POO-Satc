package Ex4;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    static List<AnimalDomestico> animais = new ArrayList<>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int op;

        do{
            menu();
            op = sc.nextInt();
            sc.nextLine();

            switch (op){
                case 1,2,3:
                    System.out.print("Nome: ");
                    String nome = sc.nextLine();
                    System.out.print("Idade: ");
                    int idade = sc.nextInt();
                    sc.nextLine();
                    cadastrarAnimal(nome,idade,sc,op);
                    break;
                case 4:
                    System.out.println("ANIMAIS CADASTRADOS: ");
                    for(AnimalDomestico animal : animais){
                        System.out.println(animal);
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
                    break;
            }

        }while(op != 5);

        sc.close();
    }

    public static void menu(){
        System.out.println("1 - CADASTRAR PEIXE\n" +
                "2 - CADASTRAR CACHORRO\n" +
                "3 - CADASTRAR GATO\n" +
                "4 - LISTAR ANIMAIS\n" +
                "5 - SAIR DO PROGRAMA\n");
    }

    public static void cadastrarAnimal(String nome, int idade, Scanner sc, int op){
        switch (op){
            case 1:
                System.out.print("Tipo do peixe: ");
                String tipo = sc.nextLine();
                AnimalDomestico peixe = new Peixe(nome,idade,tipo);
                animais.add(peixe);
                break;
            case 2:
                System.out.print("Raça: ");
                String raca = sc.nextLine();
                AnimalDomestico cachorro = new Cachorro(nome,idade,raca);
                animais.add(cachorro);
                break;
            case 3:
                System.out.print("Raça: ");
                raca = sc.nextLine();
                AnimalDomestico gato = new Gato(nome,idade,raca);
                animais.add(gato);
                break;
        }
    }
}

