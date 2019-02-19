package com.example.basketballbench;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class BasketballPlayerArrayAdapter extends ArrayAdapter
{
    private Context mContext;
    private BasketballPlayer[] playerArray = new BasketballPlayer[15];
    private int textViewResourceId;

    public BasketballPlayerArrayAdapter(Context context, int textViewResourceId,
                                     BasketballPlayer[] array)
    {
        super(context, textViewResourceId , array);
        this.mContext = context;
        this.playerArray = array;
        this.textViewResourceId = textViewResourceId;
    }

    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {
        View listItem = convertView;

        if (listItem == null)
        {
            listItem = LayoutInflater.from(this.mContext).
                    inflate(this.textViewResourceId, parent, false);
        }

        BasketballPlayer player = this.playerArray[position];

        TextView nameTV = (TextView) listItem.findViewById(R.id.nameTV);
        TextView ageTV = (TextView) listItem.findViewById(R.id.ageTV);
        TextView jerseyNumberTV = (TextView) listItem.findViewById(R.id.jerseyNumberTV);
        TextView heightTV = (TextView) listItem.findViewById(R.id.heightTV);

        nameTV.setText(player.getNameString());
        ageTV.setText(player.getAgeString());
        jerseyNumberTV.setText(player.getJerseyNumString());
        heightTV.setText(player.getHeightString());

        return listItem;
    }
}
