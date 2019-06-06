package pucrs.java.maven.somar;

/**
 * @author Letícia
 *
 */
public class Somar 
{
    public static void main( String[] args )
    {
    	if(args.length == 1 && args[0].equals("--versão")) {
    		System.err.println("Programa Soma (c) 2019. Versão 0.0.2");
    		return;
    	}

    	try {
        	verificarNumeroDeParamentros(args);
        	int a = Integer.parseInt(args[0]);
            int b = Integer.parseInt(args[1]);
            System.out.println(somar(a, b));

		} catch (NumberFormatException e) {
			System.err.println("Valor inválido!");
			return;
		
	    } catch (IllegalArgumentException e) {
	    	System.err.println("Número incorreto de argumentos!");
			return;
		}
    	
    }
	static void verificarNumeroDeParamentros(String[] args) {
		
		if(args.length != 2) {
    		
    		throw new IllegalArgumentException();
    	}
	}
    /**
     * 
     * @param a
     * @param b
     * @return
     */
	static int somar(int a, int b) {
		return a+b;
	}
}
