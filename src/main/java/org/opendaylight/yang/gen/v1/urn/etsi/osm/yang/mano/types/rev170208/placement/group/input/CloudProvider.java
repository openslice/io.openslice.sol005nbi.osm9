package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.placement.group.input;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.mano.types.rev170208.PlacementGroupInput;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>mano-types</b>
 * <pre>
 * choice cloud-provider {
 *   case openstack {
 *     container availability-zone {
 *       leaf name {
 *         type string;
 *       }
 *     }
 *     container server-group {
 *       leaf name {
 *         type string;
 *       }
 *     }
 *     uses host-aggregate;
 *   }
 *   case aws {
 *     leaf aws-construct {
 *       type empty;
 *     }
 *   }
 *   case openmano {
 *     leaf openmano-construct {
 *       type empty;
 *     }
 *   }
 *   case vsphere {
 *     leaf vsphere-construct {
 *       type empty;
 *     }
 *   }
 *   case mock {
 *     leaf mock-construct {
 *       type empty;
 *     }
 *   }
 *   case cloudsim {
 *     leaf cloudsim-construct {
 *       type empty;
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>mano-types/placement-group-input/cloud-provider</i>
 *
 */
public interface CloudProvider
    extends
    ChoiceIn<PlacementGroupInput>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("cloud-provider");


}

