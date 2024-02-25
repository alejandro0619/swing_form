// package proyecto;

// import java.awt.Graphics;
// import java.awt.image.BufferedImage;
// import java.io.IOException;

// import javax.imageio.ImageIO;
// import java.net.URL;
// import javax.swing.JPanel;

// public class BackgroundPanel extends JPanel {

//     private BufferedImage image;

//     public BackgroundPanel() {
//         try {
//             URL iconURL = getClass().getResource("/resources/notepad.png");
//             image = ImageIO.read(iconURL);
//         } catch (IOException e) {
//             e.printStackTrace();
//         }
//     }

//     @Override
//     protected void paintComponent(Graphics g) {
//         super.paintComponent(g);
//         g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), null);
//     }

// }

