public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // задача 1

        int n = 20;
        System.out.println("Значение переменной с типом int равно " + n );

        byte m = 13;
        System.out.println("Значение переменной с типом byte равно " + m  );

        short we = 40;
        System.out.println("Значение переменной с типом short равно " + we );

        long ga = 543252456L;
        System.out.println("Значение переменной с типом long равно " + ga  );

        float c = 37.6f;
        System.out.println("Значение переменной с типом float равно" + c );

        double b = 22.24d;
        System.out.println("Значение переменной с типом doble равно " + b );


        // задача 2

        float a = 27.12f;
        System.out.println("A = " + a);

        double d = 987678965549d;
        System.out.println("D = " + d);

        double q = 2.786d;
        System.out.println("Q = " + q);

        short e = 569;
        System.out.println("E = " + e);

        short t = -159;
        System.out.println("T = " + t);

        int p = 27897;
        System.out.println("P = " + p);

        byte z = 67;
        System.out.println("Z = " + z);


        // задача 3

        byte classLP = 23;
        byte classAS = 27;
        byte classEA = 30;
        byte numberStudent = (byte) (classLP + classAS + classEA);
        short totalPaper = 480;
        int paperStudents = totalPaper / numberStudent;
        System.out.println("На каждого ученика рассчитано " + paperStudents + " листов бумаги");


        // задача 4


        byte twoMinutesMachine = 16;
        int oneMinutesMachine = twoMinutesMachine / 2;
        byte twentyMinutes = 20;
        int inTwentyMinutes = oneMinutesMachine * twentyMinutes;
        System.out.println("Производительность машины " + inTwentyMinutes + " за 20 минут");

        byte hour = 24;
        byte OneHourMinutes = 60;
       short inDay = (short) (hour * OneHourMinutes);
        int perDay = oneMinutesMachine * inDay;
        System.out.println("Производительность машины " + perDay + " за сутки");

        short threeDay = (short) (inDay * 3);
        int inThreeDay = threeDay * oneMinutesMachine;
        System.out.println("Производительность машины " + inThreeDay + " за три дня");

        int month = inDay * 31;
       int inMonth = month * oneMinutesMachine;
        System.out.println("Производительность машины " + inMonth + " за месяц");


        // задача 5

        byte totalCans = 120;
        byte oneClass = 6;
        short totalClass = (short) (totalCans / oneClass);
        int whitePaint = totalClass * 2;
        int brownPaint = totalClass * 4;
        System.out.println("В школе, где " + totalClass + " классов, нужно " + whitePaint + " банок белой краски и " + brownPaint + " банок коричневой краски");

        // задача 6

       byte bananas = 80;
       short fiveBananas = (short) (bananas * 5);
        byte milk = 105;
        short twoMilk = (short) (milk * 2);
        byte iceCream = 100;
        short twoIceCream = (short) (iceCream * 2);
        byte eggs = 70;
        short fourEggs = (short) (eggs * 4);
        short breakfastGr = (short) (fiveBananas+twoMilk+twoIceCream+fourEggs);
        System.out.println("Всего съедает один спортсмен за завтрак " + breakfastGr + " грамм" );
        int gerPerKg = 1000;
        float weightKg = breakfastGr /(float)gerPerKg;
        System.out.println("Всего съедает один спортсмен за завтрак " + weightKg + " кг");


        // задача 7

        float weightLoss = 7f;
        float weightLossRate = 0.25f;
        float greatWeightLoss = 0.5f;
        float lowSpeedPerDay = weightLoss / weightLossRate;
        float highSpeedPerDay = weightLoss / greatWeightLoss;
        float averageDays = (lowSpeedPerDay + highSpeedPerDay)/2;
        System.out.println("Если спортсмен будет терять по " + (int)(weightLossRate*1000) + " граммов в день " + " то на похудение на " + (int) lowSpeedPerDay + " кг уйдёт " + (int) highSpeedPerDay + " дней.");
        System.out.println("Если спортсмен будет терять по " + (int) (greatWeightLoss*1000) + " граммов в день " +
                "то на похудение на " + (int)weightLoss + " кг уйдёт " + (int)highSpeedPerDay + " дней.");
        System.out.println("В среднем для достижения результата похудения можно достичь за " + (int) averageDays + " дней.");


        // задача 8


        float salaryMasha = 67760f;
        float salaryDenis = 83690f;
        float salaryKris = 76230f;
        int percent = 10;
        float newSalaryMasha = salaryMasha + (salaryMasha/100)*percent;
        float newSalaryDenis = salaryDenis + (salaryDenis/100)*percent;
        float newSalaryKris = salaryKris + (salaryKris/100)*percent;
        float yearSalaryMasha = newSalaryMasha*12 - salaryMasha*12;
        float yearSalaryDenis = newSalaryDenis*12 - salaryDenis*12;
        float yearSalaryKris = newSalaryKris*12 - salaryKris*12;
        System.out.println("Маша теперь получает " + newSalaryMasha +  " рублей ."+ "Годовой доход вырос на " + yearSalaryMasha + " рублей");
        System.out.println("Денис теперь получает " + newSalaryDenis + " рублей ." + " Годовой доход вырос на " + yearSalaryDenis + " рублей");
        System.out.println("Кристина теперь получает " + newSalaryKris + "рублей." + " Годовой доход вырос на " + yearSalaryKris +  " рублей");

































    }
}
