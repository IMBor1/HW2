public class Main {
    public static void main(String[] args) {
        // Задача № 1
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        //Задача № 2
         dog = dog + 4;
         cat = cat + 4;
         paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача № 3
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        // Задача № 4
        var friend = 19;
        System.out.println(friend);
        friend += 2;
        System.out.println(friend);
        friend /= 7;
        System.out.println(friend);
        // Задача № 5
        var frog = 3.5;
        System.out.println(frog);
        frog *= 10;
        System.out.println(frog);
        frog /= 3.5;
        System.out.println(frog);
        frog += 4;
        System.out.println(frog);
        // Задача № 6
        var boxer1Weight = 78.2;
        var boxer2Weight = 82.7;
        var allBoxersWeight = boxer1Weight + boxer2Weight;
        System.out.println("Масса двух боксеров " + allBoxersWeight + " кг");
        var differenceWeight = boxer2Weight - boxer1Weight;
        System.out.println("Разница в весе у боксеров " + differenceWeight + " кг");
        // Задача № 7
        differenceWeight = boxer2Weight - boxer1Weight;
        differenceWeight = boxer1Weight % boxer2Weight;
        // Задача № 8
        var allTime = 640;
        var workTimeWorker = 8;
        var workers = allTime / workTimeWorker;
        System.out.println("Всего работников в компании — " + workers + " человек");
        workers += 94;
        allTime = workers * workTimeWorker;
        System.out.println("Если в компании работает " + workers +
                " человека, то всего " + allTime + " часа работы может быть поделено между сотрудниками!");


     }
}