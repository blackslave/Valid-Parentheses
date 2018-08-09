/**
 * 利用堆疊集合做記錄，遇到左括號就push進堆疊，遇到右括號就pop出來比對是否正確。
 */
import java.util.Stack;
public class Solution 
{
	public boolean isValid(String s) {
		boolean result = true;
		if(s.length()==0 || s.length()%2!=0) result=false;
		else
		{
			Stack <Character> stk = new Stack <Character>();
			for(int i=0;i<s.length();i++)
			{
				char c = s.charAt(i);
				switch(c)
				{
					case '(':
					case '{':
					case '[':
						stk.push(c);
						if(i==s.length()-1) result= false;
						break;
					case ')':
						if(stk.empty()) result= false;
						else
						if(stk.pop()!='(') result=false;
						break;
					case '}':	
						if(stk.empty()) result= false;
						else
						if(stk.pop()!='{') result=false;
						break;
					case ']':
						if(stk.empty()) result= false;
						else
						if(stk.pop()!='[') result=false;
						break;
				}
			}	
		}
	return result;
    }
}

