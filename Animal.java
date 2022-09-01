package aula7;

//superclasse
public class Animal {
    private String nome;
    private String cor;
    protected int pernas;
    
    public Animal(String nome,
                  String cor,
                  int pernas){
        setNome(nome);
        setCor(cor);
        
        this.pernas = pernas;
    }
    
    public String getNome(){
        return nome;
    }
    public String getCor(){
        return cor;
    }
    
    public void setCor(String cor){
        this.cor = cor;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
}
