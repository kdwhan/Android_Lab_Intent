package embedded.kookmin.ac.kr.labintent1;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button bt;
    Button bt2;
    Intent in;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt = (Button)findViewById(R.id.bt_1);
        in = new Intent(this, NextActivity.class);
        in.putExtra("name", "kookmin");

        bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(in);
            }
        });

        bt2 = (Button)findViewById(R.id.bt_2);

        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_VIEW);
                Uri u = Uri.parse("http://www.naver.com/");
                i.setData(u);
                startActivity(i);
            }
        });
    }
}
