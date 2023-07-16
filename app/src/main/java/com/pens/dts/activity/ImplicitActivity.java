package com.pens.dts.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.pens.dts.R;

public class ImplicitActivity extends AppCompatActivity implements View.OnClickListener {

    Button btnCamera, btnContact, btnBrowser, btnGallery, btnDial;

    EditText etNo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_implicit);

        etNo = findViewById(R.id.etNo);

        btnCamera = findViewById(R.id.btnCamera);
        btnBrowser = findViewById(R.id.btnBrowser);
        btnGallery = findViewById(R.id.btnGallery);
        btnDial = findViewById(R.id.btnDial);
        btnContact = findViewById(R.id.btnContact);


        btnDial.setOnClickListener(this);
        btnCamera.setOnClickListener(this);
        btnBrowser.setOnClickListener(this);
        btnContact.setOnClickListener(this);
        btnGallery.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        if (view.getId() == R.id.btnDial) {
            Intent i = new Intent();
            i.setAction(Intent.ACTION_DIAL);
            i.setData(Uri.parse("tel:" + etNo.getText()));
            startActivity(i);
        } else if (view.getId() == R.id.btnCamera) {
            Intent iCamera = new Intent();
            iCamera.setAction(MediaStore.ACTION_VIDEO_CAPTURE);
            startActivity(iCamera);
        } else if (view.getId() == R.id.btnGallery) {
            Intent iGallery = new Intent();
            iGallery.setAction(Intent.ACTION_VIEW);
            iGallery.setData(Uri.parse("content://media/external/images/media/"));
            startActivity(iGallery);
        } else if (view.getId() == R.id.btnBrowser) {
            Intent iBrowser = new Intent();
            iBrowser.setAction(Intent.ACTION_VIEW);
            iBrowser.setData(Uri.parse("http://www.google.com/"));
            startActivity(Intent.createChooser(iBrowser, "Title"));
        } else if (view.getId() == R.id.btnContact) {
            Intent iContact = new Intent();
            iContact.setAction(Intent.ACTION_VIEW);
            iContact.setData(Uri.parse("content://contacts/people/"));
            startActivity(iContact);
        }

    }
}