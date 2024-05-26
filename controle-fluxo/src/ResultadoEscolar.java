public class ResultadoEscolar {
    public static void main(String[] args) {
        int nota = 7;
		String resultado = nota >=7 ? "Aprovado" : nota >=5 && nota <7 ? "Recuperação" : "Reprovado";
		System.out.println(resultado);
    }
}
/*Caso 2*/
/*int nota = 5;
String resultado = nota >=7 ? "Aprovado" : "Reprovado";
System.out.println("Você foi " + resultado); */