package proyecto;

import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class BackgroundPanel extends JPanel {
    private Image bg;

    @Override
    public void paint(Graphics g) {
        bg = new ImageIcon(getClass().getResource("/resources/bg.png")).getImage();
        g.drawImage(bg, 0, 0, getWidth(), getHeight(), this);
        setOpaque(false);
        super.paint(g);
        
    }
}
