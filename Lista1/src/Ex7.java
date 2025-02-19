public class Ex7 {
    public static void main(String[] args) {
        int lugares = 80;
        double valor = 20.00;

        double faturamentoSemana = lugares*valor*3*7;
        double faturamentoMes = lugares*valor*3*30;

        System.out.printf("Faturamento semana = %.2f\n",faturamentoSemana);
        System.out.printf("Faturamento mês = %.2f",faturamentoMes);

    }
}
