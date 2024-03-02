public class Main {
    public static void main(String[] args) {
        double x = 0.5;
        int n = 1;
        double an = (1 + 1.0/2);
        double sum = an;
        int iterations = 1;

        while (true) {
            n++;
            an = an * (1.0/n);
            sum += an * Math.pow(x, n);
            iterations++;

            if (Math.abs(an) < 0.0001) {
                break;
            }
        }

        System.out.println("Value of the function: " + sum);
        System.out.println("Number of iterations: " + iterations);
    }
}
