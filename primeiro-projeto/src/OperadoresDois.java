public class OperadoresDois {
    public static void main(String[] args) {
    
        boolean condicao1 = true;
        boolean condicao2 = false;

        if (condicao1 && (7 > 4)/*condicao2*/){
            System.out.println("Ambas são verdadeiras!");
        }
        if (condicao1 || condicao2){
            System.out.println("Somente uma é verdadeira");
        }
        
        System.out.println("FIM");
    }
}
