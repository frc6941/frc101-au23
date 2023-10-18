public class Main {
    public static void main(String[] args) {
        for (var a = 0; a <= 5; a++) {
            for (var b = 0; b <= 5; b++) {
                System.out.println(calculate("+", a, b));
            }
        }
    }

    public static int calculate(String symbol, int x, int y) {
        switch (symbol) {
            case "+":
                return x + y;
            case "-":
                return x - y;
            case "*":
                return x * y;
            case "/":
                return x / y;
        }

        return 0;
    }
}