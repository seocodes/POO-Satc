import java.util.Scanner;

public class Exx8 {
    public static void main(String[] args) {
        String[] nomes = new String[10];
        Scanner sc = new Scanner(System.in);

        for(int i=0; i<nomes.length; i++){
            System.out.println("Digite o nome: ");
            nomes[i] = sc.nextLine();
        }

        System.out.println("Digite o nome para verificar se há no Array");
        String target = sc.nextLine();

        System.out.println(verificarNome(target, nomes));
        System.out.println();
    }

    public static boolean verificarNome(String target, String[] nomes){
        for(String n : nomes){
            if(n.equalsIgnoreCase(target)){
                return true;
            }
        }
        return false;
    }
}
