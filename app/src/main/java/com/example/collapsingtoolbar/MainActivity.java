package com.example.collapsingtoolbar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    CardView bankcardId,ideaCardId,addCardId,linkCardId,addWifiCard;

//    Demo link
//    https://www.youtube.com/channel/UCoQp_Duwqh0JWEZrg4DT2Ug/playlists

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bankcardId=(CardView)findViewById(R.id.bankcardId);
        ideaCardId=(CardView)findViewById(R.id.ideaCardId);
        addCardId=(CardView)findViewById(R.id.addCardId);
        linkCardId=(CardView)findViewById(R.id.linkCardId);
        addWifiCard=(CardView)findViewById(R.id.addWifiCard);

        bankcardId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked on bank card!!", Toast.LENGTH_SHORT).show();
            }
        });
        ideaCardId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked on idea card!!", Toast.LENGTH_SHORT).show();
            }
        });
        addCardId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked on add card!!", Toast.LENGTH_SHORT).show();
            }
        });
        linkCardId.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked on link card!!", Toast.LENGTH_SHORT).show();
            }
        });
        addWifiCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Clicked on wifi card!!", Toast.LENGTH_SHORT).show();
            }
        });
    }
}
