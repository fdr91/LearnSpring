package spittr.data;

import spittr.Spitter;

/**
 * Created by Fedor on 10/9/2016.
 */
public interface SpitterRepository {
    Spitter save(Spitter spitter);

    Spitter findByUsername(String username);
}
