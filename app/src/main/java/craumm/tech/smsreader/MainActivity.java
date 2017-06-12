package craumm.tech.smsreader;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bezirk.middleware.Bezirk;
import com.bezirk.middleware.android.BezirkMiddleware;

import zirks.example.SMSReader;

public class MainActivity extends AppCompatActivity {

    private Bezirk bezirk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BezirkMiddleware.initialize(this);
        bezirk = BezirkMiddleware.registerZirk("Remote Control Android Zirk");
    }

    protected void sendEvent(String msgBody, String msgSender){
        bezirk.sendEvent(new SMSReader(msgBody, msgSender));
    }
}
