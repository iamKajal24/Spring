package com.springcore.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
    public static void main(String[] args) {
        // Load Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/spel/Config.xml");

        // Get the bean
        Demo demo1 = context.getBean("demo", Demo.class);
        System.out.println(demo1);

        // SpEL expression evaluation
        SpelExpressionParser temp = new SpelExpressionParser();
        Expression expression = temp.parseExpression("22 + 44");
        System.out.println(expression.getValue());
    }
}
