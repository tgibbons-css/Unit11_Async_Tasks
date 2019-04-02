package edu.css.unit11_async_tasks;

import static java.lang.Thread.sleep;
import android.os.AsyncTask;
import android.widget.TextView;

/**
 * Created by tgibbons on 4/2/2019.
 */

public class WeatherAsynch extends AsyncTask<TextView, Void, String> {

    TextView mStatus;

    @Override
    protected String doInBackground(TextView... tvStatus) {
        String forecast = "It should be sunny today.";
        // For now just grab the first element, assume there is only one
        // Fix later...
        mStatus = tvStatus[0];

        try {
            sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        return forecast;
    }

    @Override
    protected void onPostExecute(String weather) {
        mStatus.setText(weather);
    }
}
