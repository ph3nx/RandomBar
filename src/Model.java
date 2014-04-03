import java.util.*;

public class Model {
	
	private int x;
	Random r;
	View v;
	View1 v1;
	View2 v2;
	
	
	public Model() {
		
		r = new Random();
		v = new View();
		v1 = new View1();
		v2 = new View2();
		berechneWert();
	
	}
	
	public void berechneWert(){
		
		for (;;){
			
			x = r.nextInt(101);
			v.ausgeben(x);
			v1.ausgeben(x);
			v2.ausgeben(x);
			try{Thread.sleep(1000);} catch(Exception e){}
		}
		

	}
	
	int getWert(){
		
		return x;
	}

}