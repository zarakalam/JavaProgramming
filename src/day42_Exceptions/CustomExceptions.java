package day42_Exceptions;

class FadyException extends RuntimeException{

    public FadyException(){
        super("time for a short break");
    }

    public FadyException(String message){
        super(message);
    }
}

class NoBreakException extends Exception{

}

public class CustomExceptions {

    public static void main(String[] args) {

        //throw new FadyException("Its time for lunch");

        try {
            throw new NoBreakException();
        } catch (NoBreakException e) {
            e.printStackTrace();
        }

    }

}
