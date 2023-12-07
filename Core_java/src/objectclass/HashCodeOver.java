package objectclass;

public class HashCodeOver {
	int id;
	String name;
  	HashCodeOver(int id, String name)
	{
		this.id= id;
		this.name= name;
			}
	public static void main(String[] args) {
		HashCodeOver ref = new HashCodeOver(120,"krishna");
		System.out.println(ref);
		int hashcode1 = ref.hashCode();
		System.out.println(hashcode1);
	} 

}
