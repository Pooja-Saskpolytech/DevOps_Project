package classes;
import java.awt.Dimension;
import java.awt.Font;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class TitleBar extends JPanel{

	TitleBar()
	{
		this.setPreferredSize(new Dimension(400,100));
		
		JLabel titleText = new JLabel("DevOps Project Task List");
		titleText.setPreferredSize(new Dimension(400,100));
		titleText.setFont(new Font("Sans-serif",Font.BOLD, 20));
		titleText.setHorizontalAlignment(JLabel.CENTER);
		this.add(titleText);
	}
}
