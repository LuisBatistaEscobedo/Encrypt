package encryption;
import org.jasypt.util.text.BasicTextEncryptor;

public class Encript {

	public static void main(String[] args) {
		BasicTextEncryptor cryp = new BasicTextEncryptor();
		
		// Encryption password
		cryp.setPassword("asd");
		
		//string que se va a encriptar
		String card = "1234567890";
		
		String textEncrpyted = cryp.encrypt(card);
		
		System.out.println(textEncrpyted);

		String backText = cryp.decrypt(textEncrpyted);
		
		System.out.println(backText);
		
	}

}
