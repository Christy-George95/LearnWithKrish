class Application{
	public static void main(String args[]){
		Employee E1 = new Employee(10,101,"John","953425678V","Jaffna");
		Employee E2 = new Employee(10,101,"John","953425678V","Jaffna");
		Employee E3 = new Employee(20,201,"Sam","897654327V","Colombo");
		
		//E1.id = 10;
		//E1.code = 101;
		//E2.id = 10;
		//E2.code = 101;
		//E3.id = 20;
		//E3.code = 201;
		
		System.out.println(E1.id == E2.id);
		System.out.println(E1.id == E3.id);
		System.out.println(E1.code == E2.code);
		System.out.println(E1.code == E3.code);
		System.out.println(E1.equals(E2));
		System.out.println(E1.equals(E3));
		System.out.println(E1.hashCode());
		System.out.println(E2.hashCode());
		System.out.println(E3.hashCode());
		//System.out.println(E1 == E2);
		//System.out.println(E1.code == E2.code);
		//System.out.println((E1.code).equals(E2.code));
		
	}
}