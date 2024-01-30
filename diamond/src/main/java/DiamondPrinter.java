import java.util.ArrayList;
import java.util.List;

class DiamondPrinter {

    List<String> printToList(char targetLetter) {
        if (targetLetter < 'A' || targetLetter > 'Z') {
            throw new IllegalArgumentException("Please provide a valid uppercase letter.");
        }
        List<String> diamond = new ArrayList<>();
        for (char currentLetter = 'A'; currentLetter <= targetLetter; currentLetter++) {
            diamond.add(buildLine(targetLetter, currentLetter));
        }
        for (char currentLetter = (char) (targetLetter - 1); currentLetter >= 'A'; currentLetter--) {
            diamond.add(buildLine(targetLetter, currentLetter));
        }
        return diamond;
    }

    private String buildLine(char targetLetter, char currentLetter) {
        int leadingSpaces = targetLetter - currentLetter;
        int trailingSpaces = targetLetter - currentLetter;
        StringBuilder line = new StringBuilder();
        for (int i = 0; i < leadingSpaces; i++) {
            line.append(" ");
        }
        line.append(currentLetter);
        if (currentLetter != 'A') {
            for (int i = 0; i < (currentLetter - 'A') * 2 - 1; i++) {
                line.append(" ");
            }
            line.append(currentLetter);
        }

        for (int i = 0; i < trailingSpaces; i++) {
            line.append(" ");
        }
        return line.toString();
    }
}
