package User;

public class UserBuilder 
{
    //private String firstName;
	//private String lastName;
    //private int age;
    //private String phone;
    //private String address;
    
    private User user;

    public UserBuilder(String firstName, String lastName) {
        user = new User(firstName, lastName);
    }
    public UserBuilder age(int age) {
        user.setAge(age);
        return this;
    }
    public UserBuilder phone(String phone) {
        user.setPhone(phone);
        return this;
    }
    public UserBuilder address(String address) {
        user.setAddress(address);
        return this;
    }
    //Return the finally consrcuted User object
    public User build() {
        return user;
    }
    
	
	// Test
	
	public static void main(String[] args) {
	    User user1 = new UserBuilder("Lokesh", "Gupta")
	    .age(30)
	    .phone("1234567")
	    .address("Fake address 1234")
	    .build();
	 
	    System.out.println(user1);
	 
	    User user2 = new UserBuilder("Jack", "Reacher")
	    .age(40)
	    .phone("5655")
	    //no address
	    .build();
	 
	    System.out.println(user2);
	 
	    User user3 = new UserBuilder("Super", "Man")
	    //No age
	    //No phone
	    //no address
	    .build();
	 
	    System.out.println(user3);
	}
	
	
}
