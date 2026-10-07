import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        // Crear personas
        Persona persona1 = new Persona("Jose Daniel", "Castillo Cruz");
        Persona persona2 = new Persona("Allyson", "Ramirez Ramirez");

        // Crear pasaportes
        Pasaporte pasaporte1 = new Pasaporte(
                "CR01234",
                "Costarricense",
                LocalDate.of (2024, 1, 10),
                LocalDate.of(2034,1,10),
                true
                );

        Pasaporte pasaporte2 = new Pasaporte(
                "CR56789",
                "Costarricense",
                LocalDate.of(2015,5,20),
                LocalDate.of(2025,5,20),
                false
                );

        // Asignar pasaportes
        persona1.sacarPasaporte(pasaporte1);
        persona2.sacarPasaporte(pasaporte2);

        // Tomar vuelos
        persona1.tomarVuelo("Alemania");
        persona2.tomarVuelo("Noruega");

        // Crear mascota
        Mascota mascota = new Mascota("Skunk","Doberman", 8);

        // Adoptar a la misma mascota
        persona1.adoptarMascota(mascota);
        persona2.adoptarMascota(mascota);

        // Jugar con la mascota
        persona1.jugarMascota(mascota);
        persona2.jugarMascota(mascota);

        // Metales que puede soldar
        String[] metales = {"hierro", "acero", "aluminio"};

        // Crear maquina de soldar
        MaquinaSoldar maquina = new MaquinaSoldar(
                "NEO",
                "Modelo IE 9200/1/220",
                2000,
                metales
        );

        // Intento de soldadura
        persona1.soldar(maquina,"hierro");
        persona1.soldar(maquina,"titanio");
    }
}
