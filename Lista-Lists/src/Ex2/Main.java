package Ex2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> animais = new ArrayList<>();
        // daria pra já instanciar o ArrayList com os elementos dentro com um
        // Arrays.asList() dentro dos paranteses do new
        animais.add("gato");
        animais.add("cachorro");
        animais.add("lince");
        animais.add("leão");
        animais.add("chimpanzé");

        System.out.println("Animais com 5 ou menos de 5 letras: ");
        for(String animal : animais){
            if (animal.length() <= 5){
                System.out.println(animal);
            }
        }
    }
}
