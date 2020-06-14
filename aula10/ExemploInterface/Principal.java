public class Principal {
 
    public static void main(String args[]) {
    
        System.out.println("\f");
        
        Cachorro cachorro = new Cachorro();
        cachorro.setNome("Dooley");
        cachorro.setDataNascimento("28/10/2012");
        cachorro.setQuantidadeDePatas(4);
        System.out.println(cachorro);
        
        Gato gato = new Gato();
        gato.setNome("Fred");
        gato.setQuantidadeDePatas(4);
        System.out.println(gato);        
    }
    
}