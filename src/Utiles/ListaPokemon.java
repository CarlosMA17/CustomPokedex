package Utiles;
import pokemons.Pokemon;

public class ListaPokemon {
    public Pokemon[] listaPokemon = new Pokemon[1];

    public ListaPokemon() {
    }

    public void addPokemon(Pokemon pokemon) {
        Pokemon[] listaPokemonNueva = new Pokemon[listaPokemon.length + 1];
        for (int i = 0; i < listaPokemon.length; i++) {
            listaPokemonNueva[i] = listaPokemon[i];
        }
        for (int i = 0; i < listaPokemonNueva.length; i++) {
            if (listaPokemonNueva[i] == null) {
                listaPokemonNueva[i] = pokemon;
                i = listaPokemonNueva.length;
            }
        }
        this.listaPokemon = listaPokemonNueva;

    }

}
