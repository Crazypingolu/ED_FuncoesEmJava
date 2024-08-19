package controller;
public class ClasseMetodos{
	public ClasseMetodos(){
		super();
	}
	// funcão de Soma:
	public void funcSoma(int n){
		// Processamento de dados:
		if(n >= 10) return;
			System.out.println(n);
			funcSoma(++n);
	}
}