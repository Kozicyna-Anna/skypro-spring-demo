package pro.sky.skyprospringdemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


RequestMapping("/calculator");
RestController
public class CalculatorController {
    private final CalculatorService calculatorService;
    public CalculatorController(CalculatorService calculatorService) {
        this.calculatorService = calculatorService;
    }
    GetMapping
    public String hello() {
        return "Добро пожаловать в калькулятор";
    }
    GetMapping("/plus")
    public String plus(RequestParam(name = "a")int num1,RequestParam(name = "b") int num2) {
        var result = calculatorService.plus(num1, num2);
        return num1 + " + " + num2 + " = " + result;
    }
    GetMapping("/minus")
    public String minus(RequestParam int num1, RequestParam int num2) {
        var result = calculatorService.minus(num1, num2);
        return num1 + " - " + num2 + " = " + result;
    }
    GetMapping("/divide")
    public String divide(RequestParam int num1, RequestParam int num2) {
        var result = calculatorService.divide(num1, num2);
        if (num2 == 0) {
            return "На ноль делить нельзя!";
        }
        return num1 + " / " + num2 + " = " + result;
    }
    GetMapping("/multiply")
    public String multiply(RequestParam int num1, RequestParam int num2) {
        var result = calculatorService.multiply(num1, num2);
        return num1 + " * " + num2 + " = " + result;
    }
}
