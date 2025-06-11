package Ex10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<>();
        int op;
        do{
            showMenu();
            op = sc.nextInt();
            sc.nextLine();

            if(op == 1){
                System.out.print("Tarefa: ");
                tasks.add(sc.nextLine());
            }
            else if(op == 2){
                System.out.print("Delete pelo indíce: ");
                int index = sc.nextInt()-1;
                sc.nextLine();
                tasks.remove(index);

            }
            else if(op == 3){
                System.out.println();
                for(int i=0; i< tasks.size(); i++){
                    System.out.println("#"+(i+1)+": "+tasks.get(i));
                }
            }


        }while(op != 0);

        sc.close();
    }

    public static void showMenu(){
        System.out.println();
        System.out.println("0 - SAIR\n" +
                "1 - CADASTRAR TAREFA\n"+
                "2 - REMOVER TAREFA\n"+
                "3 - LISTAR TAREFAS");
    }
}
