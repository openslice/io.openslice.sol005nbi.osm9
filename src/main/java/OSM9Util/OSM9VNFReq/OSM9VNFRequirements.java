/*-
 * ========================LICENSE_START=================================
 * io.openslice.sol005nbi.osm8
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
package OSM9Util.OSM9VNFReq;

import java.util.Formatter;
import java.util.Map;

import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.Vdu;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.base.rev170228.vnfd.descriptor.VduKey;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.rev170228.vnfd.catalog.Vnfd;

public class OSM9VNFRequirements {
    public Vnfd descriptor;

    public boolean unknownFields = false;
    public int memoryMB = 0;
    public int storageGB = 0;
    public int vcpuCount = 0;
    public int vmCount = 0;
    
    public OSM9VNFRequirements()
    {}
    
    public OSM9VNFRequirements(Vnfd descriptor) {
        this.descriptor = descriptor;

        this.memoryMB = 0;
        this.storageGB = 0;
        this.vcpuCount = 0;
        this.vmCount = 0;
        Map<VduKey,Vdu> vduMap = descriptor.getVdu();
        for(Vdu vdu : vduMap.values() ) {   

    		int cnt =1;
        	if ( vdu.getCount() != null ) {
        		cnt = vdu.getCount().intValue(); 
        	}
        	
        	if (  vdu.getVmFlavor() != null ) {
                this.memoryMB +=  cnt  * vdu.getVmFlavor().getMemoryMb().intValue();
                this.storageGB += cnt * vdu.getVmFlavor().getStorageGb().intValue();
                this.vcpuCount += cnt * 1;//vdu.getVmFlavor().getVcpuCount().intValue();
                this.vmCount += cnt;
        	}
        }
    }

    public String toHTML() {
        StringBuilder stringBuilder = new StringBuilder();
        Formatter fmt = new Formatter(stringBuilder);
        fmt.format("<h3>%s</h3><br>", descriptor.getName());
        fmt.format("<b>%s: </b>%s<br>", "Vendor", descriptor.getVendor() );
        fmt.format("<b>%s: </b>%s<br>", "Version", descriptor.getVersion() );
        fmt.format("<b>%s: </b>%s<br>", "Description", descriptor.getDescription());
        fmt.format("<b>%s: </b>%d<br>", "VM Count", vmCount);
        fmt.format("<b>%s: </b>%d<br>", "vCPU Count", vcpuCount);
        fmt.format("<b>%s: </b>%d MB<br>", "Memory", memoryMB);
        fmt.format("<b>%s: </b>%d GB<br>", "Storage", storageGB);

        return stringBuilder.toString();
    }

    @Override
    public String toString() {
        return "VNFRequirements{" +
                "vnfName=" + descriptor.getName() +
                ", memoryMB=" + memoryMB +
                ", storageGB=" + storageGB +
                ", vcpuCount=" + vcpuCount +
                ", vmCount=" + vmCount +
                '}';
    }
}
