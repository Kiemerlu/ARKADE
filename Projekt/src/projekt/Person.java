package projekt;
import ea.*;
import org.omg.CORBA.SystemException;

/**
 * Created by manuel on 18.05.2017.
 */
public class Person extends Bild {
    public Person(int xPos,int yPos) {
        super(xPos,yPos,"D:\\IntelliJProjects\\Projekt\\ARKADE\\Projekt\\src\\projekt\\assets\\Hut.png");
    }
    void moveForward(){
        bewegen(0,-1);
    }
    void moveBack(){
        bewegen(0,1);
    }
    void moveLeft() {
        bewegen(-1,0);
    }
    void moveRight(){
        bewegen(1,0);
    }



}

