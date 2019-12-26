package in.appyflow.paytmexample;

import android.os.Bundle;
import io.flutter.app.FlutterActivity;
import io.flutter.plugins.GeneratedPluginRegistrant;
import io.flutter.view.FlutterMain;

public class MainActivity extends FlutterActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    FlutterMain.startInitialization(this); //Added line
    super.onCreate(savedInstanceState);
    GeneratedPluginRegistrant.registerWith(this);
  }
}
