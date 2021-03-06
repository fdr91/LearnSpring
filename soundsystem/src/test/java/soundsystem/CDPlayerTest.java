package soundsystem;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = SoundSystemConfig.class)
public class CDPlayerTest {
    @Rule
    public final SystemOutRule log = new SystemOutRule();
    @Autowired
    private MediaPlayer player;
    @Autowired
    private CompactDisc cd;

    @Before
    public void enableLog() {
        log.clearLog();
        log.enableLog();
    }

    @Test
    public void cdShouldNotBeNull() {
        assertNotNull(cd);
    }

    @Test
    public void play() {
        player.play();
//        assertEquals(
//                "Playing Sgt. Pepper's Lonely Hearts Club Band" +
//                        " by The Beatles\r\n",
//                log.getLog());
    }
}