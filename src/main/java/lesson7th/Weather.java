package lesson7th;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Weather {

    public static void  deserialize(String json) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        //objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        JsonNode jsonDaily = objectMapper
                .readTree(json)
                .at("/daily");
        Daily[] dailies = objectMapper.readValue(jsonDaily.toString(), Daily[].class);
        for (int i = 0; i < dailies.length; i++) {
            Date date  = new Date( (Long) dailies[i].getDt() * 1000 );
            SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
            System.out.println("В городе Санкт-Петербург на дату " + dateFormat.format(date)
                    + " ожидается " + dailies[i].weather.get(0)
                    + ", температура"
                    +" днем " + dailies[i].getTemp().getDay()
                    +" ночью " + dailies[i].getTemp().getNight()
            );
        }
    }
}
