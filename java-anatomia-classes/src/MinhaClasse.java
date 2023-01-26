// Introdução da minha classe com o nome do arquivo sendo o nome da classe
public class MinhaClasse {
    //Criando um método principal onde retorna o que está escrito dentro dele.
    public static void main(String[] args) {
        System.out.print("Olá! Sejam bem vindos!");
        
        // Variáveis e sua estrutura
        String primeiroNome = "Fabio";
        String segundoNome = "Nogueira";
        String  nomeCompleto = nomeCompleto(primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

        int anoFabricacao = 2022;
        boolean verdadeira = true;

        // Após a variável criada ela pode ser modificada
        anoFabricacao = 2018;

    }

    // Criando um método para concatenar nomes
    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        // A saída do meu método pode ser escrita assim:
        //return primeiroNome.concat(" ").concat(segundoNome);
        
        // E também pode ser escrito dessa forma
        return " O nome completo é " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
