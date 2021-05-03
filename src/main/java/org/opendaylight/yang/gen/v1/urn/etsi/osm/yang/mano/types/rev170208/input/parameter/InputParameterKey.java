package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.input.parameter;
import com.google.common.base.MoreObjects;
import java.lang.Override;
import java.lang.String;
import java.util.Objects;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.Identifier;

public class InputParameterKey
 implements Identifier<InputParameter> {
    private static final long serialVersionUID = -4216449907967238088L;
    private final String _xpath;


    public InputParameterKey(String _xpath) {
    
        this._xpath = _xpath;
    }
    
    /**
     * Creates a copy from Source Object.
     *
     * @param source Source object
     */
    public InputParameterKey(InputParameterKey source) {
        this._xpath = source._xpath;
    }


    public String getXpath() {
        return _xpath;
    }


    @Override
    public int hashCode() {
        return CodeHelpers.wrapperHashCode(_xpath);
    }

    @Override
    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InputParameterKey)) {
            return false;
        }
        final InputParameterKey other = (InputParameterKey) obj;
        if (!Objects.equals(_xpath, other._xpath)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        final MoreObjects.ToStringHelper helper = MoreObjects.toStringHelper(InputParameterKey.class);
        CodeHelpers.appendValue(helper, "_xpath", _xpath);
        return helper.toString();
    }
}

