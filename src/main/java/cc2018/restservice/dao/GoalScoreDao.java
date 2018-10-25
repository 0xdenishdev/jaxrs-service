package cc2018.restservice.dao;

import cc2018.restservice.model.GoalScoreModel;

import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.ArrayList;

public class GoalScoreDao {

    private static final Map<String, GoalScoreModel> goalScoreMap = new HashMap<String, GoalScoreModel>();

    static {
        // TODO: Remove after implementing WSDL calls.
        initGoalScores();
    }

    private static void initGoalScores() {
        GoalScoreModel gs1 = new GoalScoreModel("gs01", "Smith", 2);
        GoalScoreModel gs2 = new GoalScoreModel("gs02", "Allen", 1);
        GoalScoreModel gs3 = new GoalScoreModel("gs03", "Jones", 3);

        goalScoreMap.put(gs1.getId(), gs1);
        goalScoreMap.put(gs2.getId(), gs2);
        goalScoreMap.put(gs3.getId(), gs3);
    }

    public static GoalScoreModel get(String no) {
        return goalScoreMap.get(no);
    }

    public static GoalScoreModel add(GoalScoreModel model) {
        goalScoreMap.put(model.getId(), model);

        return model;
    }

    public static GoalScoreModel update(GoalScoreModel model) {
        goalScoreMap.put(model.getId(), model);

        return model;
    }

    public static void delete(String id) {
        goalScoreMap.remove(id);
    }

    public static List<GoalScoreModel> getAll() {
        return new ArrayList<GoalScoreModel>(goalScoreMap.values());
    }
}
