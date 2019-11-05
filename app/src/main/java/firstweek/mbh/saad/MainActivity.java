package firstweek.mbh.saad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

Fragment currentfrg=null;
ConstraintLayout fragcont;
FragmentTransaction fragmentTransaction;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
fragcont=findViewById(R.id.fragcontainer);

    }


    public void funClassNext(View view) {

        Intent saad=new Intent(MainActivity.this, CounterActivity.class);
        startActivity(saad);
        Toast.makeText(this, "sd", Toast.LENGTH_SHORT).show();
    }
    public  void callingblankfrag()
{
    currentfrg=new BlankFragment();
    fragmentTransaction=getSupportFragmentManager().beginTransaction();
    fragmentTransaction.replace(R.id.fragcontainer,currentfrg);
    fragmentTransaction.commit();
}

    public void callingfrag(View view) {


        callingblankfrag();


    }
}
