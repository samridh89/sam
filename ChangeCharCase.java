public class ChangeCharCase {

	static char testcase1 = 'r';
	static char testcase2 = 'S';
	static char testcase3 = ':';
	
	public static void main(String args[]){
		ChangeCharCase testInstance = new ChangeCharCase();
		char result = testInstance.changeCase(testcase1);
		System.out.println(result);
	}
	
	//write your code here
	public char changeCase(char ch){
		int i=(int)ch;
		if(i>=65 && i<=91)
		{
			i=i+32;
		}
		else if(i>=97 && i<=122)
		{
			i=i-32;
		} 
		else 
			return ch;
		char x=(char)i;
		System.out.println(x);
		return x;
	}
	
}
