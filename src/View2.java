
import java.awt.Frame;
import java.awt.Graphics;


public class View2 extends Frame {

	private static final long serialVersionUID = 1L;
	int x;
	Frame f = new Frame();
	
	//Kontstruktor
	
	public View2(){
		
		setSize(300,300);
		setTitle("View2");
		setLocation(100,200);
		setVisible(true);
		
		
	}
	
	
	void ausgeben(int x){
		
		this.x = x;
		repaint();						//Lösche Bildschirm und rufe die paint() Methode erneut auf.
		
	}
	
	public void paint(Graphics g){
		
	
		g.drawString("x:  "+x, 100, 100);
	
		
		
	}
	
	
	
}