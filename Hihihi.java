public class Hihihi {
    public static void main(String[] args) {
        System.out.println("Всего аргументов в командной строке: "
                 + args.length);
        for (int i = 0; i < args.length; i++) {
            System.out.println("Привет " + args[i] + "!");
        }
}
