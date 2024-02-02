import java.util.HashSet;

class SumOfMultiples {
    int number;
    int[] set ;
    HashSet<Integer> multiple ;

    SumOfMultiples(int number, int[] set) {
        this.number = number;
        this.set = set;
        this.multiple = setMultiples();

    }
    HashSet<Integer> setMultiples(){
        HashSet<Integer> multiplesSet = new HashSet<>();
        for (int element : set) {
            if(element !=0){
                for (int multiple = element; multiple < number; multiple += element) {
                    multiplesSet.add(multiple);
                }
            }
            
        }
        return multiplesSet;
    }

    int getSum() {
        if ((set.length == 1 && set[0] == 0) || set.length == 0){
            return 0;
        }

        int sum = 0 ;
        for (int element : multiple){
            sum += element;
        }
        return sum;
    }
}
