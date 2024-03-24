public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        System.out.println("собака " + dog);
        var cat = 3.6;
        System.out.println("кошка " + cat);
        var paper = 763789;
        System.out.println("бумага " + paper);

        dog = dog + 4;
        System.out.println("собак добавилось " + dog);
        cat = cat + 4;
        System.out.println("кошек добавилось " + cat);
        paper = paper + 4;
        System.out.println("бумаги добавилось " + paper);

        dog = dog - 3.5;
        System.out.println("собак убавилось " + dog);
        cat = cat - 1.6;
        System.out.println("кошек убавилось " + cat);
        paper = paper - 7639;
        System.out.println("бумаги убавилось " + paper);

        var friend = 19;
        System.out.println("Друзья " + friend);
        friend = friend + 2;
        System.out.println("Друзья пришли " + friend);
        friend = friend / 7;
        System.out.println("Друзья поделились на семерки " + friend);

        var frog = 3.5;
        System.out.println("Лягушки " + frog);
        frog = frog * 10;
        System.out.println("больше лягушек " + frog);
        frog = frog / 3.5;
        System.out.println("меньше лягушек " + frog);
        frog = frog + 4;
        System.out.println("снова больше лягушек " + frog);

        var oneBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var allBoxerWeight = oneBoxerWeight + secondBoxerWeight;
        System.out.println("общий вес боксеров " + allBoxerWeight);
        var differeceBoxerWeight = oneBoxerWeight - secondBoxerWeight;
        System.out.println("разница в весе " + differeceBoxerWeight);

        //так как разница в весе отрицательная то второй боксер весит больше первого,
        //поэтому составляем перменную ниже
        var endDifferenceWeight = (secondBoxerWeight - oneBoxerWeight) % allBoxerWeight;
        System.out.println("остаток деления " + endDifferenceWeight);

        var allWorkHours = 640;
        var oneWorkerHours = 8;
        var totalWorkerInCompany = allWorkHours / oneWorkerHours;
        System.out.println("всего работников в компании - " + totalWorkerInCompany + " человек");
        totalWorkerInCompany = totalWorkerInCompany + 94;
        oneWorkerHours = allWorkHours / totalWorkerInCompany;
        System.out.println("если в компании работает " + totalWorkerInCompany + " человека, то всего " +
                oneWorkerHours + " часа работы может бытьть поделено между сотрудниками");



    }
}