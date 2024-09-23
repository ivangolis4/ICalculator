public class Division implements IOperator{
    private double FirstOperand;
        private double SecondOperand;
        private double Result;


    public Division(double FirstOperand, double SecondOperand){
        this.FirstOperand = FirstOperand;
        this.SecondOperand = SecondOperand;

    }

    public void calculate(){
        Result = FirstOperand / SecondOperand;

    }

    public double GetResult(){
        return Result;
    }
    
}
