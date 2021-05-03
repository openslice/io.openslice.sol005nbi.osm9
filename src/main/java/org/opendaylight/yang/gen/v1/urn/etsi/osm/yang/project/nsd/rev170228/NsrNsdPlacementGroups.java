package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228;
import java.lang.Class;
import java.lang.Override;
import java.util.Map;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsr.nsd.placement.groups.PlacementGroups;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsr.nsd.placement.groups.PlacementGroupsKey;
import org.opendaylight.yangtools.yang.binding.CodeHelpers;
import org.opendaylight.yangtools.yang.binding.DataObject;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>project-nsd</b>
 * <pre>
 * grouping nsr-nsd-placement-groups {
 *   list placement-groups {
 *     key name;
 *     uses manotypes:placement-group-info;
 *     list member-vnfd {
 *       key member-vnf-index-ref;
 *       leaf member-vnf-index-ref {
 *         type leafref {
 *           path ../../../constituent-vnfd/member-vnf-index;
 *         }
 *       }
 *       leaf vnfd-id-ref {
 *         type leafref {
 *           path ../../../../../../project-vnfd:vnfd-catalog/project-vnfd:vnfd/project-vnfd:id;
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>project-nsd/nsr-nsd-placement-groups</i>
 *
 */
public interface NsrNsdPlacementGroups
    extends
    DataObject
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("nsr-nsd-placement-groups");

    @Override
    Class<? extends NsrNsdPlacementGroups> implementedInterface();
    
    /**
     * List of placement groups at NS level
     *
     *
     *
     * @return <code>java.util.Map</code> <code>placementGroups</code>, or <code>null</code> if not present
     */
    @Nullable Map<PlacementGroupsKey, PlacementGroups> getPlacementGroups();
    
    /**
     * @return <code>java.util.Map</code> <code>placementGroups</code>, or an empty list if it is not present
     */
    default @NonNull Map<PlacementGroupsKey, PlacementGroups> nonnullPlacementGroups() {
        return CodeHelpers.nonnull(getPlacementGroups());
    }

}

