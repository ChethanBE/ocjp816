To represent not-null we are using Optional
import java.util.*;
public class Mains1{
	public static void main(String args[]){
	
	Optional<String> value=createValue();
	String str=value.orElse("Duke");
	System.out.println(str);
	}
	
	static Optional<String> createValue(){
		String s=null;
		return Optional.ofNullable(s);
	}
}