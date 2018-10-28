package cc2018.restservice.dao;

import cc2018.restservice.model.GoalScore;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class GoalScoreDao {

    private static final Map<String, GoalScore> goalScoreMap = new HashMap<String, GoalScore>();

    static {
        // TODO: Remove after implementing WSDL calls.
        initGoalScores();
    }

    private static void initGoalScores() {
        GoalScore gs1 = new GoalScore("gs01", "Smith", 2);
        GoalScore gs2 = new GoalScore("gs02", "Allen", 1);
        GoalScore gs3 = new GoalScore("gs03", "Jones", 3);

        goalScoreMap.put(gs1.getId(), gs1);
        goalScoreMap.put(gs2.getId(), gs2);
        goalScoreMap.put(gs3.getId(), gs3);
    }

    public static GoalScore get(String no) {
        return goalScoreMap.get(no);
    }

    public static GoalScore add(GoalScore model) {
        goalScoreMap.put(model.getId(), model);
        return model;
    }

    public static GoalScore update(GoalScore model) {
        goalScoreMap.put(model.getId(), model);
        return model;
    }

    public static void delete(String id) {
        goalScoreMap.remove(id);
    }

    public static List<GoalScore> getAll() {
        return new ArrayList<GoalScore>(goalScoreMap.values());
    }
}
