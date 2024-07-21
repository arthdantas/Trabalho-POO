package src.entity;
import java.util.ArrayList;
import java.util.Date;

public class ProjetoExtensao {

    // ATRIBUTOS 
    
    private String titulo;
    private Date dataVigencia;
    private String publicoAlvo;
    private ArrayList<String> palavraChave = new ArrayList<>();
    private String website;
    private String contato;
    private boolean situacaoAtual;

    private ArrayList<String> vinculosAcoesExtensao = new ArrayList<>();
    private ArrayList<String> salaProjeto = new ArrayList<>();
    private ArrayList<String> areasAtuacao = new ArrayList<>();
    private ArrayList<String> atividades = new ArrayList<>();
    private ArrayList<String> noticia = new ArrayList<>();
    private ArrayList<String> presencaMembros = new ArrayList<>();
    private ArrayList<String> relatorios = new ArrayList<>();
    private double financiamento;
    private Coordenador coordernador;
    private ArrayList<String> membros = new ArrayList<>();

    //GETTERS E SETTERS

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataVigencia() {
        return dataVigencia;
    }

    public void setDataVigencia(Date dataVigencia) {
        this.dataVigencia = dataVigencia;
    }

    public String getPublicoAlvo() {
        return publicoAlvo;
    }

    public void setPublicoAlvo(String publicoAlvo) {
        this.publicoAlvo = publicoAlvo;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public boolean isSituacaoAtual() {
        return situacaoAtual;
    }

    public void setSituacaoAtual(boolean situacaoAtual) {
        this.situacaoAtual = situacaoAtual;
    }

    public double getFinanciamento() {
        return financiamento;
    }

    public void setFinanciamento(double financiamento) {
        this.financiamento = financiamento;
    }

    

    // METODOS
    public void cadastrar(String titulo, Date dataVigencia, String publicoAlvo, ArrayList<String> palavraChave, 
                          String website, String contato, boolean situacaoAtual, ArrayList<String> vinculosAcoesExtensao,
                          Sala salaProjeto, ArrayList<String> areasAtuacao, ArrayList<String> atividades,
                          ArrayList<String> noticia, ArrayList<String> presencaMembros, ArrayList<String> relatorios, 
                          double financiamento, Coordenador coordenador, ArrayList<String> membros){


    }

    
    public void gerarRelatorioAnual(String descricao, ProjetoExtensao projeto){
        

    }

}
