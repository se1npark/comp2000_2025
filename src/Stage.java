import java.awt.Graphics;
import java.util.List;
import java.awt.Point;
import java.util.ArrayList;

public class Stage {
  Grid grid;
  Actor cat;
  Actor dog;
  Actor bird;
  List<Actor> actors; 

  public Stage() {
    grid = new Grid();
    cat = new Cat(grid.cellAtColRow(0, 0));
    dog = new Dog(grid.cellAtColRow(0, 15));
    bird = new Bird(grid.cellAtColRow(12, 9));
    actors = new ArrayList<Actor>();
    actors.add(bird);
    actors.add(dog);
    actors.add(cat);

  }

  public void paint(Graphics g, Point mouseLoc) {
    grid.paint(g, mouseLoc);
    for (Integer i = 0; i < actors.size(); i++){
      actors.get(i).paint(g);
    }
  }
}
