package com.example.exp9_551;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.option_menu,menu);
       return true;
    } 
    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        switch (item.getItemId()){
            case R.id.settings_items:
                Toast.makeText(this,"Settings selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.print_item:
                Toast.makeText(this,"print selected", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.share_item:
                Toast.makeText(this,"Share item selected",Toast.LENGTH_SHORT).show();
                return true;
            default :
                return super.onOptionsItemSelected(item);


        }
    }
}