package claseteoria;

/**
 * @author Carlitos
 */
public class Pared {

    //Atributos
    
    private final int posX;
    private final int posY;
    
    //Constructor

    public Pared() {
        posX = (int) (Math.random()*75);
        posY = (int) (Math.random()*17);
        System.out.printf("pos pared (X:%d,Y:%d)\n", this.posX, this.posY);
    }
    
    //Getters

    public int getPosX() {
        return posX;
    }

    public int getPosY() {
        return posY;
    }
    
    
}
