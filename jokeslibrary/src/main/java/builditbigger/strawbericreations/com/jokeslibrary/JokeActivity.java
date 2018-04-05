package builditbigger.strawbericreations.com.jokeslibrary;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import static android.content.Intent.EXTRA_TEXT;

public class JokeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_joke);


        String result = null;

        TextView textView = (TextView)findViewById(R.id.text);
        Intent intent = getIntent();
        result = intent.getStringExtra(EXTRA_TEXT);
      //  result = intent.getStringExtra(getString(R.string.joketosend));

        if (result != null) {
            textView.setText(result);
        } else {
            textView.setText("Where is the joke");
        }
    }

    public static Intent makeIntent(Context context, String joke) {
        final Intent intent = new Intent(context, JokeActivity.class);
        intent.putExtra(EXTRA_TEXT, joke);
        return intent;
    }

}
