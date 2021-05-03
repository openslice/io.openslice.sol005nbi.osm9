package org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.LcmOperationsConfiguration;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.terminate.vnf.op.config.Parameter;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.terminate.vnf.op.config.ParameterKey;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Timeticks;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * This information element defines attributes that affect the invocation of the 
 * TerminateVnf operation.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>etsi-nfv-descriptors</b>
 * <pre>
 * container terminate-vnf-op-config {
 *   leaf min-graceful-termination {
 *     type yang:timeticks;
 *     default 1;
 *   }
 *   leaf max-recommended-graceful-termination {
 *     type yang:timeticks;
 *   }
 *   list parameter {
 *     key key;
 *     leaf key {
 *       type string;
 *     }
 *     leaf value {
 *       type string;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>etsi-nfv-descriptors/vnfd/df/lcm-operations-configuration/terminate-vnf-op-config</i>
 * 
 * <p>To create instances of this class use {@link TerminateVnfOpConfigBuilder}.
 * @see TerminateVnfOpConfigBuilder
 *
 */
public interface TerminateVnfOpConfig
    extends
    ChildOf<LcmOperationsConfiguration>,
    Augmentable<TerminateVnfOpConfig>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("terminate-vnf-op-config");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.TerminateVnfOpConfig> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.vnfd.df.lcm.operations.configuration.TerminateVnfOpConfig.class;
    }
    
    /**
     * Minimum timeout value for graceful termination of a VNF instance.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Timeticks</code> <code>minGracefulTermination</code>, or <code>null</code> if not present
     */
    @Nullable Timeticks getMinGracefulTermination();
    
    /**
     * Maximum recommended timeout value that can be needed to gracefully terminate a
     * VNF instance of a particular type under certain conditions, such as maximum load
     * condition. This is provided by VNF provider as information for the operator
     * facilitating the selection of optimal timeout value. This value is not used as
     * constraint.
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Timeticks</code> <code>maxRecommendedGracefulTermination</code>, or <code>null</code> if not present
     */
    @Nullable Timeticks getMaxRecommendedGracefulTermination();
    
    /**
     * Array of KVP requirements for VNF-specific parameters to be passed when invoking
     * the TerminateVnf operation.
     *
     *
     *
     * @return <code>java.util.Map</code> <code>parameter</code>, or <code>null</code> if not present
     */
    @Nullable Map<ParameterKey, Parameter> getParameter();
    
    /**
     * @return <code>java.util.Map</code> <code>parameter</code>, or an empty list if it is not present
     */
    default @NonNull Map<ParameterKey, Parameter> nonnullParameter() {
        return CodeHelpers.nonnull(getParameter());
    }

}

