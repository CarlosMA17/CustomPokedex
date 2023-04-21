package Utiles;
import pokemons.Pokemon;

import java.util.Scanner;

public class ListaPokemon {
    public Pokemon[] listaPokemon = new Pokemon[0];

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
        System.out.println("pokemon añadido");
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
                for (int j = 0; j < listaPokemonNueva.length; j++) {
                    listaPokemonNueva[j] = listaPokemon[j];
                }
                this.listaPokemon = listaPokemonNueva;
            }
        }
        System.out.println("la lista de pokemon quedo asi: ");
        for (int i = 0; i < this.listaPokemon.length; i++) {
            System.out.println(i + "-\n" + this.listaPokemon[i]);
        }
    }

    public void mostrarPokemons() {
        System.out.println("mostrando pokemons...");
        for (int i = 0; i < listaPokemon.length; i++) {
            System.out.println(listaPokemon[i]);
        }
    }

    public Pokemon selectorPokemon(int posicionPokemon) {
        System.out.println("mostrando el pokemon " + i);
        if (posicionPokemon >= this.listaPokemon.length) {
            return null;
        } else {
            return this.listaPokemon[posicionPokemon];
        }
    }
}
