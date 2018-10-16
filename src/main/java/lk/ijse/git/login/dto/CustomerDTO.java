package lk.ijse.git.login.dto;

public class CustomerDTO {
    private String userName;
    private String customerName;
    private String contact;
    private String email;
    private String address;
    private String password;

    public CustomerDTO() {
    }

    public CustomerDTO(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public CustomerDTO(String userName, String customerName, String contact, String email, String address, String password) {
        this.userName = userName;
        this.customerName = customerName;
        this.contact = contact;
        this.email = email;
        this.address = address;
        this.password = password;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "CustomerDTO{" +
                "userName='" + userName + '\'' +
                ", customerName='" + customerName + '\'' +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
