package com.danielsalinasjaramillo.colombia_turistica;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id=item.getItemId();
        Intent intent[]=new Intent[5];

        switch (id)
        {
            case R.id.hoteles:
            intent[0] = new Intent(this,HotelesActivity.class);
            startActivity(intent[0]);
            break;
            case R.id.bares:
                intent[1] = new Intent(this,BaresActivity.class);
                startActivity(intent[1]);
                break;
            case R.id.turismo:
                intent[2] = new Intent(this,TurismoActivity.class);
                startActivity(intent[2]);
                break;
            case R.id.demografia:
                intent[3] = new Intent(this,DemografiaActivity.class);
                startActivity(intent[3]);
                break;
            case R.id.acerca:
                intent[4] = new Intent(this,AcercaDeActivity.class);
                startActivity(intent[4]);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
