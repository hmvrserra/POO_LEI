public class Main {
    public static void main(String[] args) {
        Time t1 = new Time(5, 30);
        System.out.println("Tempo 1:" + t1);

        Time t2 = new Time("2:45");
        System.out.println("Tempo 2:" + t2);

        Time t3 = t1.add(t2);
        System.out.println("Tempo 1 + Tempo 2: " + t3);

        Time t4 = t1.subtract(t2);
        System.out.println("Tempo 1 - Tempo 2: " + t4);

        System.out.println("Tempo 1 é maior que Tempo 2? " + t1.isGreaterThan(t2));
        System.out.println("Tempo 1 é menor que Tempo 2? " + t1.isLessThan(t2));
    }
}