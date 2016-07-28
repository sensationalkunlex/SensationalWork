package good.logintest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import  android.widget.Button;
import  android.content.Intent;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
public class Gview extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_gview);

        TabHost tabHost = (TabHost)findViewById(android.R.id.tabhost);

        // Android tab
        Intent intentAndroid = new Intent().setClass(Gview.this, MainActivity.class);
        TabSpec tabSpecAndroid = tabHost
                .newTabSpec("Android")
              //  .setIndicator("", ressources.getDrawable(R.drawable.icon_android_config))
                .setContent(intentAndroid);

        // Apple tab
        Intent intentApple = new Intent().setClass(Gview.this, MainActivity.class);
        TabSpec tabSpecApple = tabHost
                .newTabSpec("Apple")
               // .setIndicator("", ressources.getDrawable(R.drawable.icon_apple_config))
                .setContent(intentApple);

        // Windows tab
        Intent intentWindows = new Intent().setClass(Gview.this, MainActivity.class);
        TabSpec tabSpecWindows = tabHost
                .newTabSpec("Windows")
                //.setIndicator("", ressources.getDrawable(R.drawable.icon_windows_config))
                .setContent(intentWindows);

        // Blackberry tab
        Intent intentBerry = new Intent().setClass(Gview.this, MainActivity.class);
        TabSpec tabSpecBerry = tabHost
                .newTabSpec("Berry")
                //.setIndicator("", ressources.getDrawable(R.drawable.icon_blackberry_config))
                .setContent(intentBerry);

        // add all tabs
        tabHost.addTab(tabSpecAndroid);
        tabHost.addTab(tabSpecApple);
        tabHost.addTab(tabSpecWindows);
        tabHost.addTab(tabSpecBerry);

        //set Windows tab as default (zero based)
        tabHost.setCurrentTab(2);

        Button btn = (Button) findViewById(R.id.btn_login);
btn.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent intent=new Intent(Gview.this, MainActivity.class);
        startActivity(intent);

    }








});













    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_gview, menu);
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
