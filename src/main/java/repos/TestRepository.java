package repos;

import org.springframework.data.jpa.repository.JpaRepository;
import project_se.Test;

import java.time.LocalDateTime;
import java.util.List;

public interface TestRepository extends JpaRepository<Test, Long> {
    List<Test> findTestByID(Long id);
}
