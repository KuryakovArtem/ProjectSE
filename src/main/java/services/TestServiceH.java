package services;

import org.springframework.stereotype.Service;
import project_se.Test;

@Service
public class TestServiceH implements TestService{

    @Override
    public Test getTest(Long test_id) {
        Test test = new Test();
        test.setTest_id(test_id);
        return test;
    }


}
