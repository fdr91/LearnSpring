package com.springinaction.springidol;

import java.lang.reflect.Method;
import org.springframework.beans.factory.support.MethodReplacer;

/**
 * Created by Fedor on 10/2/2016.
 */
public class TigerReplacer implements MethodReplacer {
    @Override
    public Object reimplement(Object target, Method method, // Подмена
                              Object[] args) throws Throwable { // метода
        return "A ferocious tiger"; // Помещает тигра в ящик
    }
}
