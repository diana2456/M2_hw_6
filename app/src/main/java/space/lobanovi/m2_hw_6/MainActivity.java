package space.lobanovi.m2_hw_6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText textEmail = findViewById(R.id.text2);
        EditText textLogin = findViewById(R.id.text3);
        Button btn = findViewById(R.id.button);
        OnClickListener();


    }

    private void OnClickListener() {
        EditText textEmail = findViewById(R.id.text2);
        EditText textLogin = findViewById(R.id.text3);
        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(View ->{

            if (textEmail.getText().toString().equals("  Clown")|textLogin.getText().toString().equals("  password")) {
                Toast.makeText(getApplicationContext(), "Вход выполнен", Toast.LENGTH_LONG).show();
                textEmail.setVisibility(android.view.View.GONE);
                textLogin.setVisibility(android.view.View.GONE);
            }
            else {
                Toast.makeText(getApplicationContext(), "Неправильный пароль или логин", Toast.LENGTH_LONG).show();
            }

        });
    }
}
