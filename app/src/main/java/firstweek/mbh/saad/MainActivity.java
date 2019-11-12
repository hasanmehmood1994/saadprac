package firstweek.mbh.saad;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import firstweek.mbh.saad.Fragments.firstfrag;
import firstweek.mbh.saad.Fragments.secfrag;
import firstweek.mbh.saad.Fragments.thirdfrag;

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
    public  void calling1stfg()
{
    currentfrg=new firstfrag();
    fragmentTransaction=getSupportFragmentManager().beginTransaction();
    fragmentTransaction.replace(R.id.fragcontainer,currentfrg);
    fragmentTransaction.commit();
}
    public  void calling2ndfg()
    {
        currentfrg=new secfrag();
        fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragcontainer,currentfrg);
        fragmentTransaction.commit();
    }

    public  void calling3rdfg()
    {
        currentfrg=new thirdfrag();
        fragmentTransaction=getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.fragcontainer,currentfrg);
        fragmentTransaction.commit();
    }


int cn=0;

    public void funnext(View view) {
        cn++;
        if (cn==1)
        {
            calling1stfg();
        }
        else if(cn==2)
        {
            calling2ndfg();
        }
        else if(cn==3)
        {
       calling3rdfg();
        }
        else
        {calling1stfg();
        }

    }
    public void funprev(View view) {

        cn--;
        if (cn==1)
        {
            calling1stfg();
        }
        else if(cn==2)
        {
            calling2ndfg();
        }
        else if(cn==3)
        {
            calling3rdfg();
        }
        else
        {calling1stfg();
        }


    }
}
