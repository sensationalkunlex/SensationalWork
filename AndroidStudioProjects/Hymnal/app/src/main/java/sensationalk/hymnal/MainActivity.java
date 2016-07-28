package sensationalk.hymnal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;



public class MainActivity extends AppCompatActivity {

    private EditText filterText;

    private ArrayAdapter<String> listAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        filterText = (EditText)findViewById(R.id.editText);

        ListView itemList = (ListView)findViewById(R.id.listView);

        String [] listViewAdapterContent = {"Hymn001: Wonderfull Stories of love", "House churc", "Hymn002: Building Cha", "Food", "Sports", "Dress", "Ring"};
        final String[] Hymnall=new String[1000];
        Hymnall[1]="Hymn001: Wonderfull Stories of love" +
                    "\nTell it to me again    ";






        Hymnall[2]="Hymn002: Wonderfull Stories of love"
                +"Tell it to me again";

        Hymnall[3]="Tester2";
        listAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_2, android.R.id.text2, listViewAdapterContent);

        itemList.setAdapter(listAdapter);

        itemList.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
// make Toast when click

               String Lookup= (String.valueOf(parent.getItemAtPosition(position))).substring(0,7).toLowerCase();
                //Toast.makeText()
                Toast.makeText(getApplicationContext(), "Position " + Lookup, Toast.LENGTH_LONG).show();

              for(int i =1; i<4; i++)
                {
                   String Tester= Hymnall[i].substring(0,7).toString().toLowerCase();
                   // Toast.makeText(getApplicationContext(), " Test1 "+Tester, Toast.LENGTH_LONG).show();

                    if(Lookup.equals(Tester))
                    {
              //  String Tester= Hymnall[1].substring(0,7).toString().toLowerCase();
                       // Toast.makeText(getApplicationContext(), " Tester2 "+Tester, Toast.LENGTH_LONG).show();

                        String getter=Hymnall[i];
                        Intent intent = new Intent(getApplication(), Displayer.class);
                        intent.putExtra("PassMsg", getter);
                        startActivity(intent);

                    }

                }





            }
        });
        filterText.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
               MainActivity.this.listAdapter.getFilter().filter(s);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
   getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
      int id = item.getItemId();

        //noinspection SimplifiableIfStatement
    if (id == R.id.action_settings) {
            return true;
   }

   return super.onOptionsItemSelected(item);
    }
}
