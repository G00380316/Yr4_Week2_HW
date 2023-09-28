package ie.atu.CalculatorHw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/calculate")
    public int calculate(@RequestParam int num1,@RequestParam int num2, @RequestParam String operation){
        int answer = 0;

        if (operation.equals("add")){
            answer = num1 + num2; // http://localhost:8080/calculate?num1=20&num2=20&operation=add
        }

        if (operation.equals("subtract")){
            answer = num1 - num2; // http://localhost:8080/calculate?num1=20&num2=10&operation=subtract
        }

        if (operation.equals("multiply")){
            answer = num1 * num2; // http://localhost:8080/calculate?num1=20&num2=20&operation=multiply
        }

        if (operation.equals("divide")){
            answer = num1 / num2; // http://localhost:8080/calculate?num1=20&num2=10&operation=subtract
        }

        return answer;
    }

}
