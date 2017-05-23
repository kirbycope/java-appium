package Framework;

import Pages.*;
import io.appium.java_client.NetworkConnectionSetting;
import io.appium.java_client.android.AndroidDriver;

public class App {
    public static AndroidDriver driver;

    //region App Methods

        /**
         * Get the current activity being run on the mobile device
         */
        public String currentActivity() {
            return driver.currentActivity();
        }

        /**
         * Get test-coverage data
         *
         * @param intent
         *            intent to broadcast
         * @param path
         *            path to .ec file
         */
        public void endTestCoverage(String intent, String path) {
            driver.endTestCoverage(intent, path);
        }

        /**
         * @see io.appium.java_client.android.HasNetworkConnection#getNetworkConnection()
         */
        public NetworkConnectionSetting getNetworkConnection(){
            return driver.getNetworkConnection();
        }

        /**
         * Set the `ignoreUnimportantViews` setting. *Android-only method*
         *
         * Sets whether Android devices should use `setCompressedLayoutHeirarchy()`
         * which ignores all views which are marked IMPORTANT_FOR_ACCESSIBILITY_NO
         * or IMPORTANT_FOR_ACCESSIBILITY_AUTO (and have been deemed not important
         * by the system), in an attempt to make things less confusing or faster.
         *
         * @param compress
         *            ignores unimportant views if true, doesn't ignore otherwise.
         */
        public void ignoreUnimportantViews(Boolean compress) {
            driver.ignoreUnimportantViews(compress);
        }

        /**
         * Check if the device is locked.
         *
         * @return true if device is locked. False otherwise
         */
        public boolean isLocked() {
            return driver.isLocked();
        }

        /**
         * Open the notification shade, on Android devices.
         */
        public void openNotifications() {
            driver.openNotifications();
        }

        /**
         * @param remotePath
         *            Path to file to write data to on remote device
         * @param base64Data
         *            Base64 encoded byte array of data to write to remote device
         * @see io.appium.java_client.android.PushesFiles#pushFile(String, byte[])
         */
        public void pushFile(String remotePath, byte[] base64Data) {
            driver.pushFile(remotePath, base64Data);
        }

        /**
         * Send a key event to the device
         *
         * @param key
         *            code for the key pressed on the device
         */
        public void sendKeyEvent(int key) {
            driver.sendKeyEvent(key);
        }

        /**
         * @param key
         *            code for the key pressed on the Android device
         * @param metastate
         *            metastate for the keypress
         *
         * @see io.appium.java_client.android.AndroidKeyCode
         * @see io.appium.java_client.android.AndroidKeyMetastate
         * @see io.appium.java_client.android.AndroidDeviceActionShortcuts#sendKeyEvent(int, Integer)
         */
        public void sendKeyEvent(int key, Integer metastate) {
            driver.sendKeyEvent(key, metastate);
        }

        /**
         * @param connection
         *            The NetworkConnectionSetting configuration to use for the
         *            device
         *
         * @see io.appium.java_client.android.HasNetworkConnection#setNetworkConnection(NetworkConnectionSetting)
         */
        public void setNetworkConnection(NetworkConnectionSetting connection) {
            driver.setNetworkConnection(connection);
        }

        /**
         * Scroll forward to the element which has a description or name which contains the input text.
         * The scrolling is performed on the first scrollView present on the UI
         * @param text
         */
        public void scrollTo(String text) {
            driver.scrollTo(text);
        }

        /**
         * Scroll forward to the element which has a description or name which exactly matches the input text.
         * The scrolling is performed on the first scrollView present on the UI
         * @param text
         */
        public void scrollToExact(String text) {
            driver.scrollToExact(text);
        }

        /**
         * @param appPackage The package containing the activity. [Required]
         * @param appActivity The activity to start. [Required]
         * @example
         * *.startActivity("com.foo.bar", ".MyActivity");
         * @see io.appium.java_client.android.StartsActivity#startActivity(String, String)
         */
        public void startActivity(String appPackage, String appActivity) throws IllegalArgumentException {
            driver.startActivity(appPackage, appActivity, null, null);
        }

        /**
         * @param appPackage
         *            The package containing the activity. [Required]
         * @param appActivity
         *            The activity to start. [Required]
         * @param appWaitPackage
         *            Automation will begin after this package starts. [Optional]
         * @param appWaitActivity
         *            Automation will begin after this activity starts. [Optional]
         * @example driver.startActivity("com.foo.bar", ".MyActivity", null, null);
         *
         * @see io.appium.java_client.android.StartsActivity#startActivity(String, String, String, String)
         */
        public void startActivity(String appPackage, String appActivity, String appWaitPackage, String appWaitActivity) throws IllegalArgumentException {
            driver.startActivity(appPackage, appActivity, appWaitPackage, appWaitActivity);
        }

        public void toggleLocationServices() {
            driver.toggleLocationServices();
        }

    //endregion

    //region App POMs

    // "Home" page object
    public static HomePage HomePage() {
        return new HomePage();
    }

    //endregion
}
