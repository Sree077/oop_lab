public class Exception {
    public static void main(String[] args) {
        try{
            int result = divide(10,0);
            System.out.println("Result = "+result);
        }
        catch(ArithmeticException e){
            System.err.println("Arithmetic error occured: "+e.getMessage());
        }
        finally{
            System.out.println("Program executed successfully");
        }
    }
    public static int divide(int dividend, int divisor) throws ArithmeticException{
        if (divisor==0){
            throw new ArithmeticException("Cannot divide with 0.");
        }
        return dividend/divisor;
    }
}
