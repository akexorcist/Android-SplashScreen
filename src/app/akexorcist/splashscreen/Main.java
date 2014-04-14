package app.akexorcist.splashscreen;

import android.os.Bundle;
import android.view.Window;
import android.app.Activity;

public class Main extends Activity {

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.main);
	}
}
