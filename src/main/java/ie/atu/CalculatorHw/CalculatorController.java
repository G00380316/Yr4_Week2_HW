package ie.atu.CalculatorHw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    @GetMapping("/calculate/{num1}/{num2}/{operation}")
    public String calculate(@PathVariable int num1, @PathVariable int num2, @PathVariable String operation){
        int answer = 0;

        if (operation.equals("add")){
            answer = num1 + num2; // http://localhost:8080/calculate?num1=20&num2=20&operation=add (RequestParam)
            // http://localhost:8080/calculate/20/20/add (PathVariable)
        }

        if (operation.equals("subtract")){
            answer = num1 - num2; // http://localhost:8080/calculate?num1=20&num2=10&operation=subtract (RequestParam)
            // http://localhost:8080/calculate/20/10/subtract (PathVariable)
        }

        if (operation.equals("multiply")){
            answer = num1 * num2; // http://localhost:8080/calculate?num1=20&num2=20&operation=multiply (RequestParam)
            // http://localhost:8080/calculate/20/20/multiply (PathVariable)
        }

        if (operation.equals("divide")){
            answer = num1 / num2; // http://localhost:8080/calculate?num1=20&num2=10&operation=subtract (RequestParam)
            // http://localhost:8080/calculate/20/10/divide (PathVariable)
        }

        String print = "\"operation\": " + "\""+ operation + "\", " + "\"total\": " + answer;

        return print;
    }

}
