package br.com.caelum.blog.jenkins;

public class Imposto {

	public Imposto() {
	}
	
	int a,b;
	a=0;
	b=0;
	a=a;
	
	public double calcula(Orcamento orcamento) {
		System.out.println("teste");
		return orcamento.getValor() * 0.1;
	}

}
