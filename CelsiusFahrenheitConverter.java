package gui;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

/**
 * This class converts a number in celsius to fahrenheit
 * below is setting up fields
 * @author natecolbrunn
 *
 */
public class CelsiusFahrenheitConverter extends JFrame {
	JPanel panel;
	
	JLabel label;
	JTextField textFeild;
	JButton button;
	JButton button2;
	
	final int WINDOW_WIDTH = 500, WINDOW_HEIGHT = 150;

	//private JButton button2;
	
	/**
	 * this is the constructor, it initializes the gui size and calls the build panel method
	 */
	public CelsiusFahrenheitConverter() {
		setTitle("Temperature Coverter");
		setSize(WINDOW_WIDTH,WINDOW_HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		buildPanel();
		add(panel);
		setVisible(true);
	}
	
	/**
	 * this method initializes the gui text, button, and adds the to the panel
	 */
	private void buildPanel() {
		label = new JLabel("Enter temperature");
		textFeild = new JTextField(10);
		button = new JButton("Convert to Fahrenheit");
		button2 = new JButton("Convert to Celsius");
		button.addActionListener(new ConvertButtonListener());
		button2.addActionListener(new ConvertButtonListener2());
		panel = new JPanel();
		panel.add(label);
		panel.add(textFeild);
		panel.add(button);
		panel.add(button2);
		
	
	}
	
	/**
	 * when the button is pushed this method is called and it puts the inputed number into the equation to calculate
	 * @author natecolbrunn
	 *
	 */
	private class ConvertButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			String temperature = textFeild.getText();
			double fTemp = Double.parseDouble(temperature);
			double cTemp = (9.0/5) * fTemp + 32;
			//double temp3 = (temp1 - 32) * (5.0/9);
			JOptionPane.showMessageDialog(panel, cTemp+"ºF" , "Answer" , JOptionPane.DEFAULT_OPTION);
		}
	}
	/**
	 * when the second button is pressed this method is called to convert it to Celsius
	 * @author natecolbrunn
	 *
	 */
	
	private class ConvertButtonListener2 implements ActionListener{
		public void actionPerformed(ActionEvent arg0) {
			String temperature = textFeild.getText();
			double cTemp = Double.parseDouble(temperature);
			
			if (cTemp <= 2000) {
				double fTemp = (cTemp - 32) * (5.0/9);
				JOptionPane.showMessageDialog(panel, fTemp+"ºC" , "Answer" , JOptionPane.DEFAULT_OPTION);
			}
			else
			{
				JOptionPane.showMessageDialog(panel, "Please enter a valid Number" , "ERROR" , JOptionPane.ERROR);
			}
		}
	}
	/**
	 * this method runs at the start of the program and start with the constructor
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CelsiusFahrenheitConverter();
		
	}

}
