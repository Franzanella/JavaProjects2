package idioma;

import java.util.Locale;

public class IdiomaSistema {

	public static void main(String[] args) {
		  Locale idioma = Locale.getDefault();
	      System.out.print("O idioma do sistema � ");
	      System.out.println (idioma.getDisplayLanguage()); // imprime �Portugu�s�
	}

}
