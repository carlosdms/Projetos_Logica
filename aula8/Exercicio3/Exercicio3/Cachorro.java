public class Cachorro extends Animal {
    protected String corDosPelos;
    protected String nomeDoResponsavel;
    protected boolean vacinasEmDia;
    
    public Cachorro() {
        super();
    }
    
    public void vacinar() {
            this.vacinasEmDia = true;
    }
    
    public String checarVacinas() {
            if(vacinasEmDia==true) {
                return "vacinado corretamente";
            } else {
                return "falta tomar as vacinas";
            } 
    }
    
    @Override
    public String toString() {
        return "\nNome do cão: " + this.nome +
               "\nIdade do Cão: " + this.idade +
               "\nColoração: " + this.corDosPelos +
               "\nNome do responsável: " + this.nomeDoResponsavel +
               "\nVacinas: " + this.checarVacinas();
    }
}