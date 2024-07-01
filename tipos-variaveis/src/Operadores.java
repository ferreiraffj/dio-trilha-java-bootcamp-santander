public class Operadores {
    public static void main(String[] args) {
        String concatenacao = null;

        concatenacao = 1+1+"1"; // 21

        System.out.println(concatenacao);

        concatenacao = "1"+1+1; // 111

        System.out.println(concatenacao);

        concatenacao = "1"+(1+1); // 12

        boolean var = true;

        var = !var;

        System.out.println(var); // false

        var = !var;

        System.out.println(var); // true

        // operadores ternarios
        int a, b;
        a = 10;
        b = 20;

        String resultado = a==b ? "Iguais" : "Diferentes";
        System.out.println(resultado); // Diferentes
    }
}
