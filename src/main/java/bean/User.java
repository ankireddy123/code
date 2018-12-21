package bean;

public class User {
    public User(String name, String emailId, String address, String phoneNo, String salary) {
        this.name = name;
        this.emailId = emailId;
        this.address = address;
        this.phoneNo = phoneNo;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    private String name;
    private String emailId;
    private String address;
    private String phoneNo;
    private String salary;
}
