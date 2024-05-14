public class App {
    public static void main(String[] args) throws Exception {
        Curso programacao = new Curso();
        programacao.nome = "Programacao Orientada a Objetos";
        programacao.duracao = 3;
        programacao.nivel = "iniciante";
        programacao.notaAprovacao = 5;
        programacao.professor = "Pedro Alves";
        programacao.quantidadeAlunos = 30;

        Professor pedroAlves = new Professor();
        pedroAlves.nome = "Pedro Alves";
        pedroAlves.idade = 24;
        pedroAlves.tempoExperienciaEmAnos = 2.5;
        pedroAlves.formacao = "ADS";
        pedroAlves.falaIngles = true;

        Aluno luisaSonsa = new Aluno();
        luisaSonsa.nome = "Luisa Sonsa";
        luisaSonsa.idade = 16;
        luisaSonsa.id = 1;
        luisaSonsa.media = 5.7;

        programacao.imprimirCurso();
        programacao.iniciarCurso();

        pedroAlves.imprimirProfessor();
        luisaSonsa.imiprimirAluno();

        pedroAlves.iniciarAula();
        pedroAlves.aplicarProva();
        luisaSonsa.fazerProva();
        luisaSonsa.verificarAprovacao();

        programacao.finalizarCurso();

    }
}
