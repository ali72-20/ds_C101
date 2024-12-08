public class CustomException {

    private CustomException(){}

    static public void RuntimeException(String message){
        throw new RuntimeException(message);
    }

    static public void OutOfBoundException(String message){
        throw new ArrayIndexOutOfBoundsException(message);
    }

}
