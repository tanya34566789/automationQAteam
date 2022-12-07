package TestFromVlados.ApiTest;

public class LoginSucces extends LoginApi {

    public String token;

    public LoginSucces(String token) {
        this.token = token;
    }

    public String getLoginToken() {
        return token;
    }

    public LoginSucces() {

    }
}