
public class String2Int {

	public int returnInt(String str) {
		int result=0,i=0,temp=0;
		int length=str.length();
		while(i<length && (str.charAt(i)>='0' && str.charAt(i)<=9)) {
			temp=str.charAt(i)-'0';
			System.out.println("temp: "+temp);
			result=result*10+temp;
		}
		
		return result;
	}
	
	public static void main(String arg[]) {
		
		String2Int obj = new String2Int();
		System.out.println(obj.returnInt("43"));
	}
}
