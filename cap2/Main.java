public class Main {
    public static void main(String[] args) {
        String frase;

        {
            frase = "Estou estudando sobre Java no";
            {
                String fraseInterna = " G2BC em 28 de março.";
                frase = frase + fraseInterna;
            }
        }

        System.out.println(frase);

    }
}