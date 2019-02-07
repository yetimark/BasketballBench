package com.example.basketballbench;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class AddNewPlayer extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_new_player);
    }

    public void onAddPlayerToBenchPressed(View v)
    {
        //change activity
        Intent i = new Intent(this, MainActivity.class);
        this.startActivity(i);

        //EditTexts
        EditText nameET = (EditText)this.findViewById(R.id.nameET);
        EditText jerseyNumET = (EditText)this.findViewById(R.id.jerseyNumET);
        EditText ageET = (EditText)this.findViewById(R.id.ageET);
        EditText heightFeetET = (EditText)this.findViewById(R.id.heightFeetET);
        EditText heightInchesET = (EditText)this.findViewById(R.id.heightInchesET);



        //create a basketball Player                if the edit texts are empty the app crashes. add safeguard
        BasketballPlayer player = new BasketballPlayer(nameET.getText().toString(), Integer.parseInt(jerseyNumET.getText().toString()), Integer.parseInt(ageET.getText().toString()),
                Integer.parseInt(heightFeetET.getText().toString()), Integer.parseInt(heightInchesET.getText().toString()));

        Core.addBasketballPlayer(player);

        this.finish();
    }
}
