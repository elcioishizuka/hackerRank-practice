package thirtyDaysOfCode.day16.exceptionsPractice;

import thirtyDaysOfCode.day16.exceptionsPractice.exceptions.ValueGreaterThanTenException;

public class ExceptionsPractice {
    public static void main(String[] args) {

        try{
            int[] c = new int[6];
            c[5] = 11;
            for (int value: c) {
                if(value > 10){
                    throw new ValueGreaterThanTenException();
                }
            }
            System.out.println("Element 6 at index 5 = " + c[5]);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("Exception thrown: " + e);
        } catch (ValueGreaterThanTenException e){
            System.err.println("Exception thrown: " + e);
        } finally {
            System.out.println("Finnaly clause");
        }


    }
}
