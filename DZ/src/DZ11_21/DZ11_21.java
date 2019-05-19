package DZ11_21;

public class DZ11_21 {
    public static void main(String[] args) {
        String str1 = " ";
        StringBuilder str2 = new StringBuilder(" ");
        StringBuffer str3 = new StringBuffer(" ");

        double time1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str1 += "s";
        }

        double time2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str2.append("s");
        }

        double time3 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            str3.append("s");
        }

        double time4 = System.currentTimeMillis();


        System.out.println("String time=" + (time2 - time1));
        System.out.println("StringBuilder time=" + (time3 - time2));
        System.out.println("StringBuffer time=" + (time4 - time3));
    }
}
