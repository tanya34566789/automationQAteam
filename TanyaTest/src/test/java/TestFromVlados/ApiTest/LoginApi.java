package TestFromVlados.ApiTest;

public class LoginApi {
    public LoginApi() {
    }

    private String email;
    private String password;

    public LoginApi(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

}
