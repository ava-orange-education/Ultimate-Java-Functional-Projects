import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import java.security.SecureRandom;
import java.util.Base64;

public class SymmetricEncryptionWithIV {

    public static void main(String[] args) {
        try {
            // Step 1: Generate Secret Key and IV
            KeyGenerator keyGenerator = KeyGenerator.getInstance("AES");
            keyGenerator.init(128); // key sizes: 128, 192, 256 (if permitted)
            SecretKey secretKey = keyGenerator.generateKey();
            byte[] iv = generateIV(16); // AES block size = 16 bytes

            // Step 2: Encrypt the Plaintext
            String plainText = "Hello, IV!";
            Cipher cipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
            IvParameterSpec ivSpec = new IvParameterSpec(iv);
            cipher.init(Cipher.ENCRYPT_MODE, secretKey, ivSpec);

            byte[] encryptedBytes = cipher.doFinal(plainText.getBytes());
            String encryptedText = Base64.getEncoder().encodeToString(encryptedBytes);

            System.out.println("Encrypted Text: " + encryptedText);

            // Step 3: Decrypt the Ciphertext
            cipher.init(Cipher.DECRYPT_MODE, secretKey, ivSpec);
            byte[] decryptedBytes =
                    cipher.doFinal(Base64.getDecoder().decode(encryptedText));
            String decryptedText = new String(decryptedBytes);

            System.out.println("Decrypted Text: " + decryptedText);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static byte[] generateIV(int blockSize) {
        byte[] iv = new byte[blockSize];
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextBytes(iv);
        return iv;
    }
}
