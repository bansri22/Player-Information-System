/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import dao.PlayerDAO;
import entity.Player;
import java.time.Clock;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Map;
import static logic.ScoreLogic.SCORE;

/**
 *
 * @author bansri
 */
public class PlayerLogic extends GenericLogic<Player, PlayerDAO> {

    public static final String ID = "id";
    public static final String FIRST_NAME = "firstname";
    public static final String LAST_NAME = "lastname";
    public static final String JOINED = "joined";
    public static final String EMAIL = "email";

    public PlayerLogic() {
        super(new PlayerDAO());
    }

    public List<Player> getAll() {
        return get(() -> dao().findAll());
    }

    public Player getByID(int ID) {
        return get(() -> dao().findByID(ID));
    }

    public List<Player> getByFirstName(String FirstName) {
        return get(() -> dao().findByFirstName(FirstName));
    }

    public List<Player> getByLastName(String LastName) {
        return get(() -> dao().findByLastName(LastName));
    }

    public List<Player> getByJoined(Date date) {
        return get(() -> dao().findByJoined(date));
    }
    
    public Player createEntity(Map<String, String[]> parameterMap) {
        Player player = new Player();
        player.setFirstName(parameterMap.get(FIRST_NAME)[0]);
        player.setLastName(parameterMap.get(LAST_NAME)[0]);
        player.setJoined(Date.from(Instant.now(Clock.systemDefaultZone())));
        player.setId(Integer.valueOf(parameterMap.get(ID)[0]));
        player.setEmail(parameterMap.get(EMAIL)[0]);
        add(player);
        
        
        
        //set fn, set ls, set emial, set joined date and set ID
        return player;
    }
    
        
     
}
