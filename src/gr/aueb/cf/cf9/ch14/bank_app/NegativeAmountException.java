package gr.aueb.cf.cf9.ch14.bank_app;

public class NegativeAmountException extends RuntimeException {
    public NegativeAmountException(String message) {
        super(message);
    }
}
