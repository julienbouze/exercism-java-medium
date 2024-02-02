import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class KindergartenGarden {
    String garden;

    KindergartenGarden(String garden) {
        this.garden = garden;
    }

    List<Plant> getPlantsOfStudent(String student) {
        String[] rows = garden.split("\n");
        Map<String, Integer> students = getStudents();
        if (!students.containsKey(student)) {
            throw new IllegalArgumentException("Student not found in the list");
        }

        int position = students.get(student) * 2 - 2;
        List<Plant> plants = new ArrayList<>();
        plants.add(Plant.getPlant(rows[0].charAt(position)));
        plants.add(Plant.getPlant(rows[0].charAt(position + 1)));
        plants.add(Plant.getPlant(rows[1].charAt(position)));
        plants.add(Plant.getPlant(rows[1].charAt(position + 1)));
        return plants;
    }

    Map<String, Integer> getStudents() {
        Map<String, Integer> studentList = new HashMap<>();
        studentList.put("Alice", 1);
        studentList.put("Bob", 2);
        studentList.put("Charlie", 3);
        studentList.put("David", 4);
        studentList.put("Eve", 5);
        studentList.put("Fred", 6);
        studentList.put("Ginny", 7);
        studentList.put("Harriet", 8);
        studentList.put("Ileana", 9);
        studentList.put("Joseph", 10);
        studentList.put("Kincaid", 11);
        studentList.put("Larry", 12);
        return studentList;
    }
}
