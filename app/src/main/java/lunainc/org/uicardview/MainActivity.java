package lunainc.org.uicardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.beardedhen.androidbootstrap.BootstrapButton;

public class MainActivity extends AppCompatActivity {


    private ImageView imageView;
    private TextView textView;
    private BootstrapButton bootstrapButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        bootstrapButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                imageView.setImageResource(R.drawable.gato);
                textView.setText("¡Hola soy un gato!");
                
            }
        });

        bootstrapButton.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {

                imageView.setImageResource(R.drawable.pikachu);
                textView.setText("¡Hola soy pikachu!");

                return false;
            }
        });


    }

    public void initViews(){

        imageView = (ImageView) findViewById(R.id.image);
        textView = (TextView) findViewById(R.id.text);
        bootstrapButton = (BootstrapButton) findViewById(R.id.btn);


    }
}
