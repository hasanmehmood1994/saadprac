package firstweek.mbh.saad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class CounterActivity extends AppCompatActivity {
TextView txt_count;
Button btn_count;
Button btn_decrement;
Button btn_reset;
int count=0;
String TAG="for testing";
Mypref_class mypef;
    @Override
    protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_counter);
        txt_count=findViewById(R.id.txt_counter);
        btn_count=findViewById(R.id.btn_count);
        Log.d(TAG, "onCreate"+count);
        LOG_FUN();
mypef=new Mypref_class(CounterActivity.this);
        String scnt=mypef.gettasbeehcounter();
        count= Integer.parseInt(scnt);
        txt_count.setText(""+count);
        btn_count.setOnClickListener(new View.OnClickListener()
        {@Override public void onClick(View view) {

            if (count>=20)
            {
                count=0;
                Toast.makeText(CounterActivity.this, "You have reached maximum", Toast.LENGTH_SHORT).show();
            }

            else {
                count++;

            }
//
            txt_count.setText(""+count);
            mypef.settasbeehcounter(String.valueOf(count));
//            count++;
//
//            txt_count.setText(""+count);
//            Log.d(TAG, "btn count"+count);

        }});


        btn_decrement=findViewById(R.id.btn_decrement);
        btn_decrement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (count<=0){
                    count=0;
                }
                else {
                    count--;
                    mypef.settasbeehcounter(String.valueOf(count));
                }
                txt_count.setText(""+count);
                mypef.settasbeehcounter(String.valueOf(count));
                Log.d(TAG, "btn decrement"+count);

            }
        });
        btn_reset=findViewById(R.id.btn_reset);
        btn_reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count=0;
                mypef.settasbeehcounter(String.valueOf(count));
                txt_count.setText(""+count);
                Log.d(TAG, "Reset button"+count);
            }
        });



    }
    public void LOG_FUN(){
        Log.d(TAG, "LOG_FUN: ");
    }
}
