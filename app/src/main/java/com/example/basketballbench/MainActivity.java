package com.example.basketballbench;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity
{
    private ListView lv;
    private BasketballPlayerArrayAdapter bpaa;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        //initializes the bench with empty strings and zeros
        Core.setTheBench();

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.bpaa = new BasketballPlayerArrayAdapter(this, R.layout.custom_list_view, Core.getTheBench());
        this.lv = (ListView)this.findViewById(R.id.listView);
        this.lv.setAdapter(bpaa);
    }

    @Override
    protected void onRestart()
    {
        super.onRestart();
        this.bpaa.notifyDataSetChanged();
        Core.DisplayBench();
    }

    public void onNewPlayerToBenchPressed(View v)
    {
        Intent i = new Intent(this, AddNewPlayer.class);
        this.startActivity(i);
    }
}
