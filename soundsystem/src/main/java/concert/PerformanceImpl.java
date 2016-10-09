package concert;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by Fedor on 10/8/2016.
 */
@Component
public class PerformanceImpl implements Performance {

    @Override
    public void perform() {
        System.out.println("Perform");
    }

    public static void main(String[] args) {
        ApplicationContext ctx =
                new AnnotationConfigApplicationContext(ConcertConfig.class);

        Performance performance = ctx.getBean(Performance.class);
        performance.perform();
        if (performance instanceof Encoreable) {
            ((Encoreable) performance).performEncore();
        }
    }
}
