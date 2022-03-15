import java.util.Scanner;

public class NotasAluno {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String nome;
        double nota1, nota2, media;
        System.out.println("Digite o nome do aluno: ");
        nome = sc.nextLine();
        System.out.println("Nota 1: ");
        nota1 = sc.nextDouble();
        System.out.println("Nota 2: ");
        nota2 = sc.nextDouble();

        media = (nota1+nota2)/2;


        System.out.println("A média do aluno "+nome+" é de: "+media);

        if(media >= 6){
            System.out.println("ALUNO APROVADO!");
        } else if (media >= 4){
            System.out.println("ALUNO EM RECUPERAÇÃO!");
        }else{
            System.out.println("ALUNO REPROVADO!");
        }

    }
}
