package xyz.pinaki.android.sensor;

import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onStart() {
        super.onStart();
        SensorManager sensorManager = (SensorManager)this.getSystemService(SENSOR_SERVICE);
        List<Sensor> list = sensorManager.getSensorList(Sensor.TYPE_ALL);
        for(Sensor sensor: list) {
            Log.i("pinaki-sensor", sensor.getName() + ", " + sensor.getStringType() + ", " + sensor.getVendor());
        }
    }
}
