package mulodo.com.travisrobotium;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	private EditText et_01;
	private Button btn_01;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		initView();
	}

	private void initView() {
		et_01 = (EditText) findViewById(R.id.editText1);
		btn_01 = (Button) findViewById(R.id.button1);
		btn_01.setOnClickListener(this);
	}

	public void onClick(View v) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), "Click button",
				Toast.LENGTH_SHORT).show();
	}
}
