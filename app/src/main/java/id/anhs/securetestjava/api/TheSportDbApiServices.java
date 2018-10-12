package id.anhs.securetestjava.api;

import id.anhs.securetestjava.model.TeamResponse;
import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TheSportDbApiServices {

    @GET("lookupteam.php")
    Observable<TeamResponse> getTeamDetails(@Query("id") String id_team);
}
