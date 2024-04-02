package VetorUsuario;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static VetorUsuario.Usuario.remover;

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

        /*remover("Pedro", list);
        for (Usuario usuario : list) {
            System.out.println("Nome: " + usuario.getNome());
        }

        System.out.println("");

        System.out.println(pedro.compareTo(jose));*/


        Map mapa = new HashMap();
        mapa.put(1, jose);
        mapa.put(2, maria);
        mapa.put(3, pedro);

        for (int i = 1; i <= mapa.size(); i++) {

            Object obj = mapa.get(i);
            Usuario usuario = (Usuario) obj;
            System.out.println("Usuario: " + usuario.getNome());

        }

        mapa.get(1);

    }


}
