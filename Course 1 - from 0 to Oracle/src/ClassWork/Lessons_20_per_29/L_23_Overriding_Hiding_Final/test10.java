package ClassWork.Lessons_20_per_29.L_23_Overriding_Hiding_Final;

public class test10 {
}

class animal {
     String showName() {
        return "some animal";
    }

    void showInfoAboutAnimal() {
        System.out.println("Name of animal: " + showName());
    }
}

class mouse extends animal {
     String showName() {
        return "Jerry";
    }

    void showInfoAboutMouse() {
        System.out.println("Name of mouse: " + showName());
    }

    public static void main(String[] args) {
        mouse a = new mouse();
        a.showInfoAboutAnimal();
        a.showInfoAboutMouse();
    }
}