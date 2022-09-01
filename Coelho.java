package aula7;

//subclase
public class Coelho extends Animal{
    protected String pelos;
    
    public Coelho(String nome,
                  String cor,
                  String pelos,
                  int pernas){
        super(nome, cor, pernas);
        
        this.pelos = pelos;
        
        System.out.println(getNome());
        System.out.println(getCor());
        
        //setNome(nome);
        //setCor(cor);
    }
}