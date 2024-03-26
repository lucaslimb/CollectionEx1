package VetorUsuario;

import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class Usuario {

    private long id;
    private String nome, email, telefone, senha;
    private Date dataCadastro;

    public Usuario(long id, String nome,String senha) {
        this.id = id;
        this.nome = nome;
        this.senha = senha;
        this.dataCadastro = new Date();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public int compareTo(Usuario user){
        if (this.getId()<user.getId()){
            return -1;
        }
        if(this.getId()>user.getId()){
            return -1;
        }
        return 0;
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
