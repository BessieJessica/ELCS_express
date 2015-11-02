package UITest;

import javax.swing.JPanel;
import javax.swing.JTextField;

public class textPanel extends JPanel {
	private JTextField textField;
	private JTextField txtEf;

	/**
	 * Create the panel.
	 */
	public textPanel() {
		setLayout(null);
		
		textField = new testText();
		textField.setBounds(95, 132, 366, 40);
		add(textField);
		textField.setColumns(10);
		
		txtEf = new JTextField();
		txtEf.setText("ef");
		txtEf.setBounds(218, 313, 96, 27);
		add(txtEf);
		txtEf.setColumns(10);

	}
}
