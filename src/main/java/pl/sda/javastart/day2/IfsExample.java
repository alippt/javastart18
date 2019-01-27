package pl.sda.javastart.day2;

public class IfsExample {
    public static void main(String[] args) {
        System.out.println(isEven(42));
        System.out.println(dividableByThreeAndFive(16));
        System.out.println(introduce(" Michal ", 30, true));

        System.out.println(answerCell(true, true, false));
    }

    public static boolean isEven(int number) {
        if (number % 2 == 0) {
            return true;
        } else { //w tym miejscu else jest opcjonalny
            return false;
        }
    }

    public static boolean dividableByThreeAndFive(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return true;
        }
        return false;
    }

    public static String introduce(String name, int age, boolean male) {
        String gender;
        if (male) {
            gender = " mezczyzna";
        } else {
            gender = " kobieta";
        }
        String result = "Czesc, jestem " + name +
                " i mam " + age + " lat i jestem " + gender;
        return result;
    }

    public static boolean threeParamsSum(int a, int b, int c) { //todo zrobic druga wersje z jednym ifem
        if (a + b == c) {
            return true;
        } else if (a + c == b) {
            return true;
        } else if (b + c == a) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean answerCell(boolean mum, boolean isMorning, boolean isAsleep) {
        if (isAsleep) {
            return false;
        }
        if (isMorning && !mum) {
            return false;
        }
        return true;
    }
}
