package thirtyDaysOfCode.day16.exceptionsPractice.exceptions;

public class ValueGreaterThanTenException extends Exception{

    public ValueGreaterThanTenException(){
        super("Value should be less than 10");
    }

}
