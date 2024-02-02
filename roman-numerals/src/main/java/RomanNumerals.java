import java.util.TreeMap;

class RomanNumerals {
    int number ;
    RomanNumerals(int number) {
        if (number < 1 || number > 3999){
            throw new IllegalArgumentException();
        }
        this.number = number;
    }

    String getRomanNumeral() {
        TreeMap<Integer, String> map = maping();
        int valeur = map.floorKey(number);
        if (number == valeur) {
            return map.get(number);
        }
        return map.get(valeur) + new RomanNumerals(number - valeur).getRomanNumeral();

    }

    TreeMap<Integer,String> maping(){
        TreeMap<Integer,String> map = new TreeMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
        return map;
    }
}
