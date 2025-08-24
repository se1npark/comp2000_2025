import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main extends JFrame {
    public static void main(String[] args) throws Exception {
      Main window = new Main();
      window.run();
    }

    class Canvas extends JPanel {
      Grid grid = new Grid();
      Cat cat;
      Dog dog;
      Rabbit rabbit;

      int row1 = (int)(Math.random() * 20);
      int col1 = (int)(Math.random() * 20);

      int row2 = (int)(Math.random() * 20);
      int col2 = (int)(Math.random() * 20);

      int row3 = (int)(Math.random() * 20);
      int col3 = (int)(Math.random() * 20);

      public Canvas() {
        setPreferredSize(new Dimension(720, 720));

        Cell cCell = new Cell(10 + row1 * Cell.size, 10 + col1 * Cell.size);
        cat = new Cat(cCell);

        Cell dCell = new Cell(10 + row2 * Cell.size, 10 + col2 * Cell.size);
        dog = new Dog(dCell);

        Cell rCell = new Cell(10 + row3 * Cell.size, 10 + col3 * Cell.size);
        rabbit = new Rabbit(rCell);
      }

      @Override
      public void paint(Graphics g) {
        grid.paint(g, getMousePosition());
        cat.paint(g, getMousePosition());
        dog.paint(g, getMousePosition());
        rabbit.paint(g, getMousePosition());
      }
    }

    private Main() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Canvas canvas = new Canvas();
      this.setContentPane(canvas);
      this.pack();
      this.setVisible(true);
    }

    public void run() {
      while(true) {
        repaint();
      }
    }
}
