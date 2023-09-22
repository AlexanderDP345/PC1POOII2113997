import java.util.Random;
import java.util.Scanner;
//importe random y scanner para generar números aleatorios y recibir entrada del usuario

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //para leer la entrada del usuario
        Random random = new Random();
        //new random para crear una nueva instancia

        char respuesta;
        do {
            System.out.println("Tirando los dados...");
            int dado1 = random.nextInt(6) + 1;
            //el dado 1
            int dado2 = random.nextInt(6) + 1;
            //el dado 2
            //coloque los limites del dado
            System.out.println("Sus valores son:");
            System.out.println(dado1 + " " + dado2);

            System.out.print("¿volver a tirar los dados (y = yes)? ");
            respuesta = scanner.next().charAt(0);

//cuando ponemos y el bucle se repetira y tiraras los dados otra vez
            if (respuesta != 'y' && respuesta != 'Y') {
                System.out.println("termino el proceso de los dados");
                scanner.close(); 
                //cierra el objeto llamado scanner

                System.exit(0); // Terminar el programa
            }

        } while (respuesta == 'y' || respuesta == 'Y');
        //El do while de tipo char para almacenar la respuesta del usuario
    }
}