package assessment.infnet.actions.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class testController {
//Trigger actions
    @GetMapping
    public ResponseEntity<String> test() {
        return ResponseEntity.ok("Teste");
    }

}
