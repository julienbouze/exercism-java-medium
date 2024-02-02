class LuhnValidator {

    boolean isValid(String candidate) {
        candidate = candidate.replaceAll(" ", "");
        if (!checkLength(candidate)){
            return false;
        }
        if (!checkNumber(candidate)){
            return false;
        }
        String[] cleanCandidate = candidate.split("");
        int temp = 0;
        int nb = 0;
        for (int i = candidate.length()-2;i>=0;i-=2){
            temp = Integer.parseInt(cleanCandidate[i])*2;
            if(temp>9){
                temp -=9;
            }
            cleanCandidate[i] = String.valueOf(temp);
        }
        for (String cdt : cleanCandidate){
            nb += Integer.parseInt(cdt);
        }
        return nb % 10 == 0;
    }

    boolean checkLength(String candidate){
        return candidate.length() > 1;
    }
    boolean checkNumber(String candidate){
        for (char c : candidate.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        return true;
    }
}
