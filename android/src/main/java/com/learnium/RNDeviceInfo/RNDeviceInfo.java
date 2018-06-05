package com.learnium.RNDeviceInfo;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RNDeviceInfo implements ReactPackage {
  
  String brandForApp = null;

  public RNDeviceInfo() {
       super();
    }
  public RNDeviceInfo(String brand) {
        super();
        this.brandForApp = brand;
      }
  
  @Override
  public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
    List<NativeModule> modules = new ArrayList<>();

    modules.add(new RNDeviceModule(reactContext, this.brandForApp));

    return modules;
  }

  // Deprecated RN 0.47
  public List<Class<? extends JavaScriptModule>> createJSModules() {
    return Collections.emptyList();
  }

  @Override
  public List<ViewManager> createViewManagers(
      ReactApplicationContext reactContext) {
    return Collections.emptyList();
  }

}
