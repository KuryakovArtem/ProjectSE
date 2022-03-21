package project_se;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

public class Test {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long test_id;
    private String title;
    private LocalDateTime startAt;
    private LocalDateTime endAt;

    public Test() {
    }

    public Test(Long test_id, String title, LocalDateTime startAt, LocalDateTime endAt) {
        this.test_id = test_id;
        this.title = title;
        this.startAt = startAt;
        this.endAt = endAt;
    }

    public Long getTest_id() {
        return test_id;
    }

    public void setTest_id(Long test_id) {
        this.test_id = test_id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getStartAt() {
        return startAt;
    }

    public void setStartAt(LocalDateTime startAt) {
        this.startAt = startAt;
    }

    public LocalDateTime getEndAt() {
        return endAt;
    }

    public void setEndAt(LocalDateTime endAt) {
        this.endAt = endAt;
    }
}
