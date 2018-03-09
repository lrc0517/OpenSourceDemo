package com.lucien.opensource.opensourcelibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Lucien on 2018/3/9.
 */

public class ToastUtils {

    /**
     *
     * @param context
     * @param str
     */
    public static void showToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }
}
