
package com.facebook.react;

import android.app.Application;
import android.content.Context;
import android.content.res.Resources;

import com.facebook.react.ReactPackage;
import com.facebook.react.shell.MainPackageConfig;
import com.facebook.react.shell.MainReactPackage;
import java.util.Arrays;
import java.util.ArrayList;

// react-native-video
import com.brentvatne.react.ReactVideoPackage;
// @notifee/react-native
import io.invertase.notifee.NotifeePackage;
// @react-native-async-storage/async-storage
import com.reactnativecommunity.asyncstorage.AsyncStoragePackage;
// @react-native-firebase/analytics
import io.invertase.firebase.analytics.ReactNativeFirebaseAnalyticsPackage;
// @react-native-firebase/app
import io.invertase.firebase.app.ReactNativeFirebaseAppPackage;
// @react-native-firebase/crashlytics
import io.invertase.firebase.crashlytics.ReactNativeFirebaseCrashlyticsPackage;
// @react-native-firebase/messaging
import io.invertase.firebase.messaging.ReactNativeFirebaseMessagingPackage;
// react-native-camera
import org.reactnative.camera.RNCameraPackage;
// react-native-config
import com.lugg.ReactNativeConfig.ReactNativeConfigPackage;
// react-native-date-picker
import com.henninghall.date_picker.DatePickerPackage;
// react-native-document-picker
import com.reactnativedocumentpicker.DocumentPickerPackage;
// react-native-fast-image
import com.dylanvann.fastimage.FastImageViewPackage;
// react-native-fs
import com.rnfs.RNFSPackage;
// react-native-gesture-handler
import com.swmansion.gesturehandler.RNGestureHandlerPackage;
// react-native-image-picker
import com.imagepicker.ImagePickerPackage;
// react-native-orientation-locker
import org.wonday.orientation.OrientationPackage;
// react-native-reanimated
import com.swmansion.reanimated.ReanimatedPackage;
// react-native-safe-area-context
import com.th3rdwave.safeareacontext.SafeAreaContextPackage;
// react-native-screens
import com.swmansion.rnscreens.RNScreensPackage;
// react-native-splash-screen
import org.devio.rn.splashscreen.SplashScreenReactPackage;
// react-native-svg
import com.horcrux.svg.SvgPackage;
// react-native-version-check
import io.xogus.reactnative.versioncheck.RNVersionCheckPackage;
// react-native-webview
import com.reactnativecommunity.webview.RNCWebViewPackage;
// rn-fetch-blob
import com.RNFetchBlob.RNFetchBlobPackage;
// react-native-health-connect
import dev.matinzd.healthconnect.HealthConnectPackage;
// @react-native-community/netinfo
import com.reactnativecommunity.netinfo.NetInfoPackage;
// lottie-react-native
import com.airbnb.android.react.lottie.LottiePackage;
// react-native-device-info
import com.learnium.RNDeviceInfo.RNDeviceInfo;
// react-native-google-fit
import com.reactnative.googlefit.GoogleFitPackage;
// react-native-month-year-picker
import com.gusparis.monthpicker.RNMonthPickerPackage;
// react-native-vector-icons
import com.oblador.vectoricons.VectorIconsPackage;
// react-native-google-cast
import com.reactnative.googlecast.GoogleCastPackage;
// @react-native-firebase/database
import io.invertase.firebase.database.ReactNativeFirebaseDatabasePackage;
// react-native-linear-gradient
import com.BV.LinearGradient.LinearGradientPackage;
// @react-native-camera-roll/camera-roll
import com.reactnativecommunity.cameraroll.CameraRollPackage;
// react-native-razorpay
import com.razorpay.rn.RazorpayPackage;
// @react-native-clipboard/clipboard
import com.reactnativecommunity.clipboard.ClipboardPackage;

public class PackageList {
  private Application application;
  private ReactNativeHost reactNativeHost;
  private MainPackageConfig mConfig;

  public PackageList(ReactNativeHost reactNativeHost) {
    this(reactNativeHost, null);
  }

  public PackageList(Application application) {
    this(application, null);
  }

  public PackageList(ReactNativeHost reactNativeHost, MainPackageConfig config) {
    this.reactNativeHost = reactNativeHost;
    mConfig = config;
  }

  public PackageList(Application application, MainPackageConfig config) {
    this.reactNativeHost = null;
    this.application = application;
    mConfig = config;
  }

  private ReactNativeHost getReactNativeHost() {
    return this.reactNativeHost;
  }

  private Resources getResources() {
    return this.getApplication().getResources();
  }

  private Application getApplication() {
    if (this.reactNativeHost == null) return this.application;
    return this.reactNativeHost.getApplication();
  }

  private Context getApplicationContext() {
    return this.getApplication().getApplicationContext();
  }

  public ArrayList<ReactPackage> getPackages() {
    return new ArrayList<>(Arrays.<ReactPackage>asList(
      new MainReactPackage(mConfig),
      new ReactVideoPackage(),
      new NotifeePackage(),
      new AsyncStoragePackage(),
      new ReactNativeFirebaseAnalyticsPackage(),
      new ReactNativeFirebaseAppPackage(),
      new ReactNativeFirebaseCrashlyticsPackage(),
      new ReactNativeFirebaseMessagingPackage(),
      new RNCameraPackage(),
      new ReactNativeConfigPackage(),
      new DatePickerPackage(),
      new DocumentPickerPackage(),
      new FastImageViewPackage(),
      new RNFSPackage(),
      new RNGestureHandlerPackage(),
      new ImagePickerPackage(),
      new OrientationPackage(),
      new ReanimatedPackage(),
      new SafeAreaContextPackage(),
      new RNScreensPackage(),
      new SplashScreenReactPackage(),
      new SvgPackage(),
      new RNVersionCheckPackage(),
      new RNCWebViewPackage(),
      new RNFetchBlobPackage(),
      new HealthConnectPackage(),
      new NetInfoPackage(),
      new LottiePackage(),
      new RNDeviceInfo(),
      new GoogleFitPackage(com.pravisht.MhbMobile.BuildConfig.APPLICATION_ID),
      new RNMonthPickerPackage(),
      new VectorIconsPackage(),
      new GoogleCastPackage(),
      new ReactNativeFirebaseDatabasePackage(),
      new LinearGradientPackage(),
      new CameraRollPackage(),
      new RazorpayPackage(),
      new ClipboardPackage()
    ));
  }
}
