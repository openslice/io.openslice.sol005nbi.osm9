package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.http.endpoints;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class HttpEndpointKey
 implements Identifier<HttpEndpoint> {
    private static final long serialVersionUID = -5430746006117903610L;
    private final String _path;


    public HttpEndpointKey(String _path) {
    
        this._path = _path;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public HttpEndpointKey(HttpEndpointKey source) {
        this._path = source._path;
    }


    public String getPath() {
        return _path;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_path);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HttpEndpointKey)) {
            return false;
        }
        final HttpEndpointKey other = (HttpEndpointKey) obj;
        if (!Objects.equals(_path, other._path)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(HttpEndpointKey.class);
        CodeHelpers.appendValue(helper, "_path", _path);
        return helper.toString();
    }
}

