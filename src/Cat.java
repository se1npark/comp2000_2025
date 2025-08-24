import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Cat extends Animal {
    public Cat(Cell c){
        super(c);
    }

    public void paint(Graphics g, Point mousePos){
        super.paint(g, mousePos, Color.BLUE, Color.BLACK, new Color(45, 43,140));
    }
}
