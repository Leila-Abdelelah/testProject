import java.util.List;

public class Person {
    private String name;
    private int age;
    private String email;
    private boolean isMarried;
    private List<String> skills;
    private Address address;

    // Getters and Setters
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public boolean isMarried() { return isMarried; }
    public void setMarried(boolean isMarried) { this.isMarried = isMarried; }

    public List<String> getSkills() { return skills; }
    public void setSkills(List<String> skills) { this.skills = skills; }

    public Address getAddress() { return address; }
    public void setAddress(Address address) { this.address = address; }
}
