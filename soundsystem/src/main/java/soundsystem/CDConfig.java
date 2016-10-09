package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Fedor on 10/2/2016.
 */
@Configuration
public class CDConfig {
    @Bean("lonelyHeartsClub")
    public CompactDisc sgtPeppers() {
        return new SgtPeppers();
    }

}
