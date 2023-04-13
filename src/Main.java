public class Main {
    public static void main(String[] args) {
        String text = "Тестоваячастьзадания";
        int i = text.length() / 2;
        System.out.println("Первая половина: " + text.substring(0,i));
        System.out.println("Вторая половина: " + text.substring(i));
    }
}
