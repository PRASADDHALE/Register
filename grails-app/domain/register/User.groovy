package register

class User 
{

	String name;
	String address;
	String designation;
	String email;
	Date date;
	static constraints = {
		name(blank:false)
		address(maxSize:1000,nullable:true)
		designation(blank:false)
		email(nullable:true)
		date()
	}
}
