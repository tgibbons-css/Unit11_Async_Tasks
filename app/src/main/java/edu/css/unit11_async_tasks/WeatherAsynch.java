package edu.css.unit11_async_tasks;

import static java.lang.Thread.sleep;
import android.os.AsyncTask;

/**
 * Created by tgibbons on 4/2/2019.
 */

public class WeatherAsynch extends AsyncTask<Void, Void, String> {


    @Override
    protected String doInBackground(Void... voids) {
        String forecast = "It should be sunny today.";

        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return forecast;
    }

    @Override
    protected void onPostExecute(String result) {
        //tvStatus.setText(weather);
    }
}
