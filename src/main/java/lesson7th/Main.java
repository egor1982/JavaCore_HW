package lesson7th;

import com.squareup.okhttp.HttpUrl;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;

import java.io.IOException;

public class Main {

    private static final String SPB_LAT = "59.94";
    private static final String SPB_LON = "30.31";
    private static final String API_KEY= "81d3ba1b4d59d114772cfd4bd750c667";
    public static void main(String[] args) {
        try {
            WeatherResponse.deserialize(getWeather());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
    private static String getWeather() throws IOException {
        OkHttpClient client = new OkHttpClient();
        HttpUrl httpUrl = new HttpUrl.Builder()
                .scheme("https")
                .host("api.openweathermap.org")
                .addPathSegment("data")
                .addPathSegment("2.5")
                .addPathSegment("onecall")
                .addQueryParameter("lat", SPB_LAT )
                .addQueryParameter("lon", SPB_LON )
                .addQueryParameter("exclude","current, minutely, hourly")
                .addQueryParameter("appid", API_KEY)
                .addQueryParameter("lang", "RU")
                .addQueryParameter("units","metric")
                .build();
        Request request = new Request.Builder()
                .addHeader("accept","application/json")
                .url(httpUrl)
                .build();
        return client.newCall(request).execute().body().string();
    }
}
