public class Main {
    public static void main(String[]args) {
        int eaters = 5; // сколько людей будет есть
        int water = 3000; // миллилитров воды
        int potatos = 5; // картофелин
        int chiken = 6; // куриных бёдер
        int spices = 10; // ложек специй

        System.out.println("Сварили суп. На одного человека вышло.");
        System.out.println((water / eaters) + " миллилитров(а) воды ");
        System.out.println((potatos / eaters )+ " картофелин(а/ы) ");
        System.out.println((chiken / eaters)+ " куриных(ое) бёдер(ро) ");
        System.out.println(( spices / eaters)+ " ложек(ки/ка) специй");
    }
}
