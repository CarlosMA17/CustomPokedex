import pokemons.Pokemon;

public class Main {

    public static void main(String[] args) {
        Pokemon pokemon = new Pokemon("prueba", "prueba", 6, 6, " Lorem Ipsum is simply\n" +
                " dummy text of the printing\n and typesetting industry.\n Lorem Ipsum has been\n" +
                " the industry's standard dummy\n text ever since the 1500s ");
        System.out.println(pokemon);
    }
}
