package pl.testExam2;

public class BaseEntity {
    protected long id;

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }

    public BaseEntity(long id) {
        this.id = id;
    }

    public BaseEntity() {
    }
}
