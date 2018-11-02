public class Main {

    public static double Efforttotal;


    public static void main(String[] args) {
        calc(8, 3);
        calc(9, 3);
        calc(10, 3);
        calc(11, 3);
        calc(8, 4);
        calc(8, 5);
        calc(8, 6);
    }

    public static double Efforttotal() {
        Efforttotal = 100 + 50 + 20 + 360 + 80 + 160 + 500 + 240 + 40 + 40;

        return Efforttotal;
    }

    public static void calc(int engineers, int weeks) {
        int worktime = 25;
        var i = 1;
        while (i < 4) {
            worktime = worktime + 5;
            double div1 = (Efforttotal()/engineers);
            double div2 = (worktime*weeks);
            double capacity = (div1/div2) * 100;
            int capacity2 = (int) capacity;
            System.out.println("With " + engineers + " engineers working a " + weeks + " week sprint, for " + worktime + " hrs/wk, we would be at " + capacity2 + "% of capacity.");
            i++;
        }


    }
}
