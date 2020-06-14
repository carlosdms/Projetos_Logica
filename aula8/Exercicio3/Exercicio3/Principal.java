public class Principal {
    public static void main(String args[]) {
        System.out.print("\f");
        
        Cachorro cachorro = new Cachorro();
        cachorro.nome = "Bob";
        cachorro.idade = 8;
        cachorro.corDosPelos = "preta";
        cachorro.nomeDoResponsavel = "Kury";
        cachorro.vacinasEmDia = false;
        cachorro.vacinar();
        
        Cachorro cachorro2 = new Cachorro();
        cachorro2.nome = "turbo";
        cachorro2.idade = 3;
        cachorro2.corDosPelos = "Amarela";
        cachorro2.nomeDoResponsavel = "jonas";
        cachorro2.vacinasEmDia = false;
        
        Gato gato = new Gato();
        gato.nome = "Garfields";
        gato.idade = 3;
        gato.diasDesdeUltimoBanhoETosa = 1;
        gato.humor = gato.checarHumor();
        gato.sexo = "Masculino";
        
        Gato gato2 = new Gato();
        gato2.nome = "Java";
        gato2.idade = 1;
        gato2.diasDesdeUltimoBanhoETosa = 93;
        gato2.humor = gato.checarHumor();
        gato2.sexo = "Feminino";
        
        System.out.println(cachorro);
        System.out.println(cachorro2);
        System.out.println(gato);
        System.out.println(gato2);
        
    }
}