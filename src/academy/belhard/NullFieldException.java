package academy.belhard;

public class NullFieldException extends RuntimeException{
    public NullFieldException() {    }

    public NullFieldException(String message) {
        super("Заполните все поля");
    }


}
