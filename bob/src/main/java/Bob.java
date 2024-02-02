class Bob {

    String hey(String input) {
        input = input.trim();

        if (isQuestion(input) && isYelling(input)) {
            return "Calm down, I know what I'm doing!";
        } else if (isQuestion(input)) {
            return "Sure.";
        } else if (isYelling(input)) {
            return "Whoa, chill out!";
        } else if (isSilence(input)) {
            return "Fine. Be that way!";
        } else {
            return "Whatever.";
        }
    }

    boolean isQuestion(String input) {
        return input.endsWith("?");
    }

    boolean isYelling(String input) {
        return input.matches(".*[a-zA-Z].*") && input.equals(input.toUpperCase());
    }

    boolean isSilence(String input) {
        return input.isEmpty();
    }
}
