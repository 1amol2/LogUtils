package com.amol.utils.LogUtils;

import android.content.Context;
import android.util.Log;

public class LogUtils {
  public void logDebug(String tag, String mssg) {
    Log.d(tag, mssg);
  }

  public void logError(String tag, String mssg) {
    Log.e(tag, mssg);
  }

  public void logInfo(String tag, String mssg) {
    Log.i(tag, mssg);
  }

  public void logVerbose(String tag, String mssg) {
    Log.v(tag, mssg);
  }

  public void logWarning(String tag, String mssg) {
    Log.w(tag, mssg);
  }

  public void logWtf(String tag, String mssg) {
    Log.wtf(tag, mssg);
  }
}
