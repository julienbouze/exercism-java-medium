public class BottleSong {

    String recite(int startBottles, int takeDown) {
        StringBuilder result = new StringBuilder();

        for (int i = startBottles; i >= startBottles - takeDown + 1; i--) {
            result.append(numberToWords(i))
                    .append(" green bottle")
                    .append(i > 1 ? "s" : "")
                    .append(" hanging on the wall,\n")
                    .append(numberToWords(i))
                    .append(" green bottle")
                    .append(i > 1 ? "s" : "")
                    .append(" hanging on the wall,\n")
                    .append("And if one green bottle should accidentally fall,\n")
                    .append("There'll be ").append(numberToWords(i - 1 == 0 ? 0 : i - 1).toLowerCase()).append(" green bottle")
                    .append(i - 1 == 1 ? "" : "s")
                    .append(" hanging on the wall.\n")
                    .append(i - 1 == startBottles - takeDown ? "" : "\n");
        }

        return result.toString();
    }

    private String numberToWords(int number) {
        String[] units = {"no", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
        if (number >= 0 && number <= 10) {
            return units[number];
        } else {
            return String.valueOf(number);
        }
    }
}
