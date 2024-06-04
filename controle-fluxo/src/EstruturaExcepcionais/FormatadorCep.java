package EstruturaExcepcionais;

public class FormatadorCep {
    public static void main(String[] args) {
        try {
            String cepformatado = formatarCep("12345678");
            System.out.println(cepformatado);
        } catch (CepInvalidoException e) {
            e.printStackTrace();
        }
    }
        static String formatarCep(String cep) throws CepInvalidoException{
            if(cep.length() != 8)
              throw new CepInvalidoException();
            
              String cepFormatado = cep.substring(0, 2) + "." + cep.substring(2, 5) + "-" + cep.substring(5);
        
              return cepFormatado;
        }
}

