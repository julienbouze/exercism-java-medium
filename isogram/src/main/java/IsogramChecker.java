class IsogramChecker {

    boolean isIsogram(String phrase) {
        String cleanedPhrase = phrase.replaceAll("[\\s-]", "").toLowerCase();
        for (int i = 0; i < cleanedPhrase.length(); ++i) {
            for (int j = i + 1; j < cleanedPhrase.length(); ++j) {
                if (cleanedPhrase.charAt(i) == cleanedPhrase.charAt(j)) {
                    return false;
                }
            }
        }
        return true;  
    }
}

