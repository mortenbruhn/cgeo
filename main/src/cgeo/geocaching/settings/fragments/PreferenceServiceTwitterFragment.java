package cgeo.geocaching.settings.fragments;

import cgeo.geocaching.R;
import cgeo.geocaching.settings.Settings;

import android.os.Bundle;

import androidx.preference.PreferenceFragmentCompat;

public class PreferenceServiceTwitterFragment extends PreferenceFragmentCompat {
    @Override
    public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
        setPreferencesFromResource(R.xml.preferences_services_twitter, rootKey);

        findPreference(getString(R.string.pref_fakekey_twitter_authorization))
            .setTitle(getString(Settings.isTwitterLoginValid()
                ? R.string.settings_reauthorize
                : R.string.settings_authorize));
    }
}
