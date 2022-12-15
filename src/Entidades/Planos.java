package Entidades;

public class Planos {
	String plano1;
	String plano2;
	String plano3;
	
	public Planos() {
		
	}
	
	public Planos(int plano1) {
		if(plano1 == 1) {
			this.plano1 = "Aderiu ao plano 1.";
		}else if(plano1 == 2) {
			this.plano2 = "Aderiu ao plano 2.";
		}else if(plano1 == 3) {
			this.plano3 = "Aderiu ao plano 3.";
		}else {
			System.out.println("Plano indisponível.");
		}
		this.plano2 = "";
		this.plano3 = "";
	}

	
	public String getPlano1() {
		return plano1;
	}
	public void setPlano1(String plano1) {
		this.plano1 = plano1;
	}
	public String getPlano2() {
		return plano2;
	}
	public void setPlano2(String plano2) {
		this.plano2 = plano2;
	}
	public String getPlano3() {
		return plano3;
	}
	public void setPlano3(String plano3) {
		this.plano3 = plano3;
	}
	
	
}
