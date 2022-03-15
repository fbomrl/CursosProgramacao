import java.util.Scanner;

public class ObtendoTamanhoVariavel {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String senha;

        System.out.println("Entre com a senha: ");
        senha = sc.nextLine();
        System.out.println("A Quantidade de dígitos da senha é: "+senha.length());

        if(senha.equals("gama@2022")) {
            System.out.println("Senha Correta!");
        }else if(senha.length() < 4) {
            System.out.println("Senha Incorreta - Possui menos de quatro dígitos!");
        }else{
            System.out.println("Senha Incorreta!");
        }



    }
}
