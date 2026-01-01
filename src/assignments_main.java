import java.util.Arrays;

public class assignments_main {

    public static void main(String[] args) {

            int[] myNumbers = {10, 20, 30, 40, 50};

            System.out.println("قبل التعديل: " + Arrays.toString(myNumbers));

            assignments.shiftRightInsert(myNumbers, 2, 100);
            System.out.println("بعد التعديل (إضافة 100 في الموقع 2): " + Arrays.toString(myNumbers));
        }
    }


