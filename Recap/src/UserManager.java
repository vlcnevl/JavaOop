
public class UserManager {
	public void add(User user)
	{
		System.out.println("Added user" + user.getEmail());
	}
	public void delete(User user)
	{
		System.out.println("Deleted user"+user.getEmail());
	}
	public void update(User user)
	{
		System.out.println("Updated user"+user.getEmail());
	}
	public void login(User user)
	{
		System.out.println("Login user"+user.getEmail());
	}
	public void logout(User user)
	{
		System.out.println("Logout user"+user.getEmail());
	}
	public void getAll(User user)
	{
		System.out.println("Get all user");
	}
}
