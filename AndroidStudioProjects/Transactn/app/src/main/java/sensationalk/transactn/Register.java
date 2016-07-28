package sensationalk.transactn;

import android.database.Cursor;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;

public class Register extends AppCompatActivity {
    EditText Name;
    EditText Accountno;
    TextView displayer;

    MydbHandler handler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        Name = (EditText) findViewById(R.id.txtName);
        Accountno = (EditText) findViewById(R.id.txtAccount);
        displayer = (TextView) findViewById(R.id.vName);
        handler = new MydbHandler(this, null, null, 1);
        //DisplayRecord();


    Cursor c = handler.display();
    if (c.moveToFirst())
    {
        do {
            DisplayContact(c);
            displayer.setText(dbstring);
            String db ="" +dbstring;
        } while (c.moveToNext());
    }
    handler.close();
}
   String dbstring;
    public void DisplayContact(Cursor c)
    {
        /*
        Toast.makeText(this,
                “id: “ + c.getString(0) + “\n” +
        “Name: “ + c.getString(1) + “\n” +
        “Email: “ + c.getString(2),*/

        dbstring = "ID "+c.getString(0)+" Name "+c.getString(1)+" AccountNo "+ c.getString(2)+"\n";

        Toast.makeText(this, dbstring, Toast.LENGTH_LONG).show();
        displayer.setText(dbstring);
        Name.setText("");
        Accountno.setText("");
    }



    public void DisplayRecord() {
        //String dbstring = handler.dispay();
       // displayer.setText(dbstring);
        Name.setText("");
        Accountno.setText("");

    }


    public void onClick(View view)
    {
        Info info = new Info(Name.getText().toString(), Accountno.getText().toString());
        handler.AddInfo(info);
        DisplayRecord();

    }
}
