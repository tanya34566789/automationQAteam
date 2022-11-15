package TestFromVlados;

public class UserTimeResponse extends UserTime {
    private String updateAt;

    public UserTimeResponse(String updateAt) {
        this.updateAt = updateAt;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public UserTimeResponse() {
    }
}
