import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Diario {

    private List<Entrada> entradas;

    public Diario() {
        entradas = new ArrayList<>();
        entradas.add(new Entrada(LocalDate.of(2024, 11, 6)));  // Entrada para la fecha 2024-11-06
        entradas.add(new Entrada(LocalDate.of(2024, 11, 7)));  // Entrada para la fecha 2024-11-07
        // Puedes agregar más fechas aquí si lo deseas
    }

    public void buscarEntradasPorFecha(LocalDate fecha) {
        boolean encontrado = false;
        for (Entrada entrada : entradas) {
            if (entrada.getFecha().equals(fecha)) {
                System.out.println(entrada);
                encontrado = true;
            }
        }
        if (!encontrado) {
            System.out.println("No se encontraron entradas para la fecha: " + fecha);
        }
    }

    static class Entrada {
        private String titulo;
        private LocalDate fecha;
        private String contenido;

        public Entrada(LocalDate fecha) {
            this.fecha = fecha;
            this.titulo = "Entrada comprada el día " + fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear();
            this.contenido = "Entrada de la fecha: " + fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear();
        }

        public LocalDate getFecha() {
            return fecha;
        }

        public String toString() {
            return "Titulo: " + titulo + "\nFecha: " + fecha.getDayOfMonth() + "/" + fecha.getMonthValue() + "/" + fecha.getYear() + "\nContenido: " + contenido;
        }
    }
}
