package com.example.goshoes;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);
    }
    public void handleSeeOurSneakers(View view) {
        Intent intent = new Intent(this, ShoesActivity.class);
        startActivity(intent);
    }

    public void handleContactUs(View view) {

        Uri uri = Uri.parse("https://instagram.com/3foilstore?igshid=1w88x289xc0ve");
        Intent likeIng = new Intent(Intent.ACTION_VIEW, uri);

        likeIng.setPackage("com.instagram.android");

        try {
            startActivity(likeIng);
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("https://instagram.com/3foilstore?igshid=1w88x289xc0ve")));
        }
    }
}
