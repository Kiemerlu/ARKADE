package projekt;
import ea.*;

/**
 * Created by manuel on 18.05.2017.
 */
public class ARKADE extends Game implements Ticker{
    Person figur;
    public static void main(String[] args) {
        Game arkade = new ARKADE();
    }

    public ARKADE(){
        super(800,600);
        //hintergrundSetzen(new Bild(0,0,));
        manager.anmelden(this,10);
        figur = new Person (200,300);
        wurzel.add(new Schlüssel(750,550,"D:\\IntelliJProjects\\Projekt\\ARKADE\\Projekt\\src\\projekt\\assets\\SchlüsselAusgeschnitten.png"));
        wurzel.add(new Schlüssel(650,550,"D:\\IntelliJProjects\\Projekt\\ARKADE\\Projekt\\src\\projekt\\assets\\GoldenerSchlüssel.png"));
        wurzel.add(figur);
    }


    @Override
    public void tasteReagieren(int i) {
        if (i == 22) figur.drehenAbsolut( 0  );
        else if (i == 0) figur.drehenAbsolut(270  );
        else if (i == 18) figur.drehenAbsolut(180);
        else if (i == 3) figur.drehenAbsolut(90);
        System.out.println(i);
    }
    @Override
    public void tick(){
        if(tasteGedrueckt(Taste.W)){
            figur.moveForward();
        }
        else if (tasteGedrueckt(Taste.A))
            figur.moveLeft();
        else if (tasteGedrueckt(Taste.S)) figur.moveBack();
        else if (tasteGedrueckt(Taste.D)) figur.moveRight();


    }
}
