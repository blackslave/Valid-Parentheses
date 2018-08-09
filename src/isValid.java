/**
 * 給一個只包含'(', ')', '{', '}', '[' , ']'這些括號字元的字串，判斷這些括號是不是合法的。
 * 右括號必須依照正確的順序出現，"()" 與 "()[]{}" 都是合法的，但"(]" 和 "([)]"就不是。
 * @author black
 *
 */
public class isValid
{
	public static void main(String[] args)
	{
		 Solution Solution = new Solution();
		 String a = "()[]";
 		 boolean i = Solution.isValid(a);
		 System.out.println(i);
	}
}
