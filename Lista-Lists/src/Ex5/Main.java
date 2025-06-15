package Ex5;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        int op;
        do{
            showMenu();
            op = sc.nextInt();

            if(op == 0){
                System.out.println("Saindo do programa...");
            }

            else if(op == 1 || op == 2){
                System.out.print("Velocidade do veículo: ");
                double velocidade = sc.nextDouble();
                veiculos.add(cadastrarVeiculo(velocidade, op));
            }

            else if(op == 3){
                for(Veiculo veiculo : veiculos){
                    veiculo.mostrarVelocidade();
                }
            }

            else{
                System.out.println("Opção inválida.");
            }

        }while(op != 0);

        sc.close();
    }

    public static void showMenu(){
        System.out.println();
        System.out.println("0 - SAIR\n" +
                "1 - CADASTRAR BICICLETA\n"+
                "2 - CADASTRAR CARRO\n"+
                "3 - LISTAR VEÍCULOS");
    }

    public static Veiculo cadastrarVeiculo(double velocidade, int op){
        return switch(op){
            case 1 -> new Bicicleta(velocidade);
            case 2 -> new Carro(velocidade);
            default -> null;
        };
    }
}
