package proyecto;
import java.awt.Color;
import javax.swing.JTextField;
// import TextPrompt from swingx located at java-swing-project/lib/swingx-all-1.6.4.jar

public class ShowHint {

// Esta clase tiene como único objetivo establecer hints a textos en una línea
    public static void setHint(String hint, JTextField field) {
        TextPrompt textHint = new TextPrompt(hint, field);
        textHint.setFont(field.getFont());
        textHint.setForeground(Color.BLACK);
        textHint.changeAlpha(0.5f);

    }

}