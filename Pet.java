package pet;

public class Pet {
	 
		//ATRIBUTOS
	
	public int energiaMax;
	public int fomeMax;
	public int limpezaMax;
	
	private int energia;
	private int fome;
	private int limpeza;
	private int diamantes;
	private int idade;
	private boolean vivo;
	
	//CONSTRUTOR PET
	
	public void inicializarPet(int enerMax, int fomMax, int limpMax) {
		this.energiaMax = enerMax;
		this.fomeMax = fomMax;
		this.limpezaMax = limpMax;
		this.energia = energiaMax;
		this.limpeza = limpezaMax;
		this.fome = 0;
		this.diamantes = 0;
		this.idade = 0;
		
	}
	
	//MÉTODOS
	
	public void setenergia (int e) {
		if(this.vivo = false) {
			System.out.println("O PET ESTA MORTO (ToT)");
		}else if ((this.energia + e) > this.energiaMax) {
			this.energia = this.energiaMax;
			System.out.println("Energia no Máximo, brinque um pouco!!!");
		}else if ((this.energia + e) < 1) {
			this.energia = 0;
			this.vivo = false;
		}else{
			this.energia =+ e;
		}
		
	}public void setfome (int f) {
		if (this.vivo = false) {
			System.out.println("O PET ESTA MORTO (ToT)");
		}else if ((this.fome + f) > this.fomeMax) {
			this.fome = this.fomeMax;
		}else if ((this.fome + f) < 0){
			this.fome = 0;
		}else {
			this.fome += f;
		}
		
	}public void setlimpeza (int l) {
		if (this.vivo = false) {
			System.out.println("!!! O PET ESTA MORTO (ToT) !!!");
		}else if ((this.limpeza + l) > this.limpezaMax) {
			this.limpeza = this.limpezaMax;
			System.out.println("já está Limpinho Limpinho!");
		}else if ((this.limpeza + l) < 1) {
			this.limpeza = 0;
			this.vivo = false;
			System.out.println("!!! O PET morreu fedendo (ToT) !!!");
		}else {
			this.limpeza += l;
		}
	}public void setdiamantes () {
		this.diamantes =+ 1;
	
	//SET's de Ações (Brincar, Banhar, Comer e Dormir)
		
	}private void setbrincar () {
		this.setdiamantes();
		this.setfome (1);
		this.setenergia(-1);
		this.setlimpeza(-1);
		this.idade += 1;
	}private void setbanhar (int l) {
		this.setlimpeza (1);
		this.setfome (1);
		this.setenergia(-1);
		this.idade += 1;
	}private void setcomer (int c) {
		this.setenergia (1);
		this.setfome (-1);
		this.setlimpeza (-1);
		this.idade += 1;
	}private void setdormir (int d) {
		this.setenergia(1);
		this.idade += 1;
	}
	
	public void show (){
		if (this.vivo = true){
			System.out.println("	=============PET-Status==============="
					+"\n"+ "Energia:	" + this.energia 
					+"\n"+ "Fome:	" + this.fome
					+"\n"+ "Limpeza:	" + this.limpeza
					+"\n"+ "Diamantes:	" + this.diamantes
					+"\n" + "idade:	" + this.idade
					+"Seu PET está vivo! :°v°:");		
		}else {
			System.out.println("	=============PET-Status==============="
					+"\n"+ "Energia:	" + this.energia 
					+"\n"+ "Fome:	" + this.fome
					+"\n"+ "Limpeza:	" + this.limpeza
					+"\n"+ "Diamantes:	" + this.diamantes
					+"\n" + "idade:	" + this.idade
					+"Seu PET está MORTO! (ToT)");
		}
	}
	
		

}
