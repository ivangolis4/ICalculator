import java.security.InvalidParameterException;
public class SampleCalculastor implements ICalculator{

    @Override
    public void calculate(IOperator Operator){
        if(Operator == null){
            throw new InvalidParameterException("Invalid operation requested");
        }
        Operator.calculate();
    }

}