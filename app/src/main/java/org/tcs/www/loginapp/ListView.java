package org.tcs.www.loginapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;

public class ListView extends AppCompatActivity {
    private static ListView list_View;
    private static String[] Names=new String[]{"BMW","Mercedes","Aston Martin"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
    }
    public void setListView()
    {        list_View = (ListView)findViewById(R.id.mylistview1);
        ArrayAdapter<String> adapter=new ArrayAdapter<String>(this,R.layout.name_,list_View);
         list_View.
    }
}
