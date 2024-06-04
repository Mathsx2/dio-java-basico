package EstruturaExcepcionais;

import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExcecao {
    public static void main(String[] args) {

       Number Valor;
    try {
        Valor = NumberFormat.getInstance().parse("a1.75");
    } catch (ParseException e) {
        e.printStackTrace();
    }

}
}
