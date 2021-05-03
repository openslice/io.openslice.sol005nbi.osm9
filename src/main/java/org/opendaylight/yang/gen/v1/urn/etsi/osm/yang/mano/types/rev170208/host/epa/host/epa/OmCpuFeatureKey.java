package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.host.epa.host.epa;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class OmCpuFeatureKey
 implements Identifier<OmCpuFeature> {
    private static final long serialVersionUID = 8816526446650637089L;
    private final String _feature;


    public OmCpuFeatureKey(String _feature) {
    
        this._feature = _feature;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public OmCpuFeatureKey(OmCpuFeatureKey source) {
        this._feature = source._feature;
    }


    public String getFeature() {
        return _feature;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_feature);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof OmCpuFeatureKey)) {
            return false;
        }
        final OmCpuFeatureKey other = (OmCpuFeatureKey) obj;
        if (!Objects.equals(_feature, other._feature)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(OmCpuFeatureKey.class);
        CodeHelpers.appendValue(helper, "_feature", _feature);
        return helper.toString();
    }
}

