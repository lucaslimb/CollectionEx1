package VetorUsuario;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class MainUsuario {

    public static void main(String[] args) {
        /*Usuario usuario[] = new Usuario[2];
        usuario[0] = new Usuario("Jose", "root");
        usuario[1] = new Usuario("Maria", "root");

        for (Usuario user : usuario) {
            System.out.println(user.getNome());
        }*/

        List<String> lista = new ArrayList<String>();
        lista.add("Pedro");
        lista.add("Joao");
        lista.add("Maria");
        lista.add("Marcos");
        lista.add("Anna");
        lista.add("Jose");
        lista.add("Predo");

        List<Usuario> list = new ArrayList<Usuario>();
        Usuario jose = new Usuario(01, "Jose", "1a2b3c");
        Usuario maria = new Usuario(02, "Maria", "123abc");
        Usuario pedro = new Usuario(03, "Pedro", "abc123");
        list.add(jose);
        list.add(maria);
        list.add(pedro);

        for (Usuario usuario :
                list) {
            System.out.println("Nome: " + usuario.getNome());
        }

        System.out.println("");

        remover("Pedro", list);
        for (Usuario usuario : list) {
            System.out.println("Nome: " + usuario.getNome());
        }

        System.out.println("");

        System.out.println(pedro.compareTo(jose));

    }

    public static List<Usuario> remover(String nome, List<Usuario> list){
        Iterator<Usuario> iterator = list.iterator();
        while (iterator.hasNext()){
            Usuario usuario = iterator.next();
            if(usuario.getNome() == nome){
                iterator.remove();
            }
        }
        return list;
    }
}
