class Atbash {

    String encode(String input) {
        input = input.toLowerCase();
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for (int i = 0; i < input.length(); ++i){
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                char en = (char) ('z' - (ch - 'a'));
                sb.append(en);
                count++;
            }
            if (ch >= '0' && ch <= '9'){
                sb.append(ch);
                count++;
            }
            if (count == 5){
                sb.append(' ');
                count = 0;
            }
        }
        if (sb.length() > 0 && sb.charAt(sb.length() - 1) == ' '){
            sb.deleteCharAt(sb.length() - 1);
        }

        return sb.toString();
    }

    String decode(String input) {
        input = input.toLowerCase().replace(" ","");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < input.length(); ++i){
            char ch = input.charAt(i);
            if (ch >= 'a' && ch <= 'z'){
                char en = (char) ('z' - (ch - 'a'));
                sb.append(en);
            }
            if (ch >= '0' && ch <= '9'){
                sb.append(ch);
            }
            
        }
        return sb.toString();

    }

}
