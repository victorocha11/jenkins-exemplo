package br.com.caelum.blog.jenkins;

public class Imposto {

	public Imposto() {
	}
	//alguma coisa
	
	public double calcula(Orcamento orcamento) {
		System.out.println("teste");
		return orcamento.getValor() * 0.1;
	}

}
