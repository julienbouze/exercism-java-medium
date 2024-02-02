import java.util.HashMap;
import java.util.Map;

class NucleotideCounter {
    String sequence;

    NucleotideCounter(String sequence) {
        this.sequence = sequence;
        for (int i = 0; i< sequence.length();++i){
            if (!isNucleotide(sequence.charAt(i))){
                throw new IllegalArgumentException();
            }
        }
    }

    Map<Character, Integer> nucleotideCounts() {
        Map<Character, Integer> nucleotideCount = new HashMap<>();
        nucleotideCount.put('A', 0);
        nucleotideCount.put('C', 0);
        nucleotideCount.put('G', 0);
        nucleotideCount.put('T', 0);

        for (char nucleotide : sequence.toCharArray()) {
            if (nucleotideCount.containsKey(nucleotide)) {
                nucleotideCount.put(nucleotide, nucleotideCount.get(nucleotide) + 1);
            }
        }
        return nucleotideCount;
    }

    boolean isNucleotide(char character){
        return character == 'A' || character == 'C' || character == 'G' || character == 'T';
    }

}