import java.util.ArrayList;

public class Membro{
    private String nome;
    private String matricula;
    private String email;
    private String senha;
    private ArrayList<String> atividades = new ArrayList<>();


    public ArrayList<String> getAtividades() {
        return atividades;
    }
    public void setAtividades(ArrayList<String> atividades) {
        this.atividades = atividades;
    }
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }
    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }



    public void fazerLogin(String email , String senha){

    }
}