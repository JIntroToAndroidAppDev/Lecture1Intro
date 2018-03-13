package ghoshal.shankhadeep.com.lecture1intro;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

    }

    /**
     * Dispatch onResume() to fragments.  Note that for better inter-operation
     * with older versions of the platform, at the point of this call the
     * fragments attached to the activity are <em>not</em> resumed.  This means
     * that in some cases the previous state may still be saved, not allowing
     * fragment transactions that modify the state.  To correctly interact
     * with fragments in their proper state, you should instead override
     * {@link #onResumeFragments()}.
     */
    @Override
    protected void onResume() {
        super.onResume();

        EditText editText1 = findViewById(R.id.textView);
        EditText editText2 = findViewById(R.id.textView2);

        String editText1Value = editText1.getText().toString();

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(view -> {
            Intent intent = new Intent(view.getContext(),Activity2.class);
            intent.putExtra("some_value","This is the data to be passed");
            startActivity(intent);
        });
    }
}
