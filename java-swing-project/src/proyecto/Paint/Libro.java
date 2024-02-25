
import javax.swing.*;
import java.awt.*;
import proyecto.Colors;
/**
 *
 * @author juan
 */
public class Libro extends JFrame {

    public Libro( ){
        this.setSize(512,512);
        this.setTitle("Libro Barreto");
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        this.add(panel);
        panel.setLayout(null);
        panel.setVisible(true);
        this.setVisible(true);
    }
    
    
    public void paint(Graphics g){
    super.paint(g);
    Graphics2D g2d = (Graphics2D) g;
    g2d.setStroke(new BasicStroke(2));
    
    

    g.setColor(Colors.transBlue);
    g.fillRect(50, 100, 140, 200); //rectangulo cara

    g.setColor(Colors.darkBlue);
    int[] x = {50,190,190,192,192,56,72,208,208,210,210,70,50};
    int[] y = {100,100,300,298,98,98,82,82,282,280,80,80,100}; //borde libro
    g.fillPolygon(x,y,12);

    g.setColor(Colors.sheetYellow);
    int[] x1 = {56,192,192,208,208,72,56};
    int[] y1 = {98,98,298,282,82,82,80};
    g.fillPolygon(x1,y1,6);
    }

    public static void main(String[] args) {
        Libro d1 = new Libro();
        d1.setVisible(true);
    }
    
}
