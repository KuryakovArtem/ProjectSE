package controllers;


import DataBaseSheet.TestTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import project_se.Test;
import services.TestServiceH;

import java.util.List;

@Controller
public class TestController {
    TestServiceH testService;

    @Autowired
    private TestTable testTable;

    @PostMapping("/create_test")
    @ResponseStatus(HttpStatus.CREATED)
    public void writeTest(@RequestBody Test request){//добавление нового теста
        testTable.addTest(request.getTest_id(), request.getTitle(), request.getStartAt(), request.getEndAt());
    }

//    @GetMapping("{testID}/hu") //НУЖЕН контроллер для узер ответов
//    public List<Test> getQuestion(
//            @PathVariable("test_id") int testID,
//            @PathVariable("quest_id") int questID,
//            @PathVariable("userNickName") String userNickName)
//    {
//        return testTable.;
//    }

    @RequestMapping(method = RequestMethod.GET,value="/test")
    public String getTest()
    {
        System.out.println();
        return "group-add";
    }

//    @GetMapping("{testID}/hui")
//    public Test getTest()
//    {
//
//
//        return ;
//    }

//    @PostMapping(value = "", consumes = "application/json",produces = "application/json")
//    public Test testTime(@PathVariable("test_id") int testID )
//    {
//        return testService.;
//    }


}
