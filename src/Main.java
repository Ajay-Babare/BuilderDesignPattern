
public class Main {

	public static void main(String[] args) {
		User user1 =  new User.UserBuilder().setUserId("1").setUserName("ajay").setEmailId("ajay@gmail.com").build();
		
		System.out.println(user1);
		
		User user2 = new User.UserBuilder().builder().setUserName("Ram").build();
		System.out.println(user2);
	}

}
