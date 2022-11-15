package TestFromVlados;

public class RegisterApi {
    private String email;
    private String password;

    public RegisterApi(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public RegisterApi() {

    }
}
