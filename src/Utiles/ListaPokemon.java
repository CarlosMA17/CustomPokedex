package Utiles;

import pokemons.Pokemon;

public class ListaPokemon {
    private Pokemon listaPokemon[];

    public ListaPokemon() {
    }

    public ListaPokemon(Pokemon listaPokemon) {
    }

    public void añadirPokemon(Pokemon pokemon) {
        for (int i = 0; i < listaPokemon.length; i++) {
            if (listaPokemon[i] == null) {
                listaPokemon[i] = pokemon;
            }
        }
    }
}
