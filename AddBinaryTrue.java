import java.math.BigInteger;

class SolutionTrue {
    public String addBinary(String a, String b) {
        BigInteger bigIntegerA = new BigInteger(a, 2);
        BigInteger bigIntegerB = new BigInteger(b, 2);
        return bigIntegerA.add(bigIntegerB).toString(2);
    }
}
public class AddBinaryTrue {

}
