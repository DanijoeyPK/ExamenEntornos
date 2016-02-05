package ejcalendario;


	import java.awt.*;
	import javax.swing.*;
	import com.toedter.calendar.JDateChooser;

	public class EjCalendario extends JFrame {

	    private JDateChooser jdFecha;
	    public EjCalendario(){
        	setTitle("Ejemplo");
	        JPanel panel = new JPanel(new FlowLayout());
        	JLabel label = new JLabel("Fecha");
	        jdFecha = new JDateChooser("dd/MM/yy","##/##/##",'-');
            	panel.add(label);
	        panel.add(jdFecha);
              	setContentPane(panel);
        	setVisible(true);
        	pack();
    	}
      
    	public static void main(String[] args) {
        	EjCalendario frame = new EjCalendario();
                frame.setLocationRelativeTo(null);
    		}
	}