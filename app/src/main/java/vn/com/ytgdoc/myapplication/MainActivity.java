package vn.com.ytgdoc.myapplication;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btntouch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btntouch = (Button) findViewById(R.id.btntouch);
        btntouch.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {

                if (event.getAction()==MotionEvent.ACTION_DOWN){
                    btntouch.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                }
                else if (event.getAction()==MotionEvent.ACTION_UP){
                    btntouch.setBackgroundColor(getResources().getColor(R.color.colorPrimary));
                }
                return false;
            }
        });

    }
}
