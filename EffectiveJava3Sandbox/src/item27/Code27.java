package item27;

import java.util.HashSet;
import java.util.Set;

public class Code27 {
	
	//以下のコードは警告を複数発生させる。
	Set<String> exaltation = new HashSet();

	//Multiple markers at this line
	//- Type safety: The expression of type HashSet needs unchecked 
	// conversion to conform to Set<String>
	//- HashSet is a raw type. References to generic type HashSet<E> should 
	// be parameterized
	
	//diamond operator(<>)により警告を消す
	{
		Set<String> exaltation = new HashSet();
	}
		
	//diamond operator(<>)により警告を消す
	{
		Set<String> exaltation = new HashSet<>();
	}
	
	//警告：Type safety: Unchecked cast from Object to T
	public <T> T sample1(T a,Object b) {
		return (T) b;	
	}
	@SuppressWarnings("unchecked")
	public <T> T sample2(T a,Object b) {
		return (T) b;
		
	}
			
	

}
