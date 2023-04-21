import Utiles.ListaPokemon;
import pokemons.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scString = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);

        PokemonLegendario pokemonPrueba = new PokemonLegendario("Charizar", "fuego", 6, 6, " Lorem Ipsum is simply\n" +
                " dummy text of the printing\n and typesetting industry.\n Lorem Ipsum has been\n" +
                " the industry's standard dummy\n text ever since the 1500s ", "en el rio");

        Pokemon pokemon2Prueba =  new Pokemon("bulbasur", "fuego", 6, 6,  "Lorem Ipsum is simply\n" +
                " dummy text of the printing\n and typesetting industry.\n Lorem Ipsum has been\n" +
                " the industry's standard dummy\n text ever since the 1500s ");

        System.out.println("bienvenido al programa, hay 2 pokemons, uno en la lista de avistados:");
        ListaPokemon listaAvistados = new ListaPokemon();

        System.out.println("y otro en la lista de capturados");
        ListaPokemon listaCapturados = new ListaPokemon();

        listaAvistados.addPokemon(pokemonPrueba);
        listaCapturados.addPokemon(pokemon2Prueba);
        boolean salir = false;
        while (!salir) {
            System.out.println("elija una opcion");
            System.out.println("        a Añadir un pokemon avistado \n" +
                    "        b Añadir avistamiento \n" +
                    "        c Pasar a capturados\n" +
                    "        d Mostrar lista de avistados \n" +
                    "        e Mostrar lista de capturados \n" +
                    "        f Cerrar la pokedex ");
            String opcion = scString.nextLine();



            switch (opcion) {
                case "a":
                    Pokemon pokemon = new Pokemon();

                    System.out.println("un pokemon legendario? 1- si, 2- no");
                    int seleccionTipo = sc.nextInt();
                    System.out.println("introduce el nombre");
                    String nombre = scString.nextLine();
                    System.out.println("introduce el tipo");
                    String tipo = scString.nextLine();
                    ;
                    System.out.println("introduce la estatura");
                    int altura = sc.nextInt();
                    System.out.println("introduce el peso");
                    int peso = sc.nextInt();
                    System.out.println("introduce la descripcion del pokemon");
                    String descripcion = scString.nextLine();
                    if (seleccionTipo == 1) {
                        System.out.println("introduce el lugar donde se encuentra");
                        String lugar = scString.nextLine();
                        pokemon = new PokemonLegendario(nombre, tipo, altura, peso, lugar, descripcion);
                    } else {
                        pokemon = new Pokemon(nombre, tipo, altura, peso, descripcion);
                    }
                    listaAvistados.addPokemon(pokemon);
                    break;
                case "b":
                    System.out.println("un pokemon legendario? 1- si, 2- no");
                    seleccionTipo = sc.nextInt();
                    System.out.println("introduce el nombre");
                    nombre = scString.nextLine();
                    System.out.println("introduce el tipo");
                    tipo = scString.nextLine();

                    System.out.println("introduce la estatura");
                    altura = sc.nextInt();
                    System.out.println("introduce el peso");
                    peso = sc.nextInt();
                    System.out.println("introduce la descripcion del pokemon");
                    descripcion = scString.nextLine();
                    if (seleccionTipo == 1) {
                        System.out.println("introduce el lugar donde se encuentra");
                        String lugar = scString.nextLine();
                        pokemon = new PokemonLegendario(nombre, tipo, altura, peso, lugar, descripcion);
                    } else {
                        pokemon = new Pokemon(nombre, tipo, altura, peso, descripcion);
                    }
                    listaCapturados.addPokemon(pokemon);
                    break;
                case "c":
                    System.out.println("introduzca el nombre del pokemon:");
                    nombre = scString.nextLine();
                    int posicion = 0;
                    for (int i = 0; i < listaAvistados.listaPokemon.length; i++) {
                        if (nombre.equals(listaAvistados.listaPokemon[i])) {
                            posicion = i;
                        }
                    }
                    listaCapturados.addPokemon(listaAvistados.selectorPokemon(posicion));
                    listaAvistados.eliminarPokemon(nombre);
                    break;
                case "d":
                    listaAvistados.mostrarPokemons();
                    break;
                case "e":
                    listaCapturados.mostrarPokemons();
                    break;
                case "f":
                    System.out.println("hasta la proxima :)");
                    salir = true;
            }
        }
    }
}
