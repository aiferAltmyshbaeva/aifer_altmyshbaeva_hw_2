import java.util.Random;

public class Main {
    public static void main(String[] args) {
        String decision = makeDecisionOnAgeAndTemperature(30, 10);
        System.out.println("Решение: " + decision);

        decision = makeDecisionOnAgeAndTemperature(30, 60);
        System.out.println("Решение: " + decision);

        decision = makeDecisionOnAgeAndTemperature(10, 15);
        System.out.println("Решение: " + decision);

        decision = makeDecisionOnAgeAndTemperature(55, -2);
        System.out.println("Решение: " + decision);

        decision = makeDecisionOnAgeAndTemperature(45, 25);
        System.out.println("Решение: " + decision);

        int generatedAge = generateRandomAge();
        decision = makeDecisionOnAgeAndTemperature(generatedAge, 30);
        System.out.println("Для возраста: " + generatedAge + " решение: " + decision);

    }

    public static String makeDecisionOnAgeAndTemperature(int age, int temperature) {
        if (isComfortTemperatureForPromenad(age, temperature)) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    private static boolean isComfortTemperatureForPromenad(int age, int temperature) {
        return isMiddleAge(age, temperature) || isYoungAge(age, temperature) || isSeniorAge(age, temperature);
    }

    private static boolean isSeniorAge(int age, int temperature) {
        return age > 45 && (temperature >= -10 && temperature <= 25);
    }

    private static boolean isYoungAge(int age, int temperature) {
        return age < 20 && (temperature >= 0 && temperature <= 28);
    }

    private static boolean isMiddleAge(int age, int temperature) {
        return (age >= 20 && age <= 45) && (temperature >= -20 && temperature <= 30);
    }

    public static int generateRandomAge(){
        return new Random().nextInt(100);
    }
}