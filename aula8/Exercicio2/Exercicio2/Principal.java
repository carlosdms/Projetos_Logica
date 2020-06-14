public class Principal {
    public static void main(String args[]) {
        System.out.print("\f");
        
        PessoaJuridica pessoaJuridica = new PessoaJuridica();
        pessoaJuridica.codigoDoCliente = 001;
        pessoaJuridica.nome = "Tobias";
        pessoaJuridica.profissao = "Marceneiro";
        pessoaJuridica.setRazaoSocial("Tobias da Madeira");
        pessoaJuridica.setCNPJ("55664444148");
        pessoaJuridica.setInscricaoEstadual(12546);
        pessoaJuridica.setCapitalInicial(1555.15);        
        System.out.println(pessoaJuridica);
        
        PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.codigoDoCliente = 006;
        pessoaFisica.nome = "Roberta";
        pessoaFisica.profissao = "Professora";
        pessoaFisica.setEstadoCivil("Casada");
        pessoaFisica.setCPF("135.846.985/45");
        pessoaFisica.setDataDeNascimento("02/04/1988");
        System.out.println(pessoaFisica);
    }
}