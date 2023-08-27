package se.gritacademy.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkInfo;
import android.os.BatteryManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         textView = findViewById(R.id.textView2); // query
        textView.setText("DET FUNKAR");

        Button button= findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                update("Test");
            }
        });

        ConnectivityManager cm =  (ConnectivityManager) getSystemService(CONNECTIVITY_SERVICE);
        NetworkInfo ni = cm.getNetworkInfo(ConnectivityManager.TYPE_WIFI);

        textView.setText( String.valueOf( ni.isConnectedOrConnecting() ) );

        Toast.makeText(this, "HELLO WORLD", Toast.LENGTH_SHORT).show();
        //shift f10 köra run)

  /*      Toast.makeText(this, "Message", Toast.LENGTH_SHORT).show();

        TextView batteryText= findViewById(R.id.batteryLevel);
        Log.d("test", (String) batteryText.getText());

        BatteryManager bm = (BatteryManager) getSystemService(BATTERY_SERVICE);
        int batteryLevel= bm.getIntProperty(BatteryManager.BATTERY_PROPERTY_CAPACITY);

        Log.d("test", String.valueOf(batteryLevel));
        batteryText.setText(String.valueOf(batteryLevel)+"%");*/

    }


    void update(String text){
        text+="!";
        text+="!";
        textView.setText(text);

    }


}