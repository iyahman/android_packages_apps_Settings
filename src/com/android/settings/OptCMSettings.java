package com.android.settings;

import android.os.Bundle;

public class OptCMSettings extends SettingsPreferenceFragment{
		
		@Override
		public void onCreate(Bundle icicle) {
			super.onCreate(icicle);
			addPreferencesFromResource(R.xml.optcm_settings);
			}
}	