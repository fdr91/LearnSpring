package spittr.data;

import org.springframework.stereotype.Component;
import spittr.Spitter;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Fedor on 10/9/2016.
 */
@Component
public class SpitterRepositoryImpl implements SpitterRepository{
    Map<String, Spitter> spitters = new HashMap<>();

    @Override
    public Spitter save(Spitter spitter) {
        return spitters.put(spitter.getUsername(), spitter);
    }

    @Override
    public Spitter findByUsername(String username) {
        return spitters.get(username);
    }
}
