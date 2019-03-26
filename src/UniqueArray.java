import java.util.ArrayList;

public class UniqueArray { //Класс для задания № 1. Хранит уникальные строковые значения и их количество
    private ArrayList<String> stringList = new ArrayList<>();
    private ArrayList<Integer> countList = new ArrayList<>();

    public void add(String stringValue) {
        int stringIndex = stringList.indexOf(stringValue);
        if (stringIndex < 0) {
            stringList.add(stringValue);
            countList.add(1);
        } else {
            countList.set(stringIndex, countList.get(stringIndex) + 1);
        }
    }

    public void remove(String stringValue) {
        int stringIndex = stringList.indexOf(stringValue);
        if (stringIndex < 0) return;
        if (countList.get(stringIndex) == 1) {
            stringList.remove(stringIndex);
            countList.remove(stringIndex);
        } else {
            countList.set(stringIndex, countList.get(stringIndex) - 1);
        }
    }

    public void printArray() {
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i) + " - " + countList.get(i));
        }
        System.out.println();
    }
}
