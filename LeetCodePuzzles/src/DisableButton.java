import java.util.Arrays;
import java.util.List;

public class DisableButton {

	public static boolean getButtonDisable(List<String> processList) {
		boolean disableButton=true;
		for(String status:processList) {
			if(status.equals("in_process"))
				disableButton=disableButton&&true;
			else
			disableButton=disableButton&&false;
		}
		return disableButton;
	}
	
 public static void main(String arg[]) {
	 
	 List<String> processList=Arrays.asList("in_process","process");
	 System.out.println(getButtonDisable(processList));
 }
}
