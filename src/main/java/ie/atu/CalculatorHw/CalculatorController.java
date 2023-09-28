package ie.atu.CalculatorHw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/calculate")
    public int calculate(@RequestParam int num1,@RequestParam int num2){
        int answer =num1 + num2;
        return answer;
    }
}
