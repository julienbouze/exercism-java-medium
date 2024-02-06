public class AffineCipher {
    
    public String encode(String text, int coefficient1, int coefficient2) {
        if (!isCoprime(coefficient1, 26)) {
            throw new IllegalArgumentException("Error: keyA and alphabet size must be coprime.");
        }
        text = text.replaceAll(" ", "").toLowerCase();
        StringBuilder encodedText = new StringBuilder();
        int count = 0;
    
        for (int i = 0; i < text.length(); ++i) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                char encodedChar = (char) (((coefficient1 * index + coefficient2) % 26) + 'a');
                encodedText.append(encodedChar);
                ++count;
            } 
            if (ch >= '0' && ch <= '9') {
                encodedText.append(ch);
                ++count;
            }
            if (count == 5) {
                encodedText.append(' ');
                count = 0;
            }
            
        }
        if (encodedText.length() > 0 && encodedText.charAt(encodedText.length() - 1) == ' ') {
            encodedText.deleteCharAt(encodedText.length() - 1);
        }
        return encodedText.toString();
    }

    public String decode(String text, int coefficient1, int coefficient2){
        if (!isCoprime(coefficient1, 26)){
            throw new IllegalArgumentException("Error: keyA and alphabet size must be coprime.");
        }
        text = text.replaceAll(" ", "").toLowerCase();
        StringBuilder decodedText = new StringBuilder();
        int aInverse = modInverse(coefficient1, 26);

        for (int i = 0; i < text.length(); ++i){
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                int index = ch - 'a';
                char decodedChar = (char) ((((aInverse * (index - coefficient2 + 26)) % 26) + 26) % 26 + 'a');
                decodedText.append(decodedChar);
            } 
            if (ch >= '0' && ch <= '9') {
                decodedText.append(ch);
            }

        }
        return decodedText.toString();
    }

    private int modInverse(int a, int m) {
        for (int x = 1; x < m; x++) {
            if ((a * x) % m == 1) {
                return x;
            }
        }
        throw new ArithmeticException("Inverse does not exist");
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    public static boolean isCoprime(int a, int b) {
        return gcd(a, b) == 1;
    }
}

