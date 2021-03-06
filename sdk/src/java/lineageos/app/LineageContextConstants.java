/**
 * Copyright (c) 2015, The CyanogenMod Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package lineageos.app;

import android.annotation.SdkConstant;

/**
 * @hide
 * TODO: We need to somehow make these managers accessible via getSystemService
 */
public final class LineageContextConstants {

    /**
     * @hide
     */
    private LineageContextConstants() {
        // Empty constructor
    }

    /**
     * Use with {@link android.content.Context#getSystemService} to retrieve a
     * {@link lineageos.app.LineageStatusBarManager} for informing the user of
     * background events.
     *
     * @see android.content.Context#getSystemService
     * @see lineageos.app.LineageStatusBarManager
     */
    public static final String LINEAGE_STATUS_BAR_SERVICE = "lineagestatusbar";

    /**
     * Use with {@link android.content.Context#getSystemService} to retrieve a
     * {@link lineageos.app.ProfileManager} for informing the user of
     * background events.
     *
     * @see android.content.Context#getSystemService
     * @see lineageos.app.ProfileManager
     *
     * @hide
     */
    public static final String LINEAGE_PROFILE_SERVICE = "profile";

    /**
     * Use with {@link android.content.Context#getSystemService} to retrieve a
     * {@link lineageos.app.LineageTelephonyManager} to manage the phone and
     * data connection.
     *
     * @see android.content.Context#getSystemService
     * @see lineageos.app.LineageTelephonyManager
     *
     * @hide
     */
    public static final String LINEAGE_TELEPHONY_MANAGER_SERVICE = "lineagetelephonymanager";

    /**
     * Use with {@link android.content.Context#getSystemService} to retrieve a
     * {@link lineageos.hardware.LineageHardwareManager} to manage the extended
     * hardware features of the device.
     *
     * @see android.content.Context#getSystemService
     * @see lineageos.hardware.LineageHardwareManager
     *
     * @hide
     */
    public static final String LINEAGE_HARDWARE_SERVICE = "lineagehardware";

    /**
     * @hide
     */
    public static final String LINEAGE_APP_SUGGEST_SERVICE = "lineageappsuggest";

    /**
     * Control device power profile and characteristics.
     *
     * @hide
     */
    public static final String LINEAGE_PERFORMANCE_SERVICE = "lineageperformance";

    /**
     * Manages composed icons
     *
     * @hide
     */
    public static final String LINEAGE_ICON_CACHE_SERVICE = "lineageiconcache";

    /**
     * Use with {@link android.content.Context#getSystemService} to retrieve a
     * {@link lineageos.weather.LineageWeatherManager} to manage the weather service
     * settings and request weather updates
     *
     * @see android.content.Context#getSystemService
     * @see lineageos.weather.LineageWeatherManager
     *
     * @hide
     */
    public static final String LINEAGE_WEATHER_SERVICE = "lineageweather";

    /**
     * Manages display color adjustments
     *
     * @hide
     */
    public static final String LINEAGE_LIVEDISPLAY_SERVICE = "lineagelivedisplay";


    /**
     * Manages enhanced audio functionality
     *
     * @hide
     */
    public static final String LINEAGE_AUDIO_SERVICE = "lineageaudio";

    /**
     * Features supported by the Lineage SDK.
     */
    public static class Features {
        /**
         * Feature for {@link PackageManager#getSystemAvailableFeatures} and
         * {@link PackageManager#hasSystemFeature}: The device includes the hardware abstraction
         * framework service utilized by the lineage sdk.
         */
        @SdkConstant(SdkConstant.SdkConstantType.FEATURE)
        public static final String HARDWARE_ABSTRACTION = "org.lineageos.hardware";

        /**
         * Feature for {@link PackageManager#getSystemAvailableFeatures} and
         * {@link PackageManager#hasSystemFeature}: The device includes the lineage status bar service
         * utilzed by the lineage sdk.
         */
        @SdkConstant(SdkConstant.SdkConstantType.FEATURE)
        public static final String STATUSBAR = "org.lineageos.statusbar";

        /**
         * Feature for {@link PackageManager#getSystemAvailableFeatures} and
         * {@link PackageManager#hasSystemFeature}: The device includes the lineage profiles service
         * utilized by the lineage sdk.
         */
        @SdkConstant(SdkConstant.SdkConstantType.FEATURE)
        public static final String PROFILES = "org.lineageos.profiles";

        /**
         * Feature for {@link PackageManager#getSystemAvailableFeatures} and
         * {@link PackageManager#hasSystemFeature}: The device includes the lineage app suggest service
         * utilized by the lineage sdk.
         */
        @SdkConstant(SdkConstant.SdkConstantType.FEATURE)
        public static final String APP_SUGGEST = "org.lineageos.appsuggest";

        /**
         * Feature for {@link PackageManager#getSystemAvailableFeatures} and
         * {@link PackageManager#hasSystemFeature}: The device includes the lineage telephony service
         * utilized by the lineage sdk.
         */
        @SdkConstant(SdkConstant.SdkConstantType.FEATURE)
        public static final String TELEPHONY = "org.lineageos.telephony";

        /**
         * Feature for {@link PackageManager#getSystemAvailableFeatures} and
         * {@link PackageManager#hasSystemFeature}: The device includes the lineage performance service
         * utilized by the lineage sdk.
         */
        @SdkConstant(SdkConstant.SdkConstantType.FEATURE)
        public static final String PERFORMANCE = "org.lineageos.performance";

        /**
         * Feature for {@link PackageManager#getSystemAvailableFeatures} and
         * {@link PackageManager#hasSystemFeature}: The device includes the lineage weather weather
         * service utilized by the lineage sdk.
         */
        @SdkConstant(SdkConstant.SdkConstantType.FEATURE)
        public static final String WEATHER_SERVICES = "org.lineageos.weather";

        /**
         * Feature for {@link PackageManager#getSystemAvailableFeatures} and
         * {@link PackageManager#hasSystemFeature}: The device includes the LiveDisplay service
         * utilized by the lineage sdk.
         */
        @SdkConstant(SdkConstant.SdkConstantType.FEATURE)
        public static final String LIVEDISPLAY = "org.lineageos.livedisplay";

        /**
         * Feature for {@link PackageManager#getSystemAvailableFeatures} and
         * {@link PackageManager#hasSystemFeature}: The device includes the Lineage audio extensions
         * utilized by the lineage sdk.
         */
        @SdkConstant(SdkConstant.SdkConstantType.FEATURE)
        public static final String AUDIO = "org.lineageos.audio";
    }
}
