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
		this.vivo = true;
	}
	
	//MÉTODOS
	
	private void setenergia (int e) {
		if(this.vivo == false) {
			//System.out.println("O PET ESTA MORTO (ToT)EEE");
			this.energia = 0;
			this.limpeza = 0;
			this.fome = 0;
			this.diamantes = 0;
		}else if ((this.energia + e) > this.energiaMax) {
			this.energia = this.energiaMax;
			System.out.println("Energia no Máximo, brinque um pouco!!!");
		}else if ((this.energia + e) < 1) {
			this.energia = 0;
			this.vivo = false;
			System.out.println("\n Ação não concluida: " + "\n!!! O PET morreu sem energia Z		(ToT) !!!\n");
		}else{
			this.energia += e;
		}
	}private void setfome (int f) {
		if (this.vivo == false) {
			//System.out.println("O PET ESTA MORTO (ToT)FFF");
			this.energia = 0;
			this.limpeza = 0;
			this.fome = 0;
			this.diamantes = 0;
			
		}else if ((this.fome + f) > this.fomeMax) {
			this.fome = this.fomeMax;
			System.out.println("Estou com fome!");
		}else if ((this.fome + f) < 0){
			this.fome = 0;
		}else {
			this.fome += f;
		}	
	}private void setlimpeza (int l) {
		if (this.vivo == false) {
			//System.out.println("!!! O PET ESTA MORTO (ToT)LLL !!!");
			this.energia = 0;
			this.limpeza = 0;
			this.fome = 0;
			this.diamantes = 0;
		}else if ((this.limpeza + l) > this.limpezaMax) {
			this.limpeza = this.limpezaMax;
			System.out.println("já está Limpinho Limpinho!");
		}else if ((this.limpeza + l) < 1) {
			this.limpeza = 0;
			this.vivo = false;
			System.out.println("\n Ação não concluida: " + "\n!!! O PET morreu fedendo		(ToT) !!!\n");
		}else {
			this.limpeza += l;
		}
	}private void setdiamantes () {
		this.diamantes += 1;
	
	//SET's de Ações (Brincar, Banhar, Comer e Dormir)
		
	}void setbrincar () {
		this.setdiamantes();
		this.setfome (1);
		this.setenergia(-1);
		this.setlimpeza(-1);
		if (this.vivo == true) {	
			this.idade += 1;
		}
	}void setbanhar () {
		this.setlimpeza (1);
		this.setfome (1);
		this.setenergia(-1);
		if (this.vivo == true) {	
			this.idade += 1;
		}
	}void setcomer () {
		this.setenergia (1);
		this.setfome (-1);
		this.setlimpeza (-1);
		if (this.vivo == true) {	
			this.idade += 1;
		}
	}void setdormir () {
		this.setenergia(1);
		if (this.vivo == true) {	
			this.idade += 1;
		}
	}public void show (){
		if (this.vivo == true){
			System.out.println("	=============PET-Status==============="
					+"\n"+ "Energia		: " + this.energia 
					+"\n"+ "Fome		: " + this.fome
					+"\n"+ "Limpeza		: " + this.limpeza
					+"\n"+ "Diamantes	: " + this.diamantes
					+"\n" + "Idade		: " + this.idade
					+"\n" + "	Seu PET está vivo!		:°v°:\n\n");		
		}else {
			System.out.println("	=============PET-Status==============="
					+"\n"+ "Energia:	" + this.energia 
					+"\n"+ "Fome:		" + this.fome
					+"\n"+ "Limpeza:	" + this.limpeza
					+"\n"+ "Diamantes:	" + this.diamantes
					+"\n" + "idade:		" + this.idade
					+"\n	Seu PET está MORTO!		(ToT)\n\n");
		}
	}
	
}
