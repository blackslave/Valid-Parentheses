/**
 * ��������'(', ')', '{', '}', '[' , ']'�������j�����I�����C���Д������j���s�����@�I�B
 * �E���j�K�{�ˏƐ��m�I�����o���C"()" �o "()[]{}" �s�����@�I�C�A"(]" �a "([)]"�A�s���B
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
