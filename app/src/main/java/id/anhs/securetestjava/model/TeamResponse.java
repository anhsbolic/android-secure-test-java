package id.anhs.securetestjava.model;

import android.support.annotation.Keep;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

@Keep
public class TeamResponse {

    @SerializedName("teams")
    @Expose
    public List<Team> teams;

    public TeamResponse() {
        // empty constructor
    }

    public TeamResponse(List<Team> teams) {
        this.teams = teams;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }
}
