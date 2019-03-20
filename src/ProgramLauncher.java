public class ProgramLauncher {

    public static void main(String[] args) {
        String[] testArray = {"aa", "bb", "cc", "dd", "ee", "ff", "dd", "ee", "aa", "cc", "dd", "ee", "ff", "gg"};
        UniqueArray uniqueArray = new UniqueArray();

        for (int i = 0; i < testArray.length; i++) {
            uniqueArray.add(testArray[i]);
        }
        System.out.println("Начальный массив");
        uniqueArray.printArray();
        uniqueArray.remove("ee");
        uniqueArray.remove("bb");
        uniqueArray.remove("ii");
        System.out.println("Уменьшенный массив");
        uniqueArray.printArray();

        PhoneBook phoneBook=new PhoneBook();
        phoneBook.add("Иванов","(916) 235-81-26");
        phoneBook.add("Петров","(916) 523-86-77");
        phoneBook.add("Кузнецов","(916) 344-65-98");
        phoneBook.add("Иванов","(917) 623-22-01");
        phoneBook.add("Васильев","(917) 013-22-81");
        phoneBook.add("Ахмед-оглы","(917) 828-36-64");
        phoneBook.add("Иванов","(987) 332-46-32");
        phoneBook.add("Петров","(987) 332-16-24");
        phoneBook.get("Иванов");
        phoneBook.get("Петров");

    }
}
