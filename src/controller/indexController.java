package controller;

public class indexController {
	public indexController() {
		super();
	}
	
	public int soma (int a, int b) {
		//Quando b for zero, retornará o valor de a.
		if(b == 0) {
			return a;
		}else {
			//A cada recursão, é transferida uma unidade de a para b, até que o valor de b seja zero
			return soma(a+1, b-1);
		}
	}
}
