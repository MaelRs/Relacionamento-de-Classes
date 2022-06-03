package combate;

public class Lutador {
	private String nome;
	private String nacinalidade;
	private int idade;
	private float altura;
	private float peso;
	private String categoria;
	private int vitorias, derrotas, empates;
	
	public void apresentar() {
		System.out.println("----------------------------------------------------");
		System.out.println("Apresentando o lutador "+this.getNome());
		System.out.println("Vindo direto do(a) "+this.getNacinalidade());
		System.out.println("Com "+this.getIdade()+" de idade ");
		System.out.println("Medindo "+this.getAltura()+" de Altura e pesando "+this.getPeso()+" kilos");
		System.out.println("competindo pela Categoria dos "+this.getCategoria());
		System.out.println("Trazendo na bagagem "+this.getVitorias()+" vitorias "+this.getDerrotas()+" derrotas "+this.getEmpates()+" Empates");
		System.out.println("-----------------------------------------------------");
	}	
		
	public void status() {
		System.out.println("-----------------------------------------------------");
		System.out.println(this.getNome() +" lutando pela categoria "+this.getCategoria() );
		System.out.println("Com uma trajetoria de "+ this.getVitorias()+" vitorias");
		System.out.println(this.empates+" empates "+this.getDerrotas()+" derrotas.");
		System.out.println("------------------------------------------------------");
	}
	
	public void ganharLuta() {
		this.setVitorias(this.getVitorias()+1);		
	}
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas()+1);
	}
	public void empatar() {
		this.setEmpates(this.getEmpates()+1);
	}

	public Lutador(String nome, String nacinalidade, int idade, float altura, float peso, int vitorias, int derrotas,
			int empates) {
		super();
		this.nome = nome;
		this.nacinalidade = nacinalidade;
		this.idade = idade;
		this.altura = altura;
		this.setPeso(peso);
		this.vitorias = vitorias;
		this.derrotas = derrotas;
		this.empates = empates;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNacinalidade() {
		return nacinalidade;
	}

	public void setNacinalidade(String nacinalidade) {
		this.nacinalidade = nacinalidade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
		this.setCategoria(this.getCategoria());
	}

	public String getCategoria() {
		return categoria;
	}

	private void setCategoria(String categoria) {
		if(this.getPeso()<52.2) {
			this.categoria="INVÁLIDO";
		}else if(this.getPeso()<=70.3) {
			this.categoria="PESOS LEVES";
		}else if(this.getPeso()<=83.9) {
			this.categoria="PESOS MÉDIOS";			
		}else if(this.getPeso()<=120) {
			this.categoria="PESOS PESADOS";
		}else {
			this.categoria="INVÁLIDOS";
		}
	}

	public int getVitorias() {
		return vitorias;
	}

	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}

	public int getDerrotas() {
		return derrotas;
	}

	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}

	public int getEmpates() {
		return empates;
	}

	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	

}
