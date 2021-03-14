package academy.belhard;

public class NullFieldException extends RuntimeException{

    public NullFieldException(String message) {
        super("Заполните все поля");
    }


}
