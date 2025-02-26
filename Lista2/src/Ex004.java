import java.util.Scanner;

public class Ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Diz o dia da semana em forma numérica ai: ");
        int dia = sc.nextInt();

        switch(dia) {
            case 1:
                System.out.println("Domingo!");
                break;
            case 2:
                System.out.println("Segunda!");
                break;
            case 3:
                System.out.println("Terça!");
                break;
            case 4:
                System.out.println("Quarta!");
                break;
            case 5:
                System.out.println("Quinta!");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                System.out.println("Inválido.");
                break;
        }
    }
}
