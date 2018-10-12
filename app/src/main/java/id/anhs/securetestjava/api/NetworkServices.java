package id.anhs.securetestjava.api;

import static id.anhs.securetestjava.BuildConfig.API_KEY;
import static id.anhs.securetestjava.BuildConfig.BASE_URL;

public class NetworkServices {

    public static TheSportDbApiServices getTheSportDBApiServices() {
        return RetrofitClient
                .getClient(BASE_URL + API_KEY + "/")
                .create(TheSportDbApiServices.class);
    }

}
