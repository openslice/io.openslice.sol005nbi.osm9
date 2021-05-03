package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208;
import java.lang.Class;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.math.BigDecimal;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.monitoring.param.value.NumericConstraints;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.monitoring.param.value.TextConstraints;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * grouping monitoring-param-value {
 *   leaf value-type {
 *     type param-value-type;
 *     default INT;
 *   }
 *   container numeric-constraints {
 *     leaf min-value {
 *       type uint64;
 *     }
 *     leaf max-value {
 *       type uint64;
 *     }
 *   }
 *   container text-constraints {
 *     leaf min-length {
 *       type uint8;
 *     }
 *     leaf max-length {
 *       type uint8;
 *     }
 *   }
 *   leaf value-integer {
 *     type int64;
 *   }
 *   leaf value-decimal {
 *     type decimal64 {
 *       fraction-digits 4;
 *     }
 *   }
 *   leaf value-string {
 *     type string;
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/monitoring-param-value</i>
 *
 */
public interface MonitoringParamValue
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("monitoring-param-value");

    @Override
    Class<? extends MonitoringParamValue> implementedInterface();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.ParamValueType</code> <code>valueType</code>, or <code>null</code> if not present
     */
    @Nullable ParamValueType getValueType();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.monitoring.param.value.NumericConstraints</code> <code>numericConstraints</code>, or <code>null</code> if not present
     */
    @Nullable NumericConstraints getNumericConstraints();
    
    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.monitoring.param.value.TextConstraints</code> <code>textConstraints</code>, or <code>null</code> if not present
     */
    @Nullable TextConstraints getTextConstraints();
    
    /**
     * Current value for an integer parameter
     *
     *
     *
     * @return <code>java.lang.Long</code> <code>valueInteger</code>, or <code>null</code> if not present
     */
    @Nullable Long getValueInteger();
    
    /**
     * Current value for a decimal parameter
     *
     *
     *
     * @return <code>java.math.BigDecimal</code> <code>valueDecimal</code>, or <code>null</code> if not present
     */
    @Nullable BigDecimal getValueDecimal();
    
    /**
     * Current value for a string parameter
     *
     *
     *
     * @return <code>java.lang.String</code> <code>valueString</code>, or <code>null</code> if not present
     */
    @Nullable String getValueString();

}

