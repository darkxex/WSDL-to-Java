package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.test.*;
@SpringBootApplication
public class TareaFinalApplication {

	public static void main(String[] args) {
		SpringApplication.run(TareaFinalApplication.class, args);
		CalculatorSoap Operator = new Calculator().getCalculatorSoap();
	System.out.println(Operator.add(2, 2));
	}

}
