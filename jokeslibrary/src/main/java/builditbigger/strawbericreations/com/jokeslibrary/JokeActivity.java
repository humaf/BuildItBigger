package builditbigger.strawbericreations.com.jokeslibrary;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);


        String result = null;

        TextView textView = (TextView)findViewById(R.id.text);
        Intent intent = getIntent();
        result = intent.getStringExtra(getString(R.string.joketosend));

        if (result != null) {
            textView.setText(result);
        } else {
            textView.setText("Where is the joke");
        }
    }


}
