package view;
import controller.indexController;
public class index {

	public static void main(String[] args) {
		indexController index =  new indexController();
		int a = 5;
		int b = 10;
		int r =  index.soma(5, 10);
		
		System.out.println("Total: " + r);
	}

}
