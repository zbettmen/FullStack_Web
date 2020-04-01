package ec.utb.WebLibraryProject.exception;

//Author: Benjamin Boson
public class AppResourceNotFoundException extends RuntimeException {
    public AppResourceNotFoundException(String message) {
        super(message);
    }
}
