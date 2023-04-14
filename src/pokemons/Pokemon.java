package pokemons;

public class Pokemon {
        private String nombre;
        private String tipo;
        private float altura;
        private float peso;
        private String descripcion;

    public Pokemon(String nombre, String tipo, float altura, float peso, String descripcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.altura = altura;
        this.peso = peso;
        this.descripcion = descripcion;
    }

    public Pokemon(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }


    public String getNombre() {
        if (nombre == null) {
            return "????";
        } else {
            return nombre;
        }
    }

    public String getTipo() {
        if (tipo == null) {
            return "????";
        } else {
            return tipo;
        }
    }

    public float getAltura() {
        if (altura == 0f) {
            return 0000f;
        } else {
            return altura;
        }
    }

    public float getPeso() {
        if (peso == 0f) {
            return 0000f;
        } else {
            return peso;
        }
    }

    public String getDescripcion() {
        if (descripcion == null) {
            return "????";
        } else {
            return descripcion;
        }
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return  "|---------------------------|\n|\t\t\t\t" +
                this.getNombre() + "\t\t|\n" +
                "|\t\t\t\t" + this.getTipo() + "\t\t|\n" +
                "|\t\t\t\tHT\t" + this.getAltura() + "\t\t|\n" +
                "|\t\t\t\tWT\t" + this.getPeso() + "\t\t|\n" +
                "|-[]-[]-[]-[]---[]-[]-[]-[]-|\n" +
                this.getDescripcion() +
                "\n|---------------------------|";
    }
}
