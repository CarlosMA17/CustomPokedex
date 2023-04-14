package Utiles;
import pokemons.Pokemon;

public class ListaPokemon {
    private Pokemon[] listaPokemon = new Pokemon[1];

    public ListaPokemon() {
    }

    public void añadirPokemon(Pokemon pokemon) {
        for (int i = 0; i < listaPokemon.length; i++) {
            if (listaPokemon[i] == null) {
                listaPokemon[i] = pokemon;
            }
        }
    }
}
