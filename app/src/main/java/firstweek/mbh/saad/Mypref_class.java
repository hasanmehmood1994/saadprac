package firstweek.mbh.saad;

import android.content.Context;
import android.content.SharedPreferences;

public class Mypref_class {
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;
    public Mypref_class(Context context)
    {
        sharedPreferences=context.getSharedPreferences("mytasbeehcounter",Context.MODE_PRIVATE);
        editor=sharedPreferences.edit();

    }

    public void settasbeehcounter(String counter)
    {
        editor.putString("counter",counter);
        editor.commit();
    }
    public String gettasbeehcounter()
    {

        return sharedPreferences.getString("counter","6");
    }




}
