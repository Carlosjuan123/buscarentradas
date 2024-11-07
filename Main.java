import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Diario diario = new Diario();  

       
        while (true) {
        System.out.println("Ingresa la fecha en formato 'año, mes, día' (ejemplo ingreselo exactamente asi con lascomas, 2024, 11, 06) para buscar: ");
            String fechaInput = scanner.nextLine();

            try {
                String[] fechaParts = fechaInput.split(", ");
                int year = Integer.parseInt(fechaParts[0]);
                int month = Integer.parseInt(fechaParts[1]);
                int day = Integer.parseInt(fechaParts[2]);

                LocalDate fechaBuscada = LocalDate.of(year, month, day);

                
                diario.buscarEntradasPorFecha(fechaBuscada);  
            } catch (Exception e) {
                System.out.println("Formato de fecha incorrecto. Intente nuevamente.");
            }
        }
    }
}


