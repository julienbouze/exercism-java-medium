public class SquareRoot {
    public int squareRoot(int radicand) {
        int value = 1;
        while (value*value != radicand){
            value +=1;
        }
        return value;
        
    }
}
