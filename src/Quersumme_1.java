public class Quersumme_1 {
    public static void main(String[] args) {


        for (int i = 0; i <= 1000; i++) {
            int num3 = i;
            int crossnum = 0;
            while (num3>0){
                crossnum += num3%10;
                num3 /= 10;

            }
            if (crossnum ==15)
                System.out.println("Zahl " + i + " summe " + crossnum);
        }
    }
}


