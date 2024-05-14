public class Curso {
  String nome;
  String professor;
  String nivel;
  double notaAprovacao;
  int duracao;
  int quantidadeAlunos;

  public void iniciarCurso() {
    System.out.println("Curso de " + nome + " foi iniciado.");
  }

  public void finalizarCurso() {
    System.out.println("Curso de " + nome + " foi finalizado.");
  }

  public void imprimirCurso() {
    System.out.println(String.format(
        """
            Nome do curso: %s
            Professor(a): %s
            Nivel: %s
            Nota de aprovacao: %s
            Duracao: %s meses
            Quantidade de alunos: %s
            """,
        nome, professor, nivel, notaAprovacao, duracao, quantidadeAlunos));
  }
}
