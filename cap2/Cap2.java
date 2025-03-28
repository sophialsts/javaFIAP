public class Cap2 {
    public static void main(String[] args) {
        /*Indução de tipagens*/
        var idade = 22;
        var anoDeNascimento = 2000;
        var maior = true;
        var nome = "Bruno";
        var salario = 15990.99f;

        System.out.println("O resultado de 5/2 é: " + 5/2);
        System.out.println("O resultado de 5/2 é: " + 5f/2f);
        /*Importâncias dos tipos*/

        /*Boolean*/
        System.out.println("O número " + idade + " é divisível por 2? " + (idade % 2 == 0));
        System.out.println("O número " + idade + " é divisível por 3? " + (idade % 3 == 0));
        System.out.println("O número " + idade + " é divisível por 4? " + (idade % 4 == 0));
        System.out.println("O número " + idade + " é divisível por 5? " + (idade % 5 == 0));

        /*Expressões matemáticas seguem a lógica de precedência da matemática*/
       var resultado = (1 + 5) * 2;
       System.out.println(resultado);
       resultado = 1 + ( 5 * 2 );
       System.out.println(resultado);

       /*Exercício do final da aula*/
        /*Calcular a média final de um aluno de uma faculdade que possui os seguintes critérios de avaliação:
        A) prova semesntreal que compõe 50% da média;
        B) trabalho de conclusão de curos uq epossui 30%;
        C) as avaliações intermediárias, que são compostas por duas avaliaçẽos durante o semestre e a média dessas duas avaliaçẽos contribuem com 20% para a média final.

        double mediaFinal = ps * 0.5 + tcc * 0.3 + ((av1 + av2)/2) * 0.2;

        Notas do alunos:
        prova semestral: 7, TCC: 5, 10 e 6 como av1 e av2

        Qual a média final do semestre?
         */

        byte ps = 7, tcc = 5, av1 = 10, av2 = 6;
        double mediaFinal = ps * 0.5 + tcc * 0.3 + ((av1 + av2)/2) * 0.2;

        mediaFinal++; /*aluno era top*/

        System.out.println("A média final é: " + mediaFinal);

    }
}


