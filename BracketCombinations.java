import java.math.BigInteger;

public class BracketCombinations {

    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static int bracketCombinations(int num) {
        BigInteger fact2n = factorial(2 * num);
        BigInteger factn = factorial(num);
        BigInteger factnPlus1 = factorial(num + 1);
        
        BigInteger catalanNumber = fact2n.divide(factnPlus1.multiply(factn));
        
        return catalanNumber.intValue();
    }

    public static void main(String[] args) {
        int num = 3; 
        System.out.println(bracketCombinations(num)); 
    }
}
