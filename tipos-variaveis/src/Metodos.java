public class Metodos {
    public static void main(String[] args) {
        int result = somarDoisNumeros(5, 10);
        System.out.println(result);

        double resultDivisao = divisor(5, 2);
        System.out.println(resultDivisao);
    }

    public static int somarDoisNumeros(int a, int b) {
        return a + b;
    }

    public static double divisor(int a, int b) throws ArithmeticException {
        if (b == 0) {
            throw new ArithmeticException("Divisão por zero não é possível, por favor insira um valor válido");
        }
        return a / b;
    }
}
