package fki.mobile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
 
public class RegisterActivity extends Activity {
	private Button btnLinkToLogin, btnRegister;
	private EditText inputFullName;
	private EditText inputEmail;
	private EditText inputPassword;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setting default screen to login.xml
        setContentView(R.layout.register);
        
        inputFullName=(EditText) findViewById(R.id.name_register);
        inputEmail=(EditText) findViewById(R.id.email_register);
        inputPassword=(EditText) findViewById(R.id.password_register);
        btnRegister=(Button) findViewById(R.id.btnRegisterTo);
        btnLinkToLogin=(Button) findViewById(R.id.btnLinkToLoginScreen);
        
        btnRegister.setOnClickListener(new View.OnClickListener(){
        	@Override
            public void onClick(View v) {
        		String name=inputFullName.getText().toString();
        		String email=inputEmail.getText().toString();
        		String password=inputPassword.getText().toString();
        		if(!name.isEmpty() && !email.isEmpty() && !password.isEmpty()){
        			Toast.makeText(getApplicationContext(),
        					"disini akan diproses registrasi user baru", Toast.LENGTH_LONG).show();
        		}
        		else{
        			Toast.makeText(getApplicationContext(),
        					"Please enter your details! ", Toast.LENGTH_LONG).show();
        		}
            }
        });

        btnLinkToLogin.setOnClickListener(new View.OnClickListener(){
        	@Override	
            public void onClick(View v) {
                // Switching to Register screen
                Intent i = new Intent(getApplicationContext(), LoginActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}

