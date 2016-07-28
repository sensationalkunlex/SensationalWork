package com.sensationalk.android.assignmentk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

/**
 * Created by user on 21/06/2016.
 */
public class SecondLayout extends AppCompatActivity {

    EditText Email;
    EditText Username;
    EditText Password;
    EditText Name;
    Button BtnSave;
SqlDbhelper mDbhelper=new SqlDbhelper(this);
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.secondlayout);
        Email = (EditText)findViewById(R.id.Emailtxt);
        Username=(EditText)findViewById(R.id.Usernametxt);
        Password=(EditText)findViewById(R.id.Passwordtxt);
        Name=(EditText)findViewById(R.id.Nametxt);
        BtnSave =(Button)findViewById(R.id.btnAdd);
        Toolbar toolbar=(Toolbar)findViewById(R.id.toolball);
        setSupportActionBar(toolbar);

BtnSave.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View view) {
        mDbhelper.AddRecord(new ModelClass(Email.getText().toString(), Username.getText().toString(), Password.getText().toString(), Name.getText().toString()));

    }
});
        getSupportActionBar().setTitle(R.string.signup);

       getSupportActionBar().setIcon(R.drawable.ic_action_name);



    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        getMenuInflater().inflate(R.menu.mainmenu,menu);
        return true;
    }
    public void Click(View v)
    {
        Intent intent= new Intent(this, FirstLayout.class);
        startActivity(intent);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {
            case R.id.SignIn:
                Intent intent =new Intent(getApplication(), FirstLayout.class);
                startActivity(intent);

                default:return super.onOptionsItemSelected(item);





        }
    }
}


