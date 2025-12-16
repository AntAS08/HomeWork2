//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class  Main {
    public static void  main(String[] args) {
       System.out.println("Задача 1");
        byte i = 10;
        System.out.println(i);
        short a = 300;
        System.out.println(a);
        int b = -1000000000;
        System.out.println(b);
        long c =9000000000000L;
        System.out.println(c);
        float e = 1.5f;
        System.out.println(e);
        double f = -1.7;
        System.out.println(f);

        System.out.println("Задача 2");
        float  g = 27.12f;
        System.out.println(g);
        long h = 987678965549L;
        System.out.println(h);
        double j = 2.286;
        System.out.println(j);
        short k = 569;
        System.out.println(k);
        short p =-159;
        System.out.println(p);
        int m = 27897;
        System.out.println(m);
        byte y = 67;
        System.out.println(y);

        System.out.println("Задача 3");
     byte LudmilaPavlovna = 23 ;
     System.out.println( "Людмила Павловна" + LudmilaPavlovna +  " ученик " );
     byte AnnaSergeevna = 27 ;
     System.out.println( "Анна Сергеевна" + AnnaSergeevna +  " Ученик " );
     short EkaterinaAndreevna = 30;
     System.out.println( "Екатерина Андреевна" + EkaterinaAndreevna + " Ученик " );
     int allStudents = LudmilaPavlovna + AnnaSergeevna + EkaterinaAndreevna ;
     System.out.println( "Всего учеников"  +   allStudents );
     short amountOfpeper = 480 ;
     System.out.println( "Количество листов бумаги"  +  amountOfpeper );
     int evryReceive= amountOfpeper/allStudents ;
     System.out.println( "Каждый ученик получит"  +  evryReceive  +  "шт" );

       System.out.println("Задача 4");
     byte performanceMechanism = 16 ;
     System.out.println(" За 2 минуты " +" Производительность машины "+ performanceMechanism);
     int performaceTwentyminuts = performanceMechanism * 10;
     System.out.println(" За 20 минут" + performaceTwentyminuts + "шт");
     byte hour = 60;
     System.out.println(" Один Час-минут"+ hour );
     byte day = 24 ;
     int performaceDay = (hour*day)/2*performanceMechanism;
     System.out.println  ( " За сутки " + "Производительность машины" +  performaceDay   );
     byte threeDays = 72 ;
     System.out.println( " Три дня " + threeDays ) ;
     int performaceThreedays = (threeDays*hour)/2*16 ;
     System.out.println(" За три дня " + " Производительность машины "+ performaceThreedays );
     int oneMonthhour  = 720 ;
     System.out.println(" В месяце часов " + oneMonthhour  );
     int performaceOnemonth = (oneMonthhour*hour)/2*16;
     System.out.println("За один месяц"+" Производительность машины "+performaceOnemonth);

     System.out.println("Задача 5");
     byte allBanks = 120;
     System.out.println("Всего банок "+allBanks);
     byte whitePaint = 2;
     System.out.println("Трата белой краски"+whitePaint);
     byte brownPaint = 4;
     System.out.println("Трата коричневой краски"+brownPaint);
     int allclasses = allBanks/(whitePaint+brownPaint);
     System.out.println(" Колличество классов " + allclasses);
     int allWhitepaint = allclasses*whitePaint;
     System.out.println("Всего белой краски"+allWhitepaint+"шт");
     int allBrownpaint = allclasses*brownPaint;
     System.out.println("Всего коричневой краски"+allBrownpaint );
     System.out.println(" В школе где " + allclasses + " классов" + " нужно " + allWhitepaint + " банок белой краски и " + allBrownpaint + " банок коричневой краски ");

     System.out.println("Задача 6");
     short banans = 400 ;
     System.out.println(" 5 бананов в граммах " + banans);
     short milk = 210 ;
     System.out.println(" Молоко в граммах "+ milk);
     short iceCream = 200 ;
     System.out.println(" Мороженное-пламбир в граммах "+ iceCream);
     short egg = 280 ;
     System.out.println(" Яйцо сырое 4 штуки в граммах " + egg);
     int totalWeightofBreakfast = banans+milk+iceCream+egg;
     System.out.println(" Общий вес завтрака в граммах " + totalWeightofBreakfast );
     float totalWeightofBreakfastkilogram = 1.09f;
     System.out.println(" Завтрак в килограммах " + totalWeightofBreakfastkilogram );

     System.out.println(" Задача 7 ");
     int totalkilogram = 7000 ;
     System.out.println(" Всего киллограмов в граммах "+ totalkilogram );
     int lossA = 250;
     System.out.println(lossA);
     int lossB = 500 ;
     System.out.println(lossB );
     int howManydaysA = totalkilogram/lossA;
     System.out.println(" Потеря веса каждый день по 250 грамм " + howManydaysA + " Дней ");
     int howManydaysB = totalkilogram/lossB ;
     System.out.println(" Потеря веса каждый день по 500 грамм " + howManydaysB + "Дней "  );
     long daysOnaverage = howManydaysA / howManydaysB  ;
     System.out.println(" В среднем потребуется " + daysOnaverage + " Дней ");

     System.out.println("Задача 8");
     int salaryMasha = 67760 ;
     System.out.println(" Зарплата Маши "+salaryMasha );
     float salaryIncreasemasha =salaryMasha*0.1f;
     System.out.println(" Поднятие зарплаты Маши на десять процентов "+ salaryIncreasemasha );
     float receivesMasha = salaryMasha+salaryIncreasemasha;
     System.out.println("Текущая зарплата Маши "+ receivesMasha);
     float annualIncomeMashaA = receivesMasha * 12;
     System.out.println("Годовой доход Маши после повышения  "+ annualIncomeMashaA);
     float annualIncomeMashaB = salaryMasha*12 ;
     System.out.println("Годовой дохад Маши до поваышения " +annualIncomeMashaB );
     float annualIncomeicreasedMasha = annualIncomeMashaA-annualIncomeMashaB;
     System.out.println("Разница после увеличения зарплаты Маши " +annualIncomeicreasedMasha);
     System.out.println(" Маша теперь получает " + receivesMasha + " Годовой доход вырос на  " + annualIncomeicreasedMasha + " рублей" );

     int salaryDenis = 83690;
     System.out.println(" Зарплата Дениса"+salaryDenis );
     float salaryIncreaseDenis = salaryDenis*0.1f;
     System.out.println(" Повышение зарплаты Дениса на десять процентов "+ salaryIncreaseDenis);
     float receivesDenis = salaryDenis+salaryIncreaseDenis;
     System.out.println("Текущая зарплата Дениса "+receivesDenis );
     float annualIncomeDenisA = receivesDenis*12 ;
     System.out.println(" Годовой доход Дениса после повышения "+annualIncomeDenisA);
     float annualIncomeDenisB = salaryDenis*12;
     System.out.println("Годовой доход до повышения зарплаты Дениса "+ annualIncomeDenisB );
     float annualIncomeicreasedDenis = annualIncomeDenisA-annualIncomeDenisB;
     System.out.println("Разница  после увеличения зарплаты Дениса "+annualIncomeicreasedDenis );
     System.out.println(" Денис теперь получает " +receivesDenis  + " Годовой доход вырос на  " + annualIncomeicreasedDenis + " рублей " );

     int salaryKristina = 76230;
     System.out.println(" Зарплата Кристины "+salaryKristina );
     float salaryIncreaseKristina= salaryKristina*0.1f;
     System.out.println(" Повышение зарплаты кристины на десять процентов "+salaryIncreaseKristina);
     float receivesKristina = salaryKristina+salaryIncreaseKristina;
     System.out.println(" Текущая зарплата Кристины "+receivesKristina);
     float annualIncomeKristinaA = receivesKristina*12;
     System.out.println("Годовой доход Кристины после повышения зарплаты "+annualIncomeKristinaA);
     float annualIncomeKristinaB = salaryKristina*12;
     System.out.println("Годовой бюджет Кристины до повышения зарплаты "+annualIncomeKristinaB );
     float annualIncomeicreasedKristina = annualIncomeKristinaA-annualIncomeKristinaB;
     System.out.println(" Разница после увеличения зарплаты Кристины "+ annualIncomeicreasedKristina );
     System.out.println(" Кристина теперь получает "+receivesKristina+" Годовой бюджет вырос на "+annualIncomeicreasedKristina  );































    }
}