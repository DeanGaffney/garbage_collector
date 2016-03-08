import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


public class GUI extends JPanel implements ActionListener{

	JPanel panel = new JPanel(new BorderLayout());
	private JFrame frame;
	private JTextField display;
	private JLabel status;

	public GUI(){
		makeFrame();
	}

	private void makeFrame() {
		frame = new JFrame("Garbage Collector");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel contentPane = (JPanel)frame.getContentPane();
		contentPane.setLayout(new BorderLayout(8, 8));
		contentPane.setBorder(new EmptyBorder( 10, 10, 10, 10));

		display = new JTextField();
		contentPane.add(display, BorderLayout.NORTH);

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {

	}


}
