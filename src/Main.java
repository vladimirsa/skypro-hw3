public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1");
        int a = 10;
        byte b = 20;
        short c = 30;
        long d = 40;
        float e = 50.0f;
        double f = 60.0;

        System.out.println("Значение переменной a с типом int равно " + a);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной c с типом short равно " + c);
        System.out.println("Значение переменной d с типом long равно " + d);
        System.out.println("Значение переменной e с типом float равно " + e);
        System.out.println("Значение переменной f с типом double равно " + f);

//        Задание 2
        float firstVar = 27.12f;
        long second = 987678965549L;
        float third = 2.786f;
        int fourth = 569;
        int fifth = -159;
        int sixth = 27897;
        byte seventh = 67;

        System.out.println("Задание 3");
        int ludmilaNumStudents = 23;
        int annaNumStudents = 27;
        int ekaterinaNumStudents = 30;
        int totalPaperCount = 480;
        int totalStudents = ludmilaNumStudents + annaNumStudents + ekaterinaNumStudents;
        int paperCountPerStudent = totalPaperCount / totalStudents;

        System.out.println("На каждого ученика рассчитано " + paperCountPerStudent + " листов бумаги");

        System.out.println("Задание 4");
        int bottlesPerTwoMinutes = 16;
        int bottlesPerMinute = bottlesPerTwoMinutes / 2;
        int bottlesPerTwentyMinutes = bottlesPerMinute * 20;
        int bottlesPerDay = bottlesPerMinute * 60 * 24;
        int bottlesPerThreeDays = bottlesPerDay * 3;
        int bottlesPerMonth = bottlesPerDay * 30;

        System.out.println("За 20 минут машина произвела " + bottlesPerTwentyMinutes + " штук бутылок");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок");
        System.out.println("За 3 дня машина произвела " + bottlesPerThreeDays + " штук бутылок");
        System.out.println("За 1 месяц машина произвела " + bottlesPerMonth + " штук бутылок");

        System.out.println("Задание 5");
        int totalCans = 120;
        int whiteCansPerClass = 2;
        int brownCansPerClass = 4;
        int cansPerClass = whiteCansPerClass + brownCansPerClass;

        int totalClasses = totalCans / cansPerClass;
        int totalWhiteCans = totalClasses * whiteCansPerClass;
        int totalBrownCans = totalClasses * brownCansPerClass;

        System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhiteCans + " банок белой краски и " + totalBrownCans + " банок коричневой краски");

        System.out.println("Задание 6");
        int bananas = 5 * 80;
        int milk = 2 * 105;
        int iceCream = 2 * 100;
        int eggs = 4 * 70;
        int totalGram = bananas + milk + iceCream + eggs;
        float totalKg = (float) totalGram / 1000;
        System.out.println("Результат в граммах " + totalGram + " гр" + " или " + totalKg + " кг");
    }
}