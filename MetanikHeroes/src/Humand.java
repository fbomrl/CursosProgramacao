
public class Humand {

	private String nome;
	private String alterego;
	private String raca1;
	private String raca2;
	private String raca3;
	private String profissao;
	private double height;
	private double weight;
	private String power1;
	private String power2;
	private String power3;
	private String power4;
	

	public Humand() {
		Humandtotal++;
		System.out.println("HUMANO NÚMERO: " + Humandtotal);
	}


	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}


	private static int Humandtotal;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAlterego() {
		return alterego;
	}

	public void setAlterego(String alterego) {
		this.alterego = alterego;
	}

	public String getRaca1() {
		return raca1;
	}

	public void setRaca1(String raca1) {
		this.raca1 = raca1;
	}

	public String getRaca2() {
		return raca2;
	}

	public void setRaca2(String raca2) {
		this.raca2 = raca2;
	}

	public String getRaca3() {
		return raca3;
	}

	public void setRaca3(String raca3) {
		this.raca3 = raca3;
	}

	public String getProfissao() {
		return profissao;
	}

	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}


	public String getPower1() {
		return power1;
	}


	public void setPower1(String power1) {
		this.power1 = power1;
	}


	public String getPower2() {
		return power2;
	}


	public void setPower2(String power2) {
		this.power2 = power2;
	}


	public String getPower3() {
		return power3;
	}


	public void setPower3(String power3) {
		this.power3 = power3;
	}


	public String getPower4() {
		return power4;
	}


	public void setPower4(String power4) {
		this.power4 = power4;
	}

}
