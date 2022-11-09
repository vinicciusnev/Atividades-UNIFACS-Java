public class App {
    public static void main(String[] args) throws Exception {
        double paisA = 8000;
        double paisB = 200000;
        double ano = 0;

        while ( paisA <= paisB ) {
            paisA += paisA * 0.03;
            paisB += paisB * 0.015;
            ano += 1;
        }
        System.out.format("O pais A ultrapassa ou iguala ao Pais B em %.0f anos ! ", ano);
    }
}
