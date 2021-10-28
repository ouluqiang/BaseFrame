package com.olq.baseframe;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.util.Base64;
import android.util.Log;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class AppUtils {

    public static void getAppSHA(Context context){
        try {
            PackageInfo info=context.getPackageManager().getPackageInfo(context.getPackageName(), PackageManager.GET_SIGNATURES);
            for (Signature signature : info.signatures) {
                MessageDigest md=MessageDigest.getInstance("SHA");
                md.update(signature.toByteArray());
                String s= Base64.encodeToString(md.digest(), Base64.DEFAULT);
                Log.e("MY_KEY_HASH:", s);
            }
//			val info = packageManager.getPackageInfo(packageName, PackageManager.GET_SIGNATURES)
//			for (signature in info.signatures) {
//				val md: MessageDigest = MessageDigest.getInstance("SHA")
//				md.update(signature.toByteArray())
//				Log.e("MY_KEY_HASH:", Base64.encodeToString(md.digest(), Base64.DEFAULT))
//			}
        } catch (PackageManager.NameNotFoundException e ) {
        } catch (NoSuchAlgorithmException e) {
        }
    }

}
