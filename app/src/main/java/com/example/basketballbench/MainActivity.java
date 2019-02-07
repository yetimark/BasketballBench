package com.example.basketballbench;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{
    //ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //ArrayAdapter<String> aa = new ArrayAdapter<String>(this, R.layout.list_view_row, Core.getTheBenchString());
        //ListView lv = (ListView)this.findViewById(R.id.listView);
        //lv.setAdapter(aa);
    }

    @Override
    protected void onResume()
    {
        super.onResume();

        ArrayAdapter<String> aa = new ArrayAdapter<String>(this, R.layout.list_view_row, Core.getTheBenchString());
        ListView lv = (ListView)this.findViewById(R.id.listView);
        lv.setAdapter(aa);
    }

    public void onNewPlayerToBenchPressed(View v)
    {
        Intent i = new Intent(this, AddNewPlayer.class);
        this.startActivity(i);
    }
}
