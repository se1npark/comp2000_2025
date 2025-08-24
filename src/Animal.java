import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public class Animal {
    Cell cell;

    public Animal(Cell c){
      cell = c;
    }

    public void paint(Graphics g, Point mousePos, Color fill, Color outline, Color mouse) {
    if(cell.contains(mousePos)){
        g.setColor(mouse);
    }else{
        g.setColor(fill);
    }
    g.fillRect(cell.x, cell.y, Cell.size, Cell.size);
    g.setColor(outline);
    g.drawRect(cell.x, cell.y, Cell.size, Cell.size);
    }

    public boolean contains(Point p){
        return cell.contains(p);
    }
}
