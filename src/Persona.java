public class Persona {

    // Atributos
    private String nombre;
    private String apellidos;
    private Pasaporte pasaporte;         // Relacion Pasaporte
    private Mascota mascota;             // Relacion Mascota
    private MaquinaSoldar maquinaSoldar; // Relacion MaquinaSoldar

    // Metodos
    // Constructor
    public Persona(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
    }

    // Sacar Pasaporte
    public void sacarPasaporte(Pasaporte pasaporte){
        this.pasaporte = pasaporte;
    }

    // Tomar vuelo
    public void tomarVuelo(String pais) {

        if (pasaporte.isEstaVigente()) {
            System.out.println(nombre + " " + apellidos + " toma un vuelo a " + pais + ".");
        } else {
            System.out.println(nombre + " " + apellidos +
                    " no puede tomar el vuelo, ya que su pasaporte no está vigente.");
        }
    }

    // Adoptar Mascota
    public void adoptarMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    // Jugar con la Mascota
    public void jugarMascota(Mascota mascota){
        System.out.println(nombre + " " + apellidos +
                " juega con su mascota " + mascota.getNombre() + ".");
    }

    // Para soldar con Maquina soldar
    public void soldar(MaquinaSoldar maquinaSoldar, String metal) {
        maquinaSoldar.soldar(metal);
    }
}

