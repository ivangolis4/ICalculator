public class Subtraction implements IOperator{
    private double FirstOperand;
        private double SecondOperand;
        private double Result;


    public Subtraction(double FirstOperand, double SecondOperand){
        this.FirstOperand = FirstOperand;
        this.SecondOperand = SecondOperand;

    }

    public void calculate(){
        Result = FirstOperand - SecondOperand;

    }

    public double GetResult(){
        return Result;
    }
    
}
