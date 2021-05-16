/*-
 * ========================LICENSE_START=================================
 * io.openslice.sol005nbi.osm9
 * %%
 * Copyright (C) 2019 openslice.io
 * %%
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * =========================LICENSE_END==================================
 */
package OSM9Util.OSM9NSReq;

import java.util.Formatter;
import java.util.List;
import java.util.Map;

import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.project.nsd.catalog.Nsd;
import org.eclipse.jdt.annotation.Nullable;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfdKey;

public class OSM9NSRequirements {
    public Nsd nsDescriptor;

    public boolean unknownFields = false;
    public int memoryMB = 0;
    public int storageGB = 0;
    public int vcpuCount = 0;
    public int vmCount = 0;

    public OSM9NSRequirements(Nsd nsDescriptor) {
        this.nsDescriptor = nsDescriptor;

        this.memoryMB = 0;
        this.storageGB = 0;
        this.vcpuCount = 0;
        this.vmCount = 0;
    }

    public String toHTML() {
        StringBuilder stringBuilder = new StringBuilder();
        Formatter fmt = new Formatter(stringBuilder);
        fmt.format("<h3>%s</h3><br>", this.nsDescriptor.getName() );
        fmt.format("<b>%s: </b>%s<br>", "Vendor", nsDescriptor.getVendor());
        fmt.format("<b>%s: </b>%s<br>", "Version", nsDescriptor.getVersion());
        fmt.format("<b>%s: </b>%s<br>", "Description", nsDescriptor.getDescription());
        if ( nsDescriptor.getConstituentVnfd() != null ) {
        	fmt.format("<b>%s: </b>%d<br>", "VNF Count", nsDescriptor.getConstituentVnfd().size());
        }
        
        fmt.format("<b>%s: </b>%d<br>", "VM Count", vmCount);
        fmt.format("<b>%s: </b>%d<br>", "vCPU Count", vcpuCount);
        fmt.format("<b>%s: </b>%d MB<br>", "Memory", memoryMB);
        fmt.format("<b>%s: </b>%d GB<br>", "Storage", storageGB);

        fmt.format("<h2>%s</h2><br>", "ConstituentVnfds" );
        if ( nsDescriptor.getConstituentVnfd() != null ) {
            @Nullable Map<ConstituentVnfdKey, ConstituentVnfd> vl = nsDescriptor.getConstituentVnfd();
            for (ConstituentVnfd constituentVnfd : vl.values()) {
                fmt.format("<b>%s: </b>%s<br>", "VnfdId", constituentVnfd.getVnfdIdRef() );            	
    		}        	
        }
        
        
        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "NSRequirements{" +
                "nsName=" + nsDescriptor.getName() +
                ", memoryMB=" + memoryMB +
                ", storageGB=" + storageGB +
                ", vcpuCount=" + vcpuCount +
                ", vmCount=" + vmCount +
                '}';
    }
}
