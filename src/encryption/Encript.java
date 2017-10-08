package encryption;
import org.jasypt.util.text.BasicTextEncryptor;

public class Encript {

	public static void main(String[] args) {
		BasicTextEncryptor cryp = new BasicTextEncryptor();
		
		cryp.setPassword("asd");
		
		String card = "1234567890";
		
		String textEncrpyted = cryp.encrypt(card);
		
		System.out.println(textEncrpyted);

		String backText = cryp.decrypt(textEncrpyted);
		
		System.out.println(backText);
		
	}

}
