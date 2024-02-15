package cryptage;

import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;

public class cryptage {

    public static void main(String [] args) throws NoSuchAlgorithmException {



            //Tu prend le type de clé
            KeyGenerator keyGen = KeyGenerator.getInstance("HmacSHA256");

            // tu initialiser la clés

            keyGen.init(128) ;

            // Tu genere la clés
             SecretKey key = keyGen.generateKey();

            String encodedKey = Base64.getEncoder().encodeToString(key.getEncoded());

            System.out.println("Clé (" + key.getAlgorithm() + "," + key.getFormat() + ") : " + encodedKey );


    }
}
