package proyecto;

import javax.swing.InputVerifier;
import javax.swing.JComponent;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.time.Year;




public class Verify {

    //Verificador de cedula
    public static class CodigoVerifier extends InputVerifier {
        @Override
        public boolean verify(JComponent input) {
            JTextField textField = (JTextField) input;
            try {
                int number = Integer.parseInt(textField.getText());    
                if (number > 0 && number <= 9999) {
                    return true;
                }       
                else {
                    JOptionPane.showMessageDialog(null, "El código debe ser un entero positivo de máximo 4 dígitos", "Alerta: Dato Incorrecto", JOptionPane.WARNING_MESSAGE);
                    textField.setText("");
                    return false;
                }    
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(null, "El código debe ser un entero positivo de máximo 4 dígitos", "Alerta: Dato Incorrecto", JOptionPane.WARNING_MESSAGE);
                textField.setText("");
                return false;
                
                }
            }
        }

// Verificador de fecha
public static class CalendarVerifier extends InputVerifier {
    @Override
    public boolean verify(JComponent input) {
        JFormattedTextField textField = (JFormattedTextField) input;
        String fecha = textField.getText();

        if (fecha.length() == 0) {
            return true;
        } else {
            try {
                String anio = fecha.substring(6, 10);
                Integer anioInt = Integer.parseInt(anio);
                System.out.println("EL AñO ES " + anioInt);

                Year anioActual = Year.now();
                String anioActualStr = anioActual.toString();
                Integer anioActualInt = Integer.parseInt(anioActualStr);
                Integer anioMax = anioActualInt - 5;
                Integer anioMin = anioActualInt - 21;
                System.out.println("El aniomax es " + anioMax);
                System.out.println("El aniomin es: " + anioMin);

                if (anioInt >= anioMin && anioInt <= anioMax) {
                    return true;
                } else {
                    JOptionPane.showMessageDialog(null, "Ingrese el estudiante no puede ser menor de 5 años, ni mayor de 21 años", "Alerta: Dato Incorrecto", JOptionPane.WARNING_MESSAGE);
                    textField.setText("");
                    return false;
                }
            } catch (NumberFormatException | StringIndexOutOfBoundsException e) {
                // Handle the case where the date format is not valid
                JOptionPane.showMessageDialog(null, "Ingrese una fecha válida", "Alerta: Dato Incorrecto", JOptionPane.WARNING_MESSAGE);
                textField.setText("");
                return false;
            }
        }
    }
}
    //Verificador de cedula
    public static class CedulaVerifier extends InputVerifier {
    @Override
    public boolean verify(JComponent input) {
        JTextField textField = (JTextField) input;
        try {
            int number = Integer.parseInt(textField.getText());    
            if (number > 0 && number <= 99999999) {
                return true;
            }       
            else {
                JOptionPane.showMessageDialog(null, "La cédula debe ser un entero positivo de máximo 8 dígitos", "Alerta: Dato Incorrecto", JOptionPane.WARNING_MESSAGE);
                textField.setText("");
                return false;
            }    
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "La cédula debe ser un entero positivo de máximo 8 dígitos", "Alerta: Dato Incorrecto", JOptionPane.WARNING_MESSAGE);
            textField.setText("");
            return false;
            
            }
        }
    }
   
    //Verificador de caracteres, recibe como parámetro la longitud maxima
    public static class MaxLengthVerifier extends InputVerifier {
        private int maxLength;

        public MaxLengthVerifier(int maxLength) {
            this.maxLength = maxLength;
        }

        @Override
        public boolean verify(JComponent input) {
            JTextField textField = (JTextField) input;

            if (textField.getText().length()<= maxLength) {
                if (textField.getText().length() == 0) {
                    JOptionPane.showMessageDialog(null, "El campo seleccionado no debe estar vacío", "Alerta: Dato Incorrecto", JOptionPane.WARNING_MESSAGE);
                    textField.setText("");
                    return false;

                }
                else {
                    return true;
                }
               
            }
            

            else {
                JOptionPane.showMessageDialog(null, "El campo no debe tener más de "+maxLength+ " caracteres", "Alerta: Dato Incorrecto", JOptionPane.WARNING_MESSAGE);
                textField.setText("");
                return false;
            }
        }
    }


   //Verificador de caracteres, recibe como parámetro la longitud maxima
   public static class MaxLengthAreaVerifier extends InputVerifier {
    private int maxLength;

    public MaxLengthAreaVerifier(int maxLength) {
        this.maxLength = maxLength;
    }

    @Override
    public boolean verify(JComponent input) {
        JTextArea textArea = (JTextArea) input;

        if (textArea.getText().length()<= maxLength) {
            return true;
        }
        

        else {
            JOptionPane.showMessageDialog(null, "El campo no debe tener más de "+maxLength+ " caracteres", "Alerta: Dato Incorrecto", JOptionPane.WARNING_MESSAGE);
            textArea.setText("");
            return false;
        }
    }
}


    // Verificador de correo electrónico
    public static class EmailVerifier extends InputVerifier {
        @Override
        public boolean verify(JComponent input) {
            JTextField textField = (JTextField) input;
            String email = textField.getText().trim();

            // RegeX GOES YEEHAAAW
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";

            if (email.matches(emailRegex)) {
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Ingrese una dirección de correo electrónico válida", "Alerta: Dato Incorrecto", JOptionPane.WARNING_MESSAGE);
                textField.setText("");
                return false;
            }
        }
    }



   // Verificador de telefono
   public static class TelefonoVerifier extends InputVerifier {
    @Override
    public boolean verify(JComponent input) {
        JTextField textField = (JTextField) input;
        String telefono = textField.getText().trim();

        // RegeX GOES YEEHAAAW
        String telefonoRegex = "^(\\+[0-9]{1,3})?([0-9]{10,11})$";

        if (telefono.matches(telefonoRegex)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Ingrese un teléfono válido", "Alerta: Dato Incorrecto", JOptionPane.WARNING_MESSAGE);
            textField.setText("");
            return false;
        }
    }
}




}



