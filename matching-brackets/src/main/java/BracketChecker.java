import java.util.Stack;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class BracketChecker {
    String expression;
    BracketChecker(String expression) {
        this.expression = expression;
    }

    boolean areBracketsMatchedAndNestedCorrectly() {
        String temp = removeNonBracketCharacters();
        return checkBrackets(temp);
    }

    String removeNonBracketCharacters() {
        String regex = "[^\\[\\]{}()]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(expression);
        return matcher.replaceAll("");
    }
    boolean checkBrackets(String input) {
        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            if (isOpeningBracket(c)) {
                stack.push(c);
            } else if (isClosingBracket(c)) {
                if (stack.isEmpty() || !bracketsMatch(stack.pop(), c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty(); // Si la pile est vide, tous les crochets étaient correctement appariés.
    }

    boolean isOpeningBracket(char c) {
        return c == '[' || c == '{' || c == '(';
    }

    boolean isClosingBracket(char c) {
        return c == ']' || c == '}' || c == ')';
    }

    boolean bracketsMatch(char open, char close) {
        return (open == '[' && close == ']') ||
               (open == '{' && close == '}') ||
               (open == '(' && close == ')');
    }
}