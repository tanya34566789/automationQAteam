package TestFromVlados.ApiTest;

import java.util.Date;

public class CreateUserData extends CreateUser {

    private String name;
    private String job;
    private Integer id;
    private Date createdAt;

    public CreateUserData(String name, String job, Integer id, Date createdAt) {
        super(name, job);
        this.id = id;
        this.createdAt = createdAt;
    }

    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public Integer getId() {
        return id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}
