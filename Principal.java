package aula7;

public class Principal {

    public static void main(String[] args) {
        Principal principal = new Principal();
        principal.iniciar();
    }
    
    public void iniciar(){
        Girino girino;
        girino = new Girino("girino", "verde", 1);
        
        CoelhoRajado cueio;
        cueio = new CoelhoRajado("cuei rajado",
                                 "rajado",
                                 "maior q 100",
                                 4);
        
        System.out.println(cueio);
    }
}
