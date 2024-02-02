import java.util.ArrayList;

class TwelveDays {
    String verse(int verseNumber) {
        if (verseNumber > 0 || verseNumber <= positionList().size()) {
            String verse = "On the " + positionList().get(verseNumber - 1) + " day of Christmas my true love gave to me: ";
            ArrayList<String> verseList = verseList();
            for (int i = verseNumber - 1; i >= 0; --i){
                verse += verseList.get(i);
                if (i == 0){
                    verse +=  ".\n"; 
                }
                else if(i == 1 && verseNumber > 1){
                    verse +=  ", and "; 
                }
                else{
                    verse += ", ";
                }
                
            }
            return verse;
        }
        return "KO";
        
    }

    String verses(int startVerse, int endVerse) {
        String verses = "";
        for (int i = startVerse; i <= endVerse; ++i){
            verses += verse(i);
            if (i < endVerse){
                verses += "\n";
            }
        }
        return verses;
    }
    
    String sing() {
        return verses(1,12);
    }
    
    ArrayList<String> verseList() {
        ArrayList<String> verseList = new ArrayList<>();
        verseList.add("a Partridge in a Pear Tree");
        verseList.add("two Turtle Doves");
        verseList.add("three French Hens");
        verseList.add("four Calling Birds");
        verseList.add("five Gold Rings");
        verseList.add("six Geese-a-Laying");
        verseList.add("seven Swans-a-Swimming");
        verseList.add("eight Maids-a-Milking");
        verseList.add("nine Ladies Dancing");
        verseList.add("ten Lords-a-Leaping");
        verseList.add("eleven Pipers Piping");
        verseList.add("twelve Drummers Drumming");
        return verseList;
    }
    ArrayList<String> positionList(){
        ArrayList<String> positions = new ArrayList<>();
        positions.add("first");
        positions.add("second");
        positions.add("third");
        positions.add("fourth");
        positions.add("fifth");
        positions.add("sixth");
        positions.add("seventh");
        positions.add("eighth");
        positions.add("ninth");
        positions.add("tenth");
        positions.add("eleventh");
        positions.add("twelfth");
        return positions;
    }
}
