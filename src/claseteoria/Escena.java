package claseteoria;

import java.util.Scanner;

/**
 * @author Carlitos
 */
public class Escena {


    // Atributos 
    private Auto auto;
    private Pared pared;

    //Contructor
    public Escena(Auto auto) {
        this.auto = auto;
        this.pared = new Pared();
    }

    //Getters && Setter
    public void setAuto(Auto auto) {
        this.auto = auto;
    }

    //Metodos
    public void verificarAuto() {
        if (pared.getPosX() == auto.getPosX() || pared.getPosY() == auto.getPosY()) {
            auto.setChocado(true);
            System.out.println("CHOCASTE");
        }
    }

    public void jugar() {
        Scanner input = new Scanner(System.in);
        char option;

        do {

            System.out.println("---------MENU----------");
            System.out.println("W- Mover arriba");
            System.out.println("S- Mover abajo");
            System.out.println("D- Mover derecha");
            System.out.println("A- Mover izquierda");
            System.out.println("E- Salir");
            System.out.print("Elija una op: ");

            option = input.nextLine().toLowerCase().charAt(0);

            switch (option) {
                case 'w':
                    auto.moverArriba();
                    verificarAuto();
                    break;
                case 's':
                    auto.moverAbajo();
                    verificarAuto();
                    break;
                case 'd':
                    auto.moverDerecha();
                    verificarAuto();
                    break;
                case 'a':
                    auto.moverIzquierda();
                    verificarAuto();
                    break;
                case 'e':
                    System.out.println("Saliendo.....");
                    break;
                default:
                    System.out.println("Opción no valida!!");
            }

        } while (option != 'e' && !auto.isChocado());

    }
}
