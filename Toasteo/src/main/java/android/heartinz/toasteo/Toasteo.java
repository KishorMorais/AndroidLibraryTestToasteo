package android.heartinz.toasteo;

import android.content.Context;
import android.widget.Toast;

public class Toasteo {
    public static void shortMessage(Context context, String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
