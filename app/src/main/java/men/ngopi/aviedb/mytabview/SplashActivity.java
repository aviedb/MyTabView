package men.ngopi.aviedb.mytabview;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class SplashActivity extends AppCompatActivity {
    TextView tv;
    ImageView iv;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen);

        tv = findViewById(R.id.tv);
        iv = findViewById(R.id.iv);

        Typeface typeface = Typeface.createFromAsset(getAssets(), "fonts/google_sans_medium.ttf");
        tv.setTypeface(typeface);

        final Intent i = new Intent(this, MainActivity.class);
        Thread timer = new Thread(){
            public void run(){
            try {
                sleep(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            finally {
                startActivity(i);
                finish();
            }
            }
        };

        timer.start();
    }
}
