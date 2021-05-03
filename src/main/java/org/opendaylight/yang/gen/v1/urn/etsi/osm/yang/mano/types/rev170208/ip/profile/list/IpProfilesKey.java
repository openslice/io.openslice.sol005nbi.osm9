package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ip.profile.list;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class IpProfilesKey
 implements Identifier<IpProfiles> {
    private static final long serialVersionUID = -2490466003726565889L;
    private final String _name;


    public IpProfilesKey(String _name) {
    
        this._name = _name;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public IpProfilesKey(IpProfilesKey source) {
        this._name = source._name;
    }


    public String getName() {
        return _name;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_name);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IpProfilesKey)) {
            return false;
        }
        final IpProfilesKey other = (IpProfilesKey) obj;
        if (!Objects.equals(_name, other._name)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(IpProfilesKey.class);
        CodeHelpers.appendValue(helper, "_name", _name);
        return helper.toString();
    }
}

