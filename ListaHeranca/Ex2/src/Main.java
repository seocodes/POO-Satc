public class Main {
    public static void main(String[] args) {
        Animal gato = new Animal("Desgraçado da Silva",60.0f,4,"Preto","Doméstico",22);
        Peixe nemo = new Peixe("Nemo",30.0f,0, "Listrado", "Mar", 8.0f, "FDP");

        System.out.println(gato.toString());
        System.out.println(nemo.dadosPeixe());
    }
}