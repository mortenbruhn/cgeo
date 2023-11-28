package cgeo.geocaching.unifiedmap.tileproviders;

import cgeo.geocaching.CgeoApplication;
import cgeo.geocaching.R;

import android.net.Uri;

import androidx.core.util.Pair;

import static org.oscim.map.Viewport.MIN_ZOOM_LEVEL;

class OsmDeSource extends AbstractMapsforgeOnlineTileProvider {
    OsmDeSource() {
        super("OSM.de", Uri.parse("https://tile.openstreetmap.de"), "/{Z}/{X}/{Y}.png", MIN_ZOOM_LEVEL, 18, new Pair<>(CgeoApplication.getInstance().getString(R.string.map_attribution_openstreetmapde_html), true));
    }
}
