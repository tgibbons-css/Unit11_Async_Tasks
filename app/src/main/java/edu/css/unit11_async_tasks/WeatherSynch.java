package edu.css.unit11_async_tasks;

import static java.lang.Thread.sleep;

/**
 * Created by tgibbons on 4/2/2019.
 */

public class WeatherSynch {

    public String getWeatherSynch() {

        String forecast = "It should be sunny today.";

        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return forecast;

    }


}
