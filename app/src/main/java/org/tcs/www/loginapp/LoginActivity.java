package org.tcs.www.loginapp;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    private static EditText phone;
    private static EditText password;
    private static Button login;
    private static TextView at;
    int attempts = 5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        LoginButton();
    }

    public void LoginButton() {
        phone = (EditText) findViewById(R.id.phone1);
        password = (EditText) findViewById(R.id.password1);
        login = (Button) findViewById(R.id.login1);
        at = (TextView) findViewById(R.id.attempts2);
        at.setText(Integer.toString(attempts));
        login.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         if (phone.getText().toString().equals("9452") && password.getText().toString().equals("Devesh")) {
                                             Toast.makeText(LoginActivity.this, "Phone and password is correct", Toast.LENGTH_SHORT).show();
                                             Intent intent = new Intent(".UserActivity");
                                             startActivity(intent);
                                         } else {
                                             Toast.makeText(LoginActivity.this, "Phone and password is incorrect", Toast.LENGTH_SHORT).show();
                                             attempts--;
                                             at.setText(Integer.toString(attempts));
                                             if (attempts == 0)
                                                 login.setEnabled(false);

                                         }
                                     }
                                 }
        );


    }
}
