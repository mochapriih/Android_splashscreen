package com.example.icontact;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity implements View.OnClickListener {

    private CardView idProfile, idContact, idFriend;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        idProfile = (CardView) findViewById(R.id.id_profile);
        idContact = (CardView) findViewById(R.id.id_contact);
        idFriend = (CardView) findViewById(R.id.id_friend);

        //fungsi onclicklistener
        idProfile.setOnClickListener(this);
        idContact.setOnClickListener(this);
        idFriend.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent i ;

        switch (v.getId()){
            case R.id.id_profile : i = new Intent(this, Profile.class); startActivity(i); break;
            case R.id.id_contact : i = new Intent(this, Contact.class); startActivity(i); break;
            case R.id.id_friend : i = new Intent(this, Friend.class); startActivity(i); break;
            default:break;
        }
    }
}
