package UITest;

import javax.swing.JPanel;
import javax.swing.JCheckBox;

public class testListPanel extends JPanel {

	/**
	 * Create the panel.
	 */
	public testListPanel() {
		setLayout(null);

		testCheckBox checkBox = new testCheckBox();
		checkBox.setSelected(true);
		checkBox.setBounds(339, 169, 149, 29);
		add(checkBox);
	}
}
