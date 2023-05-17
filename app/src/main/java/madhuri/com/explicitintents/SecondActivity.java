package madhuri.com.explicitintents;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Bundle bundle = getIntent().getExtras();

        if (bundle != null) {
            String imgindex = bundle.getString("Image Index");
            setImage(imgindex);
        }
    }

    @SuppressLint("SetTextI18n")
    private void setImage(String index) {
        ImageView imageView = (ImageView) findViewById(R.id.dish1);
        TextView textView = (TextView) findViewById(R.id.text1);

        switch (index) {
            case "1":
                imageView.setImageResource(R.drawable.dishes1);
                textView.setText("dish1");
                break;

            case "2":
                imageView.setImageResource(R.drawable.dishes2);
                textView.setText("dish");
                break;

            case "3":
                imageView.setImageResource(R.drawable.dishes3);
                textView.setText("dish3");
                break;

            case "4":
                imageView.setImageResource(R.drawable.dishes4);
                textView.setText("dish4");
                break;

        }
    }

    public void btnClickback(View view) {
        Button button = (Button) findViewById(R.id.btnback);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent2);

            }

            ;
        });
    }
}
