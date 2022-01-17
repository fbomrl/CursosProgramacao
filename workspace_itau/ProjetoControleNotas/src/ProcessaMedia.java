
public class ProcessaMedia {
	public void media(String nome, double nota1, double nota2, double media) {
		media = (nota1+nota2)/2;
		
		System.out.println("O Aluno "+nome+" obteve as notas "+nota1+" e "+nota2+", obtendo uma média de "+media);
		if (media<= 5) {
			System.out.println("Portando o aluno "+nome+" foi REPROVADO.");
		}else {
			System.out.println("Portando o aluno "+nome+" foi APROVADO.");
		}
		
		
	}

}
