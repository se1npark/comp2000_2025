import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Rabbit extends Animal{
    public Rabbit(Cell c){
        super(c);
    }

    public void paint(Graphics g, Point mousePos){
        super.paint(g, mousePos, Color.PINK, Color.BLACK, new Color(117, 26, 113));
    }
}
