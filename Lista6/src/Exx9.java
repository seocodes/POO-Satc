import java.util.Arrays;

public class Exx9 {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5};
        int[] numerosComCopia = {6,7,8,9,10};

        System.arraycopy(numeros, 0, numerosComCopia, 3,1);
        System.out.println(Arrays.toString(numerosComCopia));
    }
}
