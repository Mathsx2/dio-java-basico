public class App {
    public static void main(String[] args) {

        String primeiroNome = "Matheus";
        String segundoNome = "Almeida";

        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

public static String nomeCompleto (String primeiroNome, String segundoNome) {
    return "Resultado: " + primeiroNome.concat(" ").concat(segundoNome);
}


}

