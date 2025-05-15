import java.util.Arrays;

public class Exx6 {
    public static void main(String[] args) {
        int[] arrayA = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arrayB = {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};

        System.out.println("Array resultante das somas: " + Arrays.toString(somaArrays(arrayA, arrayB)));

//      OUTRA FORMA DE FAZER O PRINT DO ARRAYC (n dá pra printar direto pq printa um endereço da memória)
//        System.out.println("Array resultante das somas:");
//        for(int numero : somaArrays(arrayA,arrayB)){
//            System.out.print(numero + " ");
//        }
//    }
    }

    static int[] somaArrays(int[] arrayA, int[] arrayB){
        int[] arrayC = new int[arrayA.length];

        for(int i=0; i<10; i++){
            arrayC[i] = arrayA[i]+arrayB[i];
        }

        return arrayC;
    }
}
