/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logic;

import dao.ScoreDAO;
import entity.Score;
import java.time.Clock;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Map;
import static logic.PlayerLogic.ID;

/**
 *
 * @author bansri
 */
public class ScoreLogic extends GenericLogic<Score, ScoreDAO> {

    public static final String ID = "id";
    public static final String PLAYER_ID = "Player_id";
    public static final String SCORE = "score";
    public static final String SUBMISSION = "submission";

    public ScoreLogic() {
        super(new ScoreDAO());
    }

    public List<Score> getAll() {
        return get(() -> dao().findAll());
    }

    public Score getByID(int ID) {
        return get(() -> dao().findByID(ID));
    }

    public List<Score> getByPlayerID(int PlayerID) {
        return get(() -> dao().findByPlayerID(PlayerID));
    }

    public List<Score> getByScore(int score) {
        return get(() -> dao().findByScore(score));
    }

    public List<Score> getBysubmission(Date submission) {
        return get(() -> dao().findBySubmission(submission));
    }

    public Score createEntity(Map<String, String[]> parameterMap) {

        Score user = new Score();

        user.setScore(Integer.valueOf(parameterMap.get(SCORE)[0]));
        user.setSubmission(Date.from(Instant.now(Clock.systemDefaultZone())));
        user.setId(Integer.valueOf(parameterMap.get(ID)[0]));
       // user.setPlayerid(PLAYER_ID);
      
        return user;
    }
}

