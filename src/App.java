import Controllers.PersonaController;
import Models.Persona;
import views.ViewConsole;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[] {
            new Persona("Juan", 25),
            new Persona("Maria", 30),
            new Persona("Carlos", 22),
            new Persona("Ana", 28),
            new Persona("Luis", 35),
            new Persona("Sofia", 27),
            new Persona("Miguel", 40),
            new Persona("Laura", 32),
            new Persona("Pedro", 29),
            new Persona("Elena", 26)



        };

        ViewConsole VC = new ViewConsole();
        PersonaController PC = new PersonaController();
    
        VC.printMessage("Personas");
        VC.printPersonsArray(personas);
        PC.ordenarPorEdad(personas);
        System.out.print("\n");
        VC.printMessage("Arreglo Ordenado por Edad");
        VC.printPersonsArray(personas);
        Persona p = PC.buscarPorEdad(personas, 40);
        if (p == null){
            VC.printMessage("No existe una persona con esa edad");
        }else{
            VC.printMessage("\n\tLa persona con la edad 40 es: ");
            VC.printMessage("\t" + p);
        }
        Persona pe = PC.buscarPorEdad(personas, 99);
        if (pe == null){
            VC.printMessage("No existe una persona con esa edad");
        }else{
            VC.printMessage("\tLa persona con la edad 40 es: ");
            VC.printMessage("\t" + pe);
        }

        


       

    }
    
}
