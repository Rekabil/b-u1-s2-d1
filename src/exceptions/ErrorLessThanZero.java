package src.exceptions;

public class ErrorLessThanZero extends Exception{
    public ErrorLessThanZero(int number) {
        super("Il numero inserito: " + number + " , e minore di 0");
    }
}
