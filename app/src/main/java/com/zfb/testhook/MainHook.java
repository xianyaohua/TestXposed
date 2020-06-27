package com.zfb.testhook;

import android.util.Log;

import de.robv.android.xposed.IXposedHookInitPackageResources;
import de.robv.android.xposed.IXposedHookLoadPackage;
import de.robv.android.xposed.IXposedHookZygoteInit;
import de.robv.android.xposed.XposedBridge;
import de.robv.android.xposed.callbacks.XC_InitPackageResources;
import de.robv.android.xposed.callbacks.XC_LoadPackage;

public class MainHook implements IXposedHookZygoteInit , IXposedHookLoadPackage, IXposedHookInitPackageResources {
    @Override
    public void initZygote(StartupParam startupParam) throws Throwable {
        XposedBridge.log("initZygote");
        Log.e("","initZygote");
    }

    @Override
    public void handleLoadPackage(XC_LoadPackage.LoadPackageParam lpparam) throws Throwable {
        XposedBridge.log("handleLoadPackage");
        Log.e("","handleLoadPackage");
    }

    @Override
    public void handleInitPackageResources(XC_InitPackageResources.InitPackageResourcesParam resparam) throws Throwable {
        XposedBridge.log("handleInitPackageResources");
        Log.e("","handleInitPackageResources");
    }
}
