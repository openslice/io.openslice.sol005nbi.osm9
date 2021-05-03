package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.vlr;
import java.lang.Class;
import java.lang.Object;
import java.lang.Override;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.Vlr;
import org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid;
import org.opendaylight.yangtools.yang.binding.Augmentable;
import org.opendaylight.yangtools.yang.binding.ChildOf;
import org.opendaylight.yangtools.yang.binding.Identifiable;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * A list of references to connection points.
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsr</b>
 * <pre>
 * list vnfr-connection-point-ref {
 *   key vnfr-id;
 *   leaf vnfr-id {
 *     type leafref {
 *       path ../../../../../vnfr:vnfr-catalog/vnfr:vnfr/vnfr:id;
 *     }
 *   }
 *   leaf connection-point {
 *     type leafref {
 *       path "../../../../../vnfr:vnfr-catalog/vnfr:vnfr[vnfr:id = current()/../vnfr-id]/vnfr:connection-point/vnfr:name";
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>nsr/project/(urn:etsi:osm:yang:nsr?revision=2017-02-08)ns-instance-opdata/nsr/vlr/vnfr-connection-point-ref</i>
 * 
 * <p>To create instances of this class use {@link VnfrConnectionPointRefBuilder}.
 * @see VnfrConnectionPointRefBuilder
 * @see VnfrConnectionPointRefKey
 *
 */
public interface VnfrConnectionPointRef
    extends
    ChildOf<Vlr>,
    Augmentable<VnfrConnectionPointRef>,
    Identifiable<VnfrConnectionPointRefKey>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("vnfr-connection-point-ref");

    @Override
    default Class<org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef> implementedInterface() {
        return org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsr.rev170208.project.ns.instance.opdata.nsr.vlr.VnfrConnectionPointRef.class;
    }
    
    /**
     * A reference to a vnfr
     *
     *
     *
     * @return <code>org.opendaylight.yang.gen.v1.urn.ietf.params.xml.ns.yang.ietf.yang.types.rev130715.Uuid</code> <code>vnfrId</code>, or <code>null</code> if not present
     */
    @Nullable Uuid getVnfrId();
    
    /**
     * A reference to a connection point name in a vnfr
     *
     *
     *
     * @return <code>java.lang.Object</code> <code>connectionPoint</code>, or <code>null</code> if not present
     */
    @Nullable Object getConnectionPoint();
    
    @Override
    VnfrConnectionPointRefKey key();

}

