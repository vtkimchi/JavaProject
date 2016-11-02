import java.awt.Dimension;

import javax.swing.JFrame;

/**
 * 
 */

/**
 * @author Chi Vo - T153556
 *
 */
public class JavaClass extends JFrame {
	
	public JavaClass(){
		setTitle("Demo Git");
		setPreferredSize(new Dimension(500, 500));
		pack();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaClass f = new JavaClass();
		f.setDefaultCloseOperation(EXIT_ON_CLOSE);
		f.setVisible(true);

	}

}
