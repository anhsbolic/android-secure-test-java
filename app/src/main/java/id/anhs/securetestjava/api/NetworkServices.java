package id.anhs.securetestjava.api;

public class NetworkServices {

    private static final String BASE_URL = "https://www.thesportsdb.com/api/v1/json/";
    private static final String API_KEY = "1";

    public static TheSportDbApiServices getTheSportDBApiServices() {
        return RetrofitClient
                .getClient(BASE_URL + API_KEY + "/")
                .create(TheSportDbApiServices.class);
    }

}
