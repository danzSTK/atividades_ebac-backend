package main.java.com.exercise.service.exception;

public class NotFoundException extends RuntimeException{
    private static final long serialVersionUID = 1L;
    public NotFoundException() {super("Not found.");}
}
