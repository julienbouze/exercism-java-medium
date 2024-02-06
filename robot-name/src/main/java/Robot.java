import java.util.HashSet;
import java.util.Random;
import java.util.Set;

class Robot {
    private static final Set<String> usedNames = new HashSet<>();
    private String name;

    Robot() {
        reset();
    }

    String getName() {
        return name;
    }

    void reset() {
        usedNames.remove(name);
        do {
            name = generateName();
        } while (usedNames.contains(name) || name == null);
        usedNames.add(name);
    }

    private String generateName() {
        return randomString('A', 'Z', 2) + randomString('0', '9', 3);
    }

    private String randomString(char from, char to, int len) {
        return new Random()
                .ints(from, to + 1)
                .limit(len)
                .collect(StringBuilder::new, (sb, c) -> sb.append((char) c), StringBuilder::append)
                .toString();
    }
}
