import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Veiculo bike = new Bicicleta(1, "Caloi", "Bicicross", 2022, "Azul", 12.5, 1.5, "Estrada");
        Veiculo caminhao = new Caminhao(2, "Volkswagen", "Delivery", 2020, "Branco", 3500.0, 7.0, "Carga pesada", 5000.0);
        Veiculo automovel = new Automovel(3, "Ford", "Fiesta", 2021, "Preto", 1200.0, 4.2, "Hatch");
        Veiculo onibus = new Onibus(4, "Mercedes-Benz", "O500", 2019, "Amarelo", 15000.0, 12.0, "Intermunicipal", 45);

        while (true){
            System.out.println("QUE VEICULO TU QUER BOTAR NA OFICINA?\n" +
                    "1 - BICICLETA\n" +
                    "2 - CAMINHAO\n" +
                    "3 - AUTOMOVEL\n" +
                    "4 - ONIBUS\n" +
                    "5 - SAIR\n");
            int op = sc.nextInt();

            if(op == 1){
                oficina(bike);
            }
            else if(op == 2){
                oficina(caminhao);
            }
            else if(op == 3){
                oficina(automovel);
            }
            else if(op == 4){
                oficina(onibus);
            }
            else if(op == 5){
                System.out.println("Saindo...");
                break;
            }
            else{
                System.out.println("INVALIDO.");
            }
        }

        sc.close();
    }

    public static void oficina(Veiculo veiculo) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Iniciando serviço para: " + veiculo.marca + " " + veiculo.modelo);
            System.out.println("Qual serviço quer:\n" +
                    "1 - Revisao\n" +
                    "2 - Manutenção\n" +
                    "3 - Limpeza\n" +
                    "4 - Abastecimento\n" +
                    "5 - Sair");
            int op = sc.nextInt();
            if (op == 1) {
                veiculo.checkList();
            } else if (op == 2) {
                veiculo.adjust();
            } else if (op == 3) {
                veiculo.cleanup();
            } else if (op == 4) {
                veiculo.abastecimento();
            } else if (op == 5) {
                break;
            } else {
                System.out.println("Inválido.");
            }
        }
    }
}