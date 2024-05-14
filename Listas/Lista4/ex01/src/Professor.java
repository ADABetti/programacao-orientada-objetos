public class Professor {
  String nome;
  int idade;
  double tempoExperienciaEmAnos;
  String formacao;
  boolean falaIngles;

  public void iniciarAula() {
    System.out.println("O/A professor(a) " + nome + " iniciou a aula.");
  }

  public void aplicarProva() {
    System.out.println("Hoje teremos prova supresa!");
  }

  public void imprimirProfessor() {
    System.out.println(String.format(
        """
            Nome do professor: %s
            Idade: %s
            Tempo de experiencia: %s anos
            Formacao: %s
            Fala ingles: %s.
            """, nome, idade, tempoExperienciaEmAnos, formacao, falaIngles));
  }
}
