package item27;

import java.util.Arrays;
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
	
	//adding local vairiavble to reduce scope of @SuppressWarnings
	public <T> T[] toArray(T[] a, T[] elements) {
		int size = 5;
		if(a.length < size) {
			//this cast is correct beacuse the array we're createing 
			//is of the same type as the one passded in,which is T[]
			@SuppressWarnings("unchecked") T[] result = 
					(T[]) Arrays.copyOf(elements,size,a.getClass());
			return result;
		}
		System.arraycopy(elements, 0, a, 0, size);;
		if(a.length > size)
			a[size] = null;
		return a;
	
	
	}
			
	

}
