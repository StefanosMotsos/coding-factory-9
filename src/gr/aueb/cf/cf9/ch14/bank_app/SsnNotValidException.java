package gr.aueb.cf.cf9.ch14.bank_app;

public class SsnNotValidException extends RuntimeException {
    public SsnNotValidException(String message) {
        super(message);
    }
}
