package com.example.broadcastreceiver

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.widget.Toast

class AirplaneModeChangedReceiver: BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val isAirPlaneModeEnable = intent?.getBooleanExtra("state", false) ?: return
        if(isAirPlaneModeEnable){
            Toast.makeText(context,"Airplane Mode Enable", Toast.LENGTH_LONG).show()
        }else{
            Toast.makeText(context,"Airplane Mode Disable", Toast.LENGTH_LONG).show()
        }
    }
}