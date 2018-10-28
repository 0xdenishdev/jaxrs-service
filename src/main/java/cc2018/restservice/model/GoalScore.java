package cc2018.restservice.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlRootElement(name = "score")
@XmlAccessorType(XmlAccessType.FIELD)
public class GoalScore {

    private String    id;
    private String    name;
    private Integer   score;

    public GoalScore() {
        //
    }

    public GoalScore(String id, String name, Integer score) {
        this.id      = id;
        this.name    = name;
        this.score   = score;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}
