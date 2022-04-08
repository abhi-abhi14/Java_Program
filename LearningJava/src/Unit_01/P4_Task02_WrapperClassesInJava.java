package Unit_01;
/*
 * The wrapper class in java provides the mechanism to convert primitive into object
 * why?
 * Because we want to use predefined methods of those objects;
 * -boolean data types ->Boolean obj ->obj.tostring();
 * 
 **/
public class P4_Task02_WrapperClassesInJava {

	public static void main(String[] args) {
		//converting int into integer;
		int a=20;
		String s=""+a+"";
		Integer i=Integer.valueOf(a);//converting int into integer explicitly
		Integer j=a;//autoboxing ,noe compiler will write Integer.valueof(a) internally
		System.out.println(a+" "+ i+""+j);
		System.out.println(i.toString());
		//a.toString() can not be done due to a is int not object
		//Autoboxing:convrting primitive int objects;
		byte b=10;
		Byte byteobj=b;
		System.out.println(byteobj);
		//unboxing:converting objects to primitives
		byte bytevalue=byteobj;
		System.out.println(bytevalue);
}
		

	}

