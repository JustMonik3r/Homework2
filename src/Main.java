// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        System.out.println();

        var friend = 19;
        System.out.println(friend);
        friend = friend * 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
        System.out.println();

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
        System.out.println();

        var firstBoxerWeight = 78.2;
        var secondBoxerWeight = 82.7;
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println(totalWeight);
        var weightDifference = secondBoxerWeight - firstBoxerWeight;
        System.out.println(weightDifference);
        weightDifference = secondBoxerWeight % firstBoxerWeight;
        System.out.println(weightDifference);
        System.out.println();

        var totalWorkingHours = 640;
        var workingHoursPerEmployee = 8;
        var numberOfEmployees = totalWorkingHours / workingHoursPerEmployee;
        System.out.println("Всего работников в компании - " + numberOfEmployees + " человек");
        numberOfEmployees = numberOfEmployees + 94;
        totalWorkingHours = workingHoursPerEmployee * numberOfEmployees;
        System.out.println("Если в компании работает " + numberOfEmployees + " человек, то всего " + totalWorkingHours + " часов работы может быть поделено между сотрудниками");
        System.out.println();

    }
}