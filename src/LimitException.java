public class LimitException extends Exception{

    public LimitException(String massage){
        super(massage);
    }
    private double remainingAmount;




    public double getRemainingAmount() {
        return remainingAmount;
    }
}


