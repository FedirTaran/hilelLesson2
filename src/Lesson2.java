public class Lesson2 {

    public static void main(String[] args) {

        // -128 do 127
        byte byteValue = 127;

        // - 32768 to 32767
        short shortValue = 32767;

        int intValue = 123;

        long longValue = 10;

        long longValue01 = 10L; //bez konvertacii cherez INT

        float floatValue = 12.5f;

        double doubleValue = 12.6;

        char charValue = 15;

        char charValue01 = '#';

        boolean booleanValue = true;

        int testIntValue = byteValue;

        byteValue = (byte) intValue;

        int testIntValue01 = 129;

        byte byteValue01 = (byte) testIntValue01;

        //testIntValue01 = (byte) 12;

        // класи обгортки

        Integer integer = Integer.valueOf(2);

        Integer Integer01 = Integer.valueOf("1243");

        //System.out.println(Double.MAX_VALUE); // max znachenia

       Double aDouble = Double.valueOf(17.6);

       String text = "text";

        System.out.println(testIntValue01);

        System.out.println(charValue);

        System.out.println(floatValue);

        System.out.println(booleanValue);

    }

        public void testMethod() {
        int someValue = 5;

        Double aDouble = Double.valueOf("127.5");

        System.out.println(aDouble);

    }

}