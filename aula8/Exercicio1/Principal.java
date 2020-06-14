public class Principal {
    public static void main(String args[]) {
        System.out.println("\f");
        
        Aluno aluno = new Aluno();
        aluno.setNome("Carlos");
        aluno.setSobrenome("Silva");
        aluno.setEmail("carlos@java.com.jp");
        aluno.setDataDeNascimento("06/06/1966");
        aluno.setNota1(7.0);
        aluno.setNota2(9.5);
        
        Professor professor = new Professor();
        professor.setNome("Osvaldo");
        professor.setSobrenome("Aranha");
        professor.setEmail("osvaldao_pegatodas@wi.edu.br");
        professor.setDataDeNascimento("10/01/1945");
        professor.setNumeroDeRegistro(22);
        professor.setHorasTrabalhadas(200.0);
        professor.setValorHora(12.0);            
        
        System.out.println(aluno);
        System.out.println("----------------------------------");
        System.out.println(professor);
    }
    
}
