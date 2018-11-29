public class RecursionTowerOfHanoi {
    public static void main(String[] Args) {
        towerOfHanoi(4, 'A', 'C', 'B');
    }
    public static void towerOfHanoi(int n, char from, char to, char aux) {
        if (n == 1) {
            System.out.println(n + " " + from + " -> " + to);
            return;
        }
        towerOfHanoi(n - 1, from, aux, to);
        System.out.println(n + " " + from + " -> " + to);
        towerOfHanoi(n - 1, aux, to, from);
    }
}
