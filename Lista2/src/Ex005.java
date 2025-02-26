import java.util.Scanner;

public class Ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double valorHora = sc.nextDouble();
        double quantHora = sc.nextDouble();

        double salario = valorHora*quantHora;

        if(salario <= 900){
            double salarioLiquido = salario-(salario*0.1)-(salario*0.11);
            System.out.println("Salário - 10%, 11% = " + salarioLiquido);
        }

        else if((salario > 900) && (salario<=1500)){
            double salarioLiquido = salario-(salario*0.05)-(salario*0.1)-(salario*0.11);
            System.out.println("Salário - 5%, 10%, 11% = "+salarioLiquido);
        }

        else if((salario > 1500) && (salario <= 2500)){
            double salarioLiquido = salario-(salario*0.1)-(salario*0.1)-(salario*0.11);
            System.out.println("Salário - 10%, 10%, 11% = "+salarioLiquido);
        }

        else if(salario > 2500){
            double salarioLiquido = salario-(salario*0.2)-(salario*0.1)-(salario*0.11);
            System.out.println("Salário - 20%, 10%, 11% = "+salarioLiquido);
        }


    }
}
