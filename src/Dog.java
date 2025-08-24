import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Dog extends Animal{
    public Dog(Cell c){
        super(c);
    }

    public void paint(Graphics g, Point mousePos){
        super.paint(g, mousePos, Color.ORANGE, Color.BLACK, new Color(156, 93, 34));
    }
}
