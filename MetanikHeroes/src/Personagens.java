
public class Personagens {

	public static void main(String[] args) {
		Humand humano1 = new Humand();
		
		humano1.setNome ("Metanik");
		humano1.setAlterego("Metanik");
		humano1.setProfissao("Desconhecido");
		humano1.setHeight(185);
		humano1.setWeight(100);
		humano1.setPower1("Gerar Fogo");
		humano1.setPower2("Manipular Fogo");
		humano1.setPower3("Resistencia Fogo");
		humano1.setPower4("");
		
		
		System.out.println();
		System.out.println("-----DADOS PRINCIPAIS-----");
		System.out.println("Nome completo: "+humano1.getNome()+";");
		System.out.println("Nome Conhecido: "+humano1.getAlterego()+";");
		System.out.println("Profissão: "+humano1.getProfissao()+";");
		System.out.println("Altura: "+humano1.getHeight()+" Cm");
		System.out.println("Peso: "+humano1.getWeight()+" Kg");
		System.out.println();
		System.out.println("--------HABILIDADES-------");
		System.out.println(" - "+humano1.getPower1()+";");
		System.out.println(" - "+humano1.getPower2()+";");
		System.out.println(" - "+humano1.getPower3()+";");
		System.out.println(" - "+humano1.getPower4()+";");
		System.out.println("--------------------------");
		System.out.println();
		
		Humand humano2 = new Humand();
		humano2.setNome ("Desconhecido");
		humano2.setAlterego("Theoty");
		humano2.setProfissao("Carrasco");
		humano2.setHeight(201);
		humano2.setWeight(130);
		humano2.setPower1("Semi-Imortalidade");
		humano2.setPower2("");
		humano2.setPower3("");
		humano2.setPower4("");
		
		System.out.println();
		System.out.println("-----DADOS PRINCIPAIS-----");
		System.out.println("Nome completo: "+humano2.getNome()+";");
		System.out.println("Nome Conhecido: "+humano2.getAlterego()+";");
		System.out.println("Profissão: "+humano2.getProfissao()+";");
		System.out.println("Altura: "+humano2.getHeight()+" Cm");
		System.out.println("Peso: "+humano2.getWeight()+" Kg");
		System.out.println();
		System.out.println("--------HABILIDADES-------");
		System.out.println(" - "+humano2.getPower1()+";");
		System.out.println(" - "+humano2.getPower2()+";");
		System.out.println(" - "+humano2.getPower3()+";");
		System.out.println(" - "+humano2.getPower4()+";");
		System.out.println("--------------------------");
		System.out.println();
		
		Humand humano3 = new Humand();
		humano3.setNome("Desconhecido");
		humano3.setAlterego("Doutor Milagre");
		humano3.setProfissao("Médico/Cientista");
		humano3.setHeight(170);
		humano3.setWeight(65);
		humano3.setPower1("Curar Doenças");
		humano3.setPower2("Gerar Doenças");
		humano3.setPower3("Semi-Imortalidade");
		humano3.setPower4("");
		
		System.out.println();
		System.out.println("-----DADOS PRINCIPAIS-----");
		System.out.println("Nome completo: "+humano3.getNome()+";");
		System.out.println("Nome Conhecido: "+humano3.getAlterego()+";");
		System.out.println("Profissão: "+humano3.getProfissao()+";");
		System.out.println("Altura: "+humano3.getHeight()+" Cm"+";");
		System.out.println("Peso: "+humano3.getWeight()+" Kg"+";");
		System.out.println();
		System.out.println("--------HABILIDADES-------");
		System.out.println(" - "+humano3.getPower1()+";");
		System.out.println(" - "+humano3.getPower2()+";");
		System.out.println(" - "+humano3.getPower3()+";");
		System.out.println(" - "+humano3.getPower4()+";");
		System.out.println("--------------------------");
		System.out.println();
		
	}

}
