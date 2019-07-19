package two;


public class User {

	public User() {
		
	}
    private String name;
	
	private Integer age;
	
	private String sex;

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public User(String name, Integer age, String sex) {
		super();
		this.name = name;
		this.age = age;
		this.sex = sex;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", age=" + age + ", sex=" + sex + "]";
	}
	 public boolean equals(Object anObject) {
	        if (this == anObject) {
	            return true;
	        }
	        if (anObject instanceof User) {
	        	User u=(User)anObject;
	            if(u.getName().equals(this.name)&&u.getSex().equals(this.sex)&&u.getAge()==this.age) {
	            return true;	
	            }
	        }  
	        return false;
	    }
	
}
