import java.util.ArrayList;

public class ExecutaLista {

    public static void main (String[] args){

//        ArrayList contatos = new ArrayList();
//
//        contatos.add("Fabio");
//        contatos.add("Felipe");
//        contatos.add("Maria");
//        contatos.add("José");
//        contatos.add("Antonia");
//        contatos.add("Francisco");
//
//        for(Object nome:contatos) {
//            System.out.println(nome);
//        }

        ArrayList<Contato> contatos = new ArrayList();

        Contato contato1 = new Contato("Fabio Meireles", "fbo@mail.com");
        Contato contato2 = new Contato("Felipe Meireles", "flp@mail.com");
        Contato contato3 = new Contato("Maria Antonia", "tonia@mail.com");
        Contato contato4 = new Contato ("José Francisco", "fran@mail.com");
        Contato contato5 = new Contato ("Marley Meireles", "marley@mail.com");

        contatos.add(contato1);
        contatos.add(contato2);
        contatos.add(contato3);
        contatos.add(contato4);
        contatos.add(contato5);

        for(Contato c:contatos) {
            System.out.println(c.getNome()+" - "+c.getEmail());
        }
        System.out.println();
        System.out.println(contatos.get(2).getNome());
        System.out.println();
        System.out.println("Total: "+ contatos.size());
        System.out.println();
        System.out.println(contatos.contains(contato3));
    }
}
