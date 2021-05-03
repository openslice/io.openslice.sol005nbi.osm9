package org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.monitoring.param;
import org.eclipse.jdt.annotation.NonNull;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.$YangModuleInfoImpl;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.MonitoringParam;
import org.opendaylight.yangtools.yang.binding.ChoiceIn;
import org.opendaylight.yangtools.yang.common.QName;

/**
 * Defines the type of monitoring param to be used: * vdu-monitorin-param: 
 * VDU-related metric (from NFVI) * vnf-metric: VNF-related metric (from VCA) * 
 * vdu-metric: VDU-related metric (from VCA) 
 * 
 * <p>
 * This class represents the following YANG schema fragment defined in module <b>vnfr</b>
 * <pre>
 * choice monitoring-type {
 *   case vdu-monitoring-param {
 *     container vdu-monitoring-param {
 *       leaf vdu-ref {
 *         type leafref {
 *           path ../../../vdur/id;
 *         }
 *       }
 *       leaf vdu-monitoring-param-ref {
 *         type leafref {
 *           path "../../../vdur[id = current()/../vdu-ref]/monitoring-param/id";
 *         }
 *       }
 *     }
 *   }
 *   case vnf-metric {
 *     container vnf-metric {
 *       leaf vnf-metric-name-ref {
 *         type leafref {
 *           path ../../../vnf-configuration/metrics/name;
 *         }
 *       }
 *     }
 *   }
 *   case vdu-metric {
 *     container vdu-metric {
 *       leaf vdu-ref {
 *         type leafref {
 *           path ../../../vdur/id;
 *         }
 *       }
 *       leaf vdu-metric-name-ref {
 *         type leafref {
 *           path "../../../vdur[id = current()/../vdu-ref]/vdu-configuration/metrics/name";
 *         }
 *       }
 *     }
 *   }
 * }
 * </pre>The schema path to identify an instance is
 * <i>vnfr/project/(urn:etsi:osm:yang:vnfr?revision=2017-02-28)vnfr-catalog/vnfr/monitoring-param/monitoring-type</i>
 *
 */
public interface MonitoringType
    extends
    ChoiceIn<MonitoringParam>
{



    public static final @NonNull QName QNAME = $YangModuleInfoImpl.qnameOf("monitoring-type");


}

