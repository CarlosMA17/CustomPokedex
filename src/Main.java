import Utiles.ListaPokemon;
import pokemons.*;

public class Main {

    public static void main(String[] args) {
        PokemonLegendario pokemon = new PokemonLegendario("Charizar", "fuego", 6, 6, " Lorem Ipsum is simply\n" +
                " dummy text of the printing\n and typesetting industry.\n Lorem Ipsum has been\n" +
                " the industry's standard dummy\n text ever since the 1500s ", "en el rio");

        Pokemon pokemon2 =  new Pokemon("bulbasur", "fuego", 6, 6,  "Lorem Ipsum is simply\n" +
                " dummy text of the printing\n and typesetting industry.\n Lorem Ipsum has been\n" +
                " the industry's standard dummy\n text ever since the 1500s ");

        System.out.println("bienvenido al programa");

        ListaPokemon listaAvistados = new ListaPokemon();
        ListaPokemon listaCapturados = new ListaPokemon();
        listaAvistados.addPokemon(pokemon);
        listaCapturados.addPokemon(pokemon2);
    }
}
