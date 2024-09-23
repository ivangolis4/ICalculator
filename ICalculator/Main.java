public class Main{

    public static void main(String[]args){
        SampleCalculastor sc = new SampleCalculastor();
        IOperator add = new Addition(100,50);
        IOperator sub = new Subtraction(100,50);
        IOperator mul = new Multiplication(100,50);
        IOperator div = new Division(100,50);

        sc.calculate(add);
        sc.calculate(sub);
        sc.calculate(mul);
        sc.calculate(div);
        System.out.println(add.GetResult());
        System.out.println(sub.GetResult());
        System.out.println(mul.GetResult());
        System.out.println(div.GetResult());
        
    }
}