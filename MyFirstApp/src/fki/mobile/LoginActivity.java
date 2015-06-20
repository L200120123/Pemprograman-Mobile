package fki.mobile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class LoginActivity extends Activity {
		private Button btnLogin, btnRegister;
		private EditText inputEmail;
		private EditText inputPassword;
	    @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        // setting default screen to login.xml
	        setContentView(R.layout.login);
	        
	        inputEmail=(EditText) findViewById(R.id.email_login);
	        inputEmail=(EditText) findViewById(R.id.email_login);
	        btnLogin=(Button) findViewById(R.id.btnLoginTo);
	        btnRegister=(Button) findViewById(R.id.btnLinkToRegisterScreen);
	        
	        btnLogin.setOnClickListener(new View.OnClickListener(){
	        	@Override
	            public void onClick(View v) {
	        		String email=inputEmail.getText().toString();
	        		String password=inputPassword.getText().toString();
	        		if(email.trim().length() > 0 && password.trim().length() > 0){
	        			Toast.makeText(getApplicationContext(),
	        					"username: "+email+"passwod: "+password, Toast.LENGTH_LONG).show();
	        		}
	        		else{
	        			Toast.makeText(getApplicationContext(),
	        					"Masukkan username dan password: ", Toast.LENGTH_LONG).show();
	        		}
	            }
	        });

	        btnRegister.setOnClickListener(new View.OnClickListener(){
	        	@Override	
	            public void onClick(View v) {
	                // Switching to Register screen
	                Intent i = new Intent(getApplicationContext(), RegisterActivity.class);
	                startActivity(i);
	                finish();
	            }
	        });
	    }
	}

