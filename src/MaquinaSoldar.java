public class MaquinaSoldar {

    // Atributos
    private String marca;
    private String modelo;
    private double potencia;
    private String[] metales;

    // Metodos
    // Constructor
    public MaquinaSoldar(String marca, String modelo, double potencia, String[] metales) {
        this.marca = marca;
        this.modelo = modelo;
        this.potencia = potencia;
        this.metales = metales;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPotencia() {
        return potencia;
    }

    public String[] getMetales() {
        return metales;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public void setMetales(String[] metales) {
        this.metales = metales;
    }

    // Soldar
    public void soldar(String metal) {
        for (String metalpermitido : metales) {
            if (metalpermitido.equalsIgnoreCase(metal)) {
                System.out.println("La maquina de soldar " + marca + " " + modelo +
                        " solda el " + metal + ".");
                return;
            }
        }

        System.out.println("La maquina de soldar " + marca + " " + modelo +
                " no puede soldar " + metal + ".");
    }
}
