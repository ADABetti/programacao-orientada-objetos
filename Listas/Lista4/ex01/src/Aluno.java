public class Aluno {
  String nome;
  int idade;
  int id;
  double media;

  public void fazerProva() {
    System.out.println("O/A aluno(a) " + nome + " iniciou a prova.");
  }

  public void verificarAprovacao() {
    System.out.println("A media do(a) aluno(a) foi: " + media);
    if (media >= 5) {
      System.out.println("Aluno(a) aprovado(a)");
    } else {
      System.out.println("Aluno(a) reprovado(a).");
    }
  }

  public void imiprimirAluno() {
    System.out.println(String.format(
        """
            Nome do aluno: %s
            idade: %s
            id: %s
            """, nome, idade, id));
  }
}
