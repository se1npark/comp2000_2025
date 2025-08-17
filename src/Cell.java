import java.awt.Color;
import java.awt.Graphics;

public class Cell {
    // fields
    int x;
    int y;

    //constructor
    public Cell (int x, int y){
        this.x = x;
        this.y = y;
    }


    //methods
    void paint(Graphics g){
            g.setColor(Color.WHITE);
            g.fillRect(x,y,35,35);
            g.setColor(Color.BLACK);
            g.drawRect(x,y,35,35);
    }
}
