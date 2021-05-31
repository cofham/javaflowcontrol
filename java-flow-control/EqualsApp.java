
public class EqualsApp {
	public static void main(String[] args) {
		String o1 = "java";
		String o2 = new String("java");
		
		System.out.println(o1 == o2);	//false
		
		String o3 = "java";
		
		System.out.println(o1 == o3);	//true
		
//		primitive 원시 , 더이상 쪼갤수 없는 데이터 (int,double,float,long,char)
//		
//		non primitive	string,file,data,class
//		
//		== -> 같은 위치를 가리키고 있는지 (원시 데이터)
//		equals -> 내용이 같은지 (원시 아닌)
//		
//		그러나 String은 예외
//		
//		
	}
}
