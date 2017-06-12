package com.ramonilho.eoqalarme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

/**
 * Created by logonrm on 12/06/2017.
 */

public class AlarmeReceiver extends BroadcastReceiver {
    private MediaPlayer mp = null;

    @Override
    public void onReceive(Context context, Intent intent) {
        mp = MediaPlayer.create(context, R.raw.eoq);
        mp.start();
        Toast.makeText(context, "EOQ !", Toast.LENGTH_LONG).show();
    }

}
