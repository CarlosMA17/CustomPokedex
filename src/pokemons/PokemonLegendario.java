package pokemons;

public class PokemonLegendario extends Pokemon{
    private String localizacion;

    public PokemonLegendario(String nombre, String tipo, float altura, float peso, String descripcion, String localizacion) {
        super(nombre, tipo, altura, peso, descripcion);
        this.localizacion = localizacion;
    }

    public PokemonLegendario(String nombre, String tipo) {
        super(nombre, tipo);
    }

    public String getLocalizacion() {
        return localizacion;
    }


    @Override
    public String toString() {
        return  "|---------------------------|\n|\t\t\t\t" +
                this.getNombre() + "\t\t|\n" +
                "|\t\t\t\t" + this.getTipo() + "\t\t|\n" +
                "|\t\t\t\tHT\t" + this.getAltura() + "\t\t|\n" +
                "|\t\t\t\tWT\t" + this.getPeso() + "\t\t|\n" +
                "|\t\t\t\t" + this.getLocalizacion() + "\t|\n" +
                "|-[]-[]-[]-[]---[]-[]-[]-[]-|\n" +
                this.getDescripcion() +
                "\n|---------------------------|";
    }
}
