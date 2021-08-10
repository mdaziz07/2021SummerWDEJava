package basics.learnObjects;

public class BuildACar {

    public static void main(String[] args) {

        Toyota camry = new Toyota();
        Toyota prius = new Toyota();

        camry.model = "Camry";
        camry.year = 2020;
        camry.engine = "V6";
        camry.all_wheel_drive = 'Y';

        System.out.println("This car is " + camry.MANUFACTURER + " " + camry.model );
        System.out.println("Engine: " + camry.engine);
        System.out.println("All wheel drive: " + camry.all_wheel_drive);

    }

}
