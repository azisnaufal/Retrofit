package ac.id.unikom.myapplication;

import ac.id.unikom.myapplication.model.Response;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.GET;

public class ApiManager {
    private static ApiService apiService;
    private static Retrofit retrofit;

    public static ApiService getApiClient() {
        if (apiService == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl("https://api.fda.gov/food/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();

            apiService = retrofit.create(ApiService.class);
        }
        return apiService;
    }

    public interface ApiService {
        @GET("enforcement.json")
        Call<Response> getFoodReinforcementFDA();
    }
}
