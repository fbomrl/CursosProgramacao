public class ProcessaMatrizLacos {

    public static void main(String[] args) {
        System.out.println("Laço de repetição com WHILE.");
        int contador = 0;

        do{
            System.out.println(contador);
            contador++;
        }
        while(contador<5);

        System.out.println("Laço de repetição com FOR.");
        for (int cont = 0; cont <5; cont ++){
            System.out.println(cont);
        }
    }
}
