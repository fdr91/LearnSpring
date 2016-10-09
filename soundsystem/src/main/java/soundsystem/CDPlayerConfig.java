package soundsystem;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Primary;

/**
 * Created by Fedor on 10/2/2016.
 */
@Configuration
@Import(CDConfig.class)
//@ComponentScan("soundsystem")
public class CDPlayerConfig {

    //Explicit configuration of beans in Config
//    @Bean
//    public CompactDisc randomBeatlesCD() {
//        int choice = 0;//(int) Math.floor(Math.random() * 4);
//        if (choice == 0) {
//            return new SgtPeppers();
//        }
//        else if (choice == 1) {
//            return new WhiteAlbum();
//        } else if (choice == 2) {
//            return new HardDaysNight();
//        } else {
//            return new SgtPeppers();
//        }
//    }

    @Bean
    @Primary
    public CDPlayer cdPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }

    //    Because sgtPepers is anotated with Bean, both cdPlayers will have the same CompactDisc object
    @Bean
    public CDPlayer anotherCDPlayer(CompactDisc compactDisc) {
        return new CDPlayer(compactDisc);
    }
}
