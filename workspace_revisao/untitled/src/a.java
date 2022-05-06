public class a {

    public static void main (String[] args){

        int i, soma = 0;

        for ( i = 0; i <= 10; i++ ) {
            if( i % 2 == 0 ) {
                soma = i + i;
            }
        }
        System.out.println("Soma = " + soma) ;
    }
    }

