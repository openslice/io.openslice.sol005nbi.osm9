package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yangtools.yang.binding.DataRoot;

/**
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>nsd</b>
 * <pre>
 * module nsd {
 *   namespace urn:etsi:osm:yang:nsd;
 *   prefix nsd;
 *   import vnfd {
 *     prefix vnfd;
 *   }
 *   import nsd-base {
 *     prefix nsd-base;
 *   }
 *   import mano-types {
 *     prefix manotypes;
 *   }
 *   import ietf-inet-types {
 *     prefix inet;
 *   }
 *   revision 2017-02-28 {
 *   }
 *   revision 2014-10-27 {
 *   }
 *   grouping nsd-constituent-vnfd {
 *     list constituent-vnfd {
 *       key member-vnf-index;
 *       leaf member-vnf-index {
 *         type string;
 *       }
 *       leaf vnfd-id-ref {
 *         type leafref {
 *           path /vnfd:vnfd-catalog/vnfd:vnfd/vnfd:id;
 *         }
 *       }
 *       leaf start-by-default {
 *         type boolean;
 *         default true;
 *       }
 *     }
 *   }
 *   grouping nsd-vld {
 *     list vld {
 *       key id;
 *       uses nsd-base:nsd-vld-common;
 *       list vnfd-connection-point-ref {
 *         key "member-vnf-index-ref vnfd-connection-point-ref";
 *         leaf member-vnf-index-ref {
 *           type leafref {
 *             path ../../../constituent-vnfd/member-vnf-index;
 *           }
 *         }
 *         leaf vnfd-connection-point-ref {
 *           type leafref {
 *             path "/vnfd:vnfd-catalog/vnfd:vnfd[vnfd:id = current()/../vnfd-id-ref]/vnfd:connection-point/vnfd:name";
 *           }
 *         }
 *         leaf vnfd-id-ref {
 *           type leafref {
 *             path "../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *           }
 *         }
 *         leaf ip-address {
 *           type inet:ip-address;
 *         }
 *       }
 *     }
 *   }
 *   grouping nsd-vnf-dependency {
 *     list vnf-dependency {
 *       key vnf-source-ref;
 *       leaf vnf-source-ref {
 *         type leafref {
 *           path /vnfd:vnfd-catalog/vnfd:vnfd/vnfd:id;
 *         }
 *       }
 *       leaf vnf-depends-on-ref {
 *         type leafref {
 *           path /vnfd:vnfd-catalog/vnfd:vnfd/vnfd:id;
 *         }
 *       }
 *     }
 *   }
 *   grouping nsd-placement-groups {
 *     list placement-groups {
 *       key name;
 *       uses manotypes:placement-group-info;
 *       list member-vnfd {
 *         key member-vnf-index-ref;
 *         leaf member-vnf-index-ref {
 *           type leafref {
 *             path ../../../constituent-vnfd/member-vnf-index;
 *           }
 *         }
 *         leaf vnfd-id-ref {
 *           type leafref {
 *             path "../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *           }
 *         }
 *       }
 *     }
 *   }
 *   grouping nsd-monitoring-param {
 *     list monitoring-param {
 *       key id;
 *       uses nsd-base:monitoring-param-common;
 *       list vnfd-monitoring-param {
 *         key "member-vnf-index-ref vnfd-monitoring-param-ref";
 *         leaf vnfd-id-ref {
 *           type leafref {
 *             path "../../../constituent-vnfd[member-vnf-index = current()/../member-vnf-index-ref]/vnfd-id-ref";
 *           }
 *         }
 *         leaf vnfd-monitoring-param-ref {
 *           type leafref {
 *             path "/vnfd:vnfd-catalog/vnfd:vnfd[vnfd:id = current()/../vnfd-id-ref]/vnfd:monitoring-param/vnfd:id";
 *           }
 *         }
 *         leaf member-vnf-index-ref {
 *           type leafref {
 *             path ../../../constituent-vnfd/member-vnf-index;
 *           }
 *         }
 *       }
 *     }
 *   }
 *   container nsd-catalog {
 *     leaf schema-version {
 *       type string;
 *       default v3.0;
 *     }
 *     list nsd {
 *       key id;
 *       uses nsd-base:nsd-descriptor-common;
 *       uses nsd-vld;
 *       uses nsd-constituent-vnfd;
 *       uses nsd-placement-groups;
 *       uses nsd-vnf-dependency;
 *       uses nsd-monitoring-param;
 *     }
 *   }
 * }
 * </pre>
 *
 */
public interface NsdData
    extends
    DataRoot
{




    /**
     * @return <code>org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.nsd.rev170228.NsdCatalog</code> <code>nsdCatalog</code>, or <code>null</code> if not present
     */
    @Nullable NsdCatalog getNsdCatalog();

}

