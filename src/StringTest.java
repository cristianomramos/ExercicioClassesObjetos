
public class StringTest {

	public static void main(String[] args) {
		String s1;
		String s2;
		String s3 = "Cristiano";
		String s4 = "Robson";
		s1 = new String("Cristiano");
		s2 = new String("Cristiano");

		int somaString = s1.length() + s2.length();

		System.out.println("a soma dos tamanhos das strings �: " + somaString);

		String respostaConteudo;
		if (s1.equals(s2) == true) {
			respostaConteudo = "sim";
		} else {
			respostaConteudo = "n�o";

		}
		System.out.println("As strings s1 e s2 s�o iguais?  " + respostaConteudo);

		String respostaMemoria;
		if (s1 == s2) {
			respostaMemoria = "sim";
		} else {
			respostaMemoria = "n�o";
		}
		System.out.println("s1 e s2 t�m o mesmo endere�o de memoria? " + respostaMemoria);
		
		
		String respostaEqS3S4;
		if (s3.equals(s4)) {
			respostaEqS3S4 = "sim";
		} else {
			respostaEqS3S4 = "n�o";
		}
		System.out.println("As strings s3 e s4 s�o iguais?  " + respostaEqS3S4);
		
		String respostaMemS3S4;
		
		if(s3==s4){
			respostaMemS3S4="sim";
		}else{
			respostaMemS3S4="n�o";
		}
		
		System.out.println("s3 e s4 t�m o mesmo endere�o de memoria? " + respostaMemS3S4);
	
	s3="Maria";
	String respostaRefEqS3S4;
	if (s3.equals(s4)) {
		respostaRefEqS3S4 = "sim";
	} else {
		respostaRefEqS3S4 = "n�o";
	}
	System.out.println("As strings s3 e s4 s�o iguais?  " + respostaRefEqS3S4);
	
	String respostaRefMemS3S4;
	
	if(s3==s4){
		respostaRefMemS3S4="sim";
	}else{
		respostaRefMemS3S4="n�o";
	}
	
	System.out.println("s3 e s4 t�m o mesmo endere�o de memoria? " + respostaRefMemS3S4);

	}

}
