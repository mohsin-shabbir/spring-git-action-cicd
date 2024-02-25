package controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    /*echo "# spring-git-action-cicd" >> README.md
    git init
    git add README.md
    git commit -m "first commit"
    git branch -M main
    git remote add origin https://github.com/mohsin-shabbir/spring-git-action-cicd.git
    git push -u origin main*/
    @GetMapping("welcome")
    public String  welcome()
    {
        return "Here! Welcome to the CICD Pipeline using Git Action.";
    }
}
