package android.heartinz.toasteo;

import android.content.Context;
import android.widget.Toast;

public class Toasteo {
    public static void shortMessage(Context context, String msg, int length){
        Toast.makeText(context, msg, length).show();
    }
}
