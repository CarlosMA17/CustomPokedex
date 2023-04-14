import Utiles.ListaPokemon;
import pokemons.Pokemon;
import pokemons.PokemonLegendario;

public class Main {

    public static void main(String[] args) {
        PokemonLegendario pokemon = new PokemonLegendario("prueba", "prueba", 6, 6, " Lorem Ipsum is simply\n" +
                " dummy text of the printing\n and typesetting industry.\n Lorem Ipsum has been\n" +
                " the industry's standard dummy\n text ever since the 1500s ", "en el rio");
        System.out.println(pokemon);

        ListaPokemon lista = new ListaPokemon();
        lista.añadirPokemon(pokemon);
        System.out.println(lista);
    }
}
