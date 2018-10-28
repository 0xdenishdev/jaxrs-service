package cc2018.restservice.controller;

import cc2018.restservice.model.GoalScore;
import cc2018.restservice.dao.GoalScoreDao;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.DELETE;
import javax.ws.rs.Consumes;
import javax.ws.rs.Produces;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.GenericEntity;

@Path("/scores")
public class GoalScoreController {

    // URI:
    // /contextPath/servletPath/scores
    @GET
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response getScores() {
        GenericEntity<List<GoalScore>> entity = new GenericEntity<List<GoalScore>>(GoalScoreDao.getAll()) {};
        return Response.ok(entity).build();
    }

    // URI:
    // /contextPath/servletPath/scores/{id}
    @GET
    @Path("/{id}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response getScoreById(@PathParam("id") String id) {
        return Response.ok().entity(GoalScoreDao.get(id)).build();
    }

    // URI:
    // /contextPath/servletPath/scores
    @POST
    @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response addScore(GoalScore model) {
        GoalScore goalScore = GoalScoreDao.add(model);
        return Response.status(Response.Status.CREATED).entity(goalScore).build();
    }

    // URI:
    // /contextPath/servletPath/scores
    @PUT
    @Consumes({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response updateScore(GoalScore model) {
        GoalScore goalScore = GoalScoreDao.update(model);
        return Response.ok().entity(goalScore).build();
    }

    // URI:
    // /contextPath/servletPath/scores
    @DELETE
    @Path("/{id}")
    @Produces({ MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML })
    public Response deleteScoreById(@PathParam("id") String id) {
        GoalScoreDao.delete(id);
        return Response.status(Response.Status.NO_CONTENT).build();
    }
}
