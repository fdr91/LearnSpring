package concert;

import org.springframework.stereotype.Component;

/**
 * Created by Fedor on 10/9/2016.
 */
@Component
public class DefaultEncoreable implements Encoreable {

    @Override
    public void performEncore() {
        System.out.println("Perform encore");
    }
}
