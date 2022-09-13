public class Quersumme_3 {
    public static void main(String[] args) {
            int anzahlQuersummen = 0;
            int temp = 1000;
            while (0 != temp) {
                anzahlQuersummen = anzahlQuersummen + 1;
                temp = temp / 10;
            }
            int[] quersummen = new int[anzahlQuersummen * 9];
            for (int i = 0; i <= 1000; i++) {
                int num3 = i;
                int crossnum = 0;
                while (num3>0){
                    crossnum += num3%10;
                    num3 /= 10;

                }
                quersummen[crossnum] = quersummen[crossnum] + 1;
            }

    }
}
