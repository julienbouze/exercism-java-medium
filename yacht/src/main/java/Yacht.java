import java.util.Arrays;

class Yacht {
    int[] dice;
    YachtCategory yachtCategory ;

    Yacht(int[] dice, YachtCategory yachtCategory) {
        this.dice = dice;
        this.yachtCategory = yachtCategory;
    }

    int score() {
        int score = 0;
        switch (yachtCategory) {  
            case ONES :
            case TWOS :
            case THREES :
            case FOURS :
            case FIVES :
            case SIXES :
                for (int value : dice){
                    if (value == yachtCategory.ordinal()){
                        score += value;
                    }
                }
                break;
            case FULL_HOUSE :
                Arrays.sort(dice);
                if ((dice[0] == dice[1] && dice[1] == dice[2] && dice[3] == dice[4] && dice[0] != dice[4])
                        || (dice[0] == dice[1] && dice[2] == dice[3] && dice[3] == dice[4] && dice[0] != dice[4])) {
                    score = Arrays.stream(dice).sum();
                }
                break;
            case FOUR_OF_A_KIND :
                Arrays.sort(dice);
                for (int i = 0; i <= 2; i++) {
                    if (dice[i] == dice[i + 1] && dice[i] == dice[i + 2] && dice[i] == dice[i + 3]) {
                        score = 4 * dice[i];
                        break;
                    }
                }
                break;
            case LITTLE_STRAIGHT :
                Arrays.sort(dice);
                if (Arrays.equals(dice, new int[]{1,2,3,4,5})){
                    score = 30;
                }
                break;
            case BIG_STRAIGHT :
                Arrays.sort(dice);
                if (Arrays.equals(dice, new int[]{2,3,4,5,6})){
                    score = 30;
                }
                break;
            case CHOICE :
                for (int value : dice) {
                    score += value;
                }
                break;
            case YACHT :
                int firstValue = dice[0];
                boolean isYacht = true;
                for (int value : dice) {
                    if (value != firstValue) {
                        isYacht = false;
                        break;
                    }
                }
                if (isYacht) {
                    score = 50;
                }
                break;
        }
        return score;
    }

}
