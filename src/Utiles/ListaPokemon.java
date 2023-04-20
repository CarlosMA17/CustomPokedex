package Utiles;
import pokemons.Pokemon;

import java.util.Scanner;

public class ListaPokemon {
    public Pokemon[] listaPokemon = new Pokemon[0];

    public ListaPokemon() {
    }

    public void addPokemon(Pokemon pokemon) {
        Pokemon[] listaPokemonNueva = new Pokemon[listaPokemon.length + 1];
        for (int i = 0; i < listaPokemonNueva.length; i++) {
            if (listaPokemonNueva[i] == null) {
                listaPokemonNueva[i] = pokemon;
                i = listaPokemonNueva.length;
            }
        }
        this.listaPokemon = listaPokemonNueva;
        for (int i = 0; i < listaPokemon.length; i++) {
            System.out.println(listaPokemon[i]);
        }
    }

    public void eliminarPokemon() {
        System.out.println("inttoduce el nombre del pokemon a eliminar:");
        Scanner sc = new Scanner(System.in);
        String nombrePokemon = sc.nextLine();
        for (int i = 0; i < this.listaPokemon.length; i++) {
            if (listaPokemon[i].getNombre().equals(nombrePokemon)) {
                listaPokemon[i] = null;
                Pokemon[] listaPokemonNueva = new Pokemon[listaPokemon.length - 1];
                for (int j = 0; j < listaPokemonNueva.length-1; j++) {
                    listaPokemonNueva[j] = listaPokemon[j];
                }

                for (int j = 0; j < listaPokemonNueva.length; j++) {
                    listaPokemon[j] = listaPokemonNueva[j];
                }

            } else {
                System.out.println("introduce verdadero nombre");
            }
            System.out.println(listaPokemon[i]);
        }
    }

}
