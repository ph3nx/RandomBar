import java.awt.Frame;
import java.awt.Graphics;


public class View1 extends Frame {

	private static final long serialVersionUID = 1L;
	int x;
	Frame f = new Frame();
	
	public View1(){
		
		setSize(300,300);
		setTitle("View1");
		setLocation(100,100);
		setVisible(true);
		
	}
	
	
	void ausgeben(int x){
		
		this.x = x;
		repaint();						//Lösche Bildschirm und rufe die paint() Methode erneut auf.
		
	}
	
	public void paint(Graphics g){
		
		g.drawRect(150, x, 20, 100);

	}
}