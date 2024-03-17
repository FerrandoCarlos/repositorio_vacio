package claseteoria;

import java.util.Scanner;

/**
 * @author Carlitos
 */
public class ClaseTeoria {

    public static void main(String[] args) {
        //crearAuto();
        //Auto ford = new Auto (12, 7);

        Escena juegoNuevo = new Escena(crearAuto());
        
        juegoNuevo.jugar();

    }

    private static Auto crearAuto() {
        Scanner input = new Scanner(System.in);
        int coordenadaX;
        int coordenadaY;
        boolean flag;
        Auto auto;
        do {
            System.out.println("Ingrese una coordenada X para posicionar el auto.");
            coordenadaX = Integer.parseInt(input.nextLine());
            while (coordenadaX < 0 || coordenadaX > 80) {
                System.out.println("Ingrese nuevamente la coordenada X.");
                System.out.println("Debe ser mayor o igual a 0 y menor o igual a 80.");
                coordenadaX = Integer.parseInt(input.nextLine());
            }
            System.out.println("Ingrese una coordenada Y para posicionar el auto.");
            coordenadaY = Integer.parseInt(input.nextLine());
            while ((coordenadaY < 0 || coordenadaY > 22)) {
                System.out.println("Ingrese nuevamente la coordenada Y.");
                System.out.println("Debe ser mayor o igual a 0 y menor o igual a 80.");
                coordenadaY = Integer.parseInt(input.nextLine());
            }
            auto = new Auto(coordenadaX, coordenadaY);
            flag = true;
        } while (!flag);
        System.out.printf("Felicitaciones el auto se a creado en la posición X: %d,Y: %d",coordenadaX,coordenadaY);
        return auto;
    }

}
