package com.sensationalk.android.uidesign;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;
import android.widget.ImageView;

public class firstUi extends AppCompatActivity {
    private ImageView imageViewRound;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_ui);
        /*imageViewRound=(ImageView)findViewById(R.id.imgcicle);
        Bitmap icon = BitmapFactory.decodeResource(getResources(),R.drawable.ic_action_name);
*/
       // imageViewRound.setImageBitmap(icon);
        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ImageView imageView=(ImageView)findViewById(R.id.back_go_btn);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.first_menu,menu);
        return true;
    }
}
