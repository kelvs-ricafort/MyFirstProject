package com.newtechieblog.wordpress.views.myfirstproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    Button ok;
    TextView result;
    ImageView image;
    LinearLayout linearLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ok = findViewById(R.id.btnOK);
        result = findViewById(R.id.ResultTextView);
        image = findViewById(R.id.imageExample);
        linearLayout = findViewById(R.id.linear);

        ok.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Toast.makeText(getApplicationContext(), "This is a Toast Message", Toast.LENGTH_LONG).show();

                Snackbar.make(linearLayout, "This is a Snackbar message", Snackbar.LENGTH_INDEFINITE).setAction("Close", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }).show();
            }
        });
    }
}