package cc2018.restservice.controller;

import cc2018.restservice.dao.GoalScoreDao;
import cc2018.restservice.model.GoalScoreModel;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.MediaType;

@Path("/scores")
public class GoalScoreController {

    // URI:
    // /contextPath/servletPath/scores
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public List<GoalScoreModel> getScores() {
        return GoalScoreDao.getAll();
    }

    // URI:
    // /contextPath/servletPath/scores/{id}
    @GET
    @Path("/{id}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public GoalScoreModel getScoreById(@PathParam("id") String id) {
        return GoalScoreDao.get(id);
    }

    // URI:
    // /contextPath/servletPath/scores
    @POST
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public GoalScoreModel addScore(GoalScoreModel model) {
        return GoalScoreDao.add(model);
    }

    // URI:
    // /contextPath/servletPath/scores
    @PUT
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public GoalScoreModel updateScore(GoalScoreModel model) {
        return GoalScoreDao.update(model);
    }

    // URI:
    // /contextPath/servletPath/scores
    @DELETE
    @Path("/{id}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public void deleteScoreById(@PathParam("id") String id) {
        GoalScoreDao.delete(id);
    }
}
