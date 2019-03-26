import java.util.ArrayList;
import java.util.Iterator;

public class PhoneBook { //Класс Телефонная книга для задания № 2
    private ArrayList<String[]> phoneRecord = new ArrayList<>();

    public void add(String name, String phoneNumber) {
        String[] record = new String[2];
        record[0] = name;
        record[1] = phoneNumber;
        phoneRecord.add(record);
    }

    public void get(String name) {
        String[] record;
        Iterator<String[]> iter = phoneRecord.iterator();
        System.out.println("Фамилия " + name + ". Известные телефоны");
        while (iter.hasNext()) {
            record = iter.next();
            if (record[0].equals(name)) System.out.println(record[1]);
        }
        System.out.println("Больше данных нет" + "\n");
    }
}

