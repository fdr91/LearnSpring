package soundsystem;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by Fedor on 10/2/2016.
 */
@Configuration
@Import({CDPlayerConfig.class, CDConfig.class})
@ImportResource("classpath:cd-config.xml")
public class SoundSystemConfig {
}
