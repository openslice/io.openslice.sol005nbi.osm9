package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.host.epa.host.epa;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.CpuFeatureType;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class CpuFeatureKey
 implements Identifier<CpuFeature> {
    private static final long serialVersionUID = -7227280100134741618L;
    private final CpuFeatureType _feature;


    public CpuFeatureKey(CpuFeatureType _feature) {
    
        this._feature = _feature;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public CpuFeatureKey(CpuFeatureKey source) {
        this._feature = source._feature;
    }


    public CpuFeatureType getFeature() {
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
        if (!(obj instanceof CpuFeatureKey)) {
            return false;
        }
        final CpuFeatureKey other = (CpuFeatureKey) obj;
        if (!Objects.equals(_feature, other._feature)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(CpuFeatureKey.class);
        CodeHelpers.appendValue(helper, "_feature", _feature);
        return helper.toString();
    }
}

