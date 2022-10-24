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
        TextView singAPP = findViewById(R.id.text);
        TextView login = findViewById(R.id.login);
        TextView x = findViewById(R.id.x);
        TextView show = findViewById(R.id.show);
        TextView f = findViewById(R.id.textView2);
        TextView text = findViewById(R.id.textView3);
        TextView your = findViewById(R.id.your);
        EditText textName = findViewById(R.id.text1);
        EditText textEmail = findViewById(R.id.text2);
        EditText textLogin = findViewById(R.id.text3);

        Button btn = findViewById(R.id.button);

        btn.setOnClickListener(View ->{

            if (textEmail.getText().toString().equals("  Clown") & textLogin.getText().toString().equals("  password")) {
                Toast.makeText(getApplicationContext(), "Вход выполнен", Toast.LENGTH_LONG).show();
                singAPP.setVisibility(android.view.View.GONE);
                login.setVisibility(android.view.View.GONE);
                x.setVisibility(android.view.View.GONE);
                show.setVisibility(android.view.View.GONE);
                f.setVisibility(android.view.View.GONE);
                text.setVisibility(android.view.View.GONE);
                your.setVisibility(android.view.View.GONE);
                textName.setVisibility(android.view.View.GONE);
                textEmail.setVisibility(android.view.View.GONE);
                textLogin.setVisibility(android.view.View.GONE);
            }
            else {
                Toast.makeText(getApplicationContext(), "Неправильный пароль или логин", Toast.LENGTH_LONG).show();
            }

        });
    }
}
