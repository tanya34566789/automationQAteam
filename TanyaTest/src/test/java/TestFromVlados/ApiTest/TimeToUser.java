package TestFromVlados.ApiTest;

public class TimeToUser {
    private String name;
    private String job;
    private String updateAt;

    public TimeToUser(String name, String job, String updateAt) {
        this.name = name;
        this.job = job;
        this.updateAt = updateAt;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public String getUpdateAt() {
        return updateAt;
    }

    public TimeToUser() {
    }
}
