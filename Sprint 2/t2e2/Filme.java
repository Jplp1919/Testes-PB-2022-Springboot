
package t2e2;

public class Filme {
    private int id;
    private String nome;
    private String descricao;
    private int ano;

    public Filme() {
    }

    public Filme(int id, String nome, String descricao, int ano) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.ano = ano;
    }
   
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
      @Override
    public String toString(){
       return String.format("%d, %s, %s, %d", 
               this.id, this.nome, this.getDescricao(), this.ano);
    }
    
}
