package aula7;

//subclase
public class CoelhoRajado extends Coelho{
    
    public CoelhoRajado(String nome,
                        String cor,
                        String pelos,
                        int pernas){
        super(nome, cor, pelos, pernas);
        
        System.out.println(getNome());
        System.out.println(getCor());
        
        //setNome(nome);
        //setCor(cor);
    }
    
    //sobrescrita
    public String toString(){
        return this.getNome() + "\t" +
               this.getCor() + "\t" +
               this.pelos + "\t" +
               this.pernas;
    }
}