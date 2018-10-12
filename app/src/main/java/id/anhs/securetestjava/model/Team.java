package id.anhs.securetestjava.model;

import android.support.annotation.Keep;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Keep
public class Team {

    @SerializedName("idTeam")
    @Expose
    public String idTeam;
    @SerializedName("strTeam")
    @Expose
    public String strTeam;
    @SerializedName("strLeague")
    @Expose
    public String strLeague;
    @SerializedName("strDescriptionEN")
    @Expose
    public String strDescriptionEN;
    @SerializedName("strTeamBadge")
    @Expose
    public String strTeamBadge;

    public Team() {
        // empty constructor
    }

    public Team(String idTeam, String strTeam, String strLeague,
                String strDescriptionEN, String strTeamBadge) {
        this.idTeam = idTeam;
        this.strTeam = strTeam;
        this.strLeague = strLeague;
        this.strDescriptionEN = strDescriptionEN;
        this.strTeamBadge = strTeamBadge;
    }

    public String getIdTeam() {
        return idTeam;
    }

    public void setIdTeam(String idTeam) {
        this.idTeam = idTeam;
    }

    public String getStrTeam() {
        return strTeam;
    }

    public void setStrTeam(String strTeam) {
        this.strTeam = strTeam;
    }

    public String getStrLeague() {
        return strLeague;
    }

    public void setStrLeague(String strLeague) {
        this.strLeague = strLeague;
    }

    public String getStrDescriptionEN() {
        return strDescriptionEN;
    }

    public void setStrDescriptionEN(String strDescriptionEN) {
        this.strDescriptionEN = strDescriptionEN;
    }

    public String getStrTeamBadge() {
        return strTeamBadge;
    }

    public void setStrTeamBadge(String strTeamBadge) {
        this.strTeamBadge = strTeamBadge;
    }
}
