package com.example.testdelivery;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText passwordInput, emailInput;
    Button SignUp, Forgot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        emailInput = findViewById(R.id.Email);
        passwordInput = findViewById(R.id.Password);
        SignUp = findViewById(R.id.button);
        SignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this,  signup.class);
                startActivity(intent2);
            }
        });


        Button btn = findViewById(R.id.SignIn);

        btn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String email = emailInput.getText().toString();
                String password = passwordInput.getText().toString();
                if(email.equals("Pradip") && password.equals("anupam")){
                    Intent intent3 = new Intent(MainActivity.this, lauda.class);
                    startActivity(intent3);
                    }
                else if(email.isEmpty()||password.isEmpty()){
                    Toast.makeText(MainActivity.this,"Invalid Input",Toast.LENGTH_SHORT).show();
                    }
                else{
                    Intent intent3 = new Intent(MainActivity.this, lauda.class);
                    startActivity(intent3);
                   }
            }
        });

    }
}
