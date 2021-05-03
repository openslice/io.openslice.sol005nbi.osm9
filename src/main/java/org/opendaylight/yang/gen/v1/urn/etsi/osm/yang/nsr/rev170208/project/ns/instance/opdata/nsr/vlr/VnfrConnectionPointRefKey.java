package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.vlr;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class VnfrConnectionPointRefKey
 implements Identifier<VnfrConnectionPointRef> {
    private static final long serialVersionUID = 4973557907395950516L;
    private final Uuid _vnfrId;


    public VnfrConnectionPointRefKey(Uuid _vnfrId) {
    
        this._vnfrId = _vnfrId;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public VnfrConnectionPointRefKey(VnfrConnectionPointRefKey source) {
        this._vnfrId = source._vnfrId;
    }


    public Uuid getVnfrId() {
        return _vnfrId;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_vnfrId);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VnfrConnectionPointRefKey)) {
            return false;
        }
        final VnfrConnectionPointRefKey other = (VnfrConnectionPointRefKey) obj;
        if (!Objects.equals(_vnfrId, other._vnfrId)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(VnfrConnectionPointRefKey.class);
        CodeHelpers.appendValue(helper, "_vnfrId", _vnfrId);
        return helper.toString();
    }
}

