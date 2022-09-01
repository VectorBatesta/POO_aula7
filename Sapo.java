package aula7;

//subclase
public class Sapo extends Animal{
    
    public Sapo(String nome,
                String cor,
                int pernas){
        super(nome, cor, pernas);
        
        System.out.println(getNome());
        System.out.println(getCor());
        
        //setNome(nome);
        //setCor(cor);
    }
}