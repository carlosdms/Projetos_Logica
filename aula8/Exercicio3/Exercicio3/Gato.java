public class Gato extends Animal {
    protected String humor;
    protected int diasDesdeUltimoBanhoETosa;
    protected String sexo;
    
    public Gato() {
        super();
    }
    
    public void TomarBanho() {
        this.diasDesdeUltimoBanhoETosa = 0;
    }
    
    public String checarHumor() {
        if(diasDesdeUltimoBanhoETosa<7) {
            return "De boas!";
        } else {
            return "Ouvindo sertanejo! no 1000 grau";
        }        
    }
    
    @Override
    public String toString() {
        return "\nNome do gato: " + this.nome +
               "\nIdade do gato: " + this.idade +
               "\nSexo: " + this.sexo +
               "\nComo vai seu gatinho?: " + this.checarHumor() +
               "\nEle está assim pois faz " + this.diasDesdeUltimoBanhoETosa + " dias que tomou banho!";
               
    }
}