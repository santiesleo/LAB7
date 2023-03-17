package exceptions;

public class NegativeWeightException extends RuntimeException{

    public NegativeWeightException(){
        super("No se pueden usar números negativos");
    }

}
