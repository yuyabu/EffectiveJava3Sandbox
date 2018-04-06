package item7;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class Code7 {
	Map<String, String> studentList;
	Map<String, String> blackList;
	public Code7(Map<String, String> studentList, Map<String, String> blackList) {
		super();
		this.studentList = studentList;
		this.blackList = blackList;
	}
	public void registBlackList(String key) {
		if (studentList.containsKey(key)){
			blackList.put(key,studentList.get(key)); 
		}
	}
	public String toString() {
		return new StringBuilder()
				.append("studentList=").append(studentList.toString())
				.append("blackList=").append(blackList.toString()).toString();
	}
	
}
