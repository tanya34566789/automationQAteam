package TestFromVlados;

public class SuccesReg extends RegisterApi {
    public Integer id;
    public String token;

    public SuccesReg(Integer id, String token) {
        this.id = id;
        this.token = token;
    }

    public Integer getId() {
        return id;
    }

    public String getToken() {
        return token;
    }

    public SuccesReg() {
    }
}
