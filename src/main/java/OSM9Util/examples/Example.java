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
package OSM9Util.examples;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.Df;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nsd.df.VnfProfile;

import OSM9Util.OSM9ArchiveExtractor.OSM9NSExtractor;
import OSM9Util.OSM9ArchiveExtractor.OSM9VNFDExtractor;
import OSM9Util.OSM9NSReq.OSM9NSRequirements;
//import OSM9Util.OSM9VNFReq.OSM9VNFRequirements;
import OSM9Util.OSM9VNFReq.OSM9VNFRequirements;



public class Example {
	//private static URL cirrosVnfUrl;
	//private static URL hackfest1VnfUrl;
	//private static URL hackfest2VnfUrl;
	//private static URL pingPongNsUrl;
    private static URL hackfestMultiVduUrl;
    private static URL hackfestMultiVduNSUrl;

    public static void main(String[] args) throws IOException {
    	hackfestMultiVduUrl = new URL("http://localhost/osm/hackfest_multivdu_vnf.tar.gz");
    	hackfestMultiVduNSUrl = new URL("http://localhost/osm/hackfest_multivdu_ns.tar.gz");

        File hackfestMultiVduFile = File.createTempFile("hackfest_multivdu_vnf", ".tar.gz");
        File hackfestMultiVduNSFile = File.createTempFile("hackfest_multivdu_ns", ".tar.gz");
        //File pingPongNsFile = File.createTempFile("ping_pong_ns", ".tar.gz");

        hackfestMultiVduFile.deleteOnExit();
        hackfestMultiVduNSFile.deleteOnExit();

        System.out.println("Downloading VNF");

        FileUtils.copyURLToFile(hackfestMultiVduUrl, hackfestMultiVduFile);
        FileUtils.copyURLToFile(hackfestMultiVduNSUrl, hackfestMultiVduNSFile);

        System.out.println("Calculating requirements...");

        OSM9VNFDExtractor vnfHackfestMultiVduExtract = new OSM9VNFDExtractor(hackfestMultiVduFile.getPath());
    	Vnfd vnfHackfestMultiVduDescriptor = vnfHackfestMultiVduExtract.extractVnfdDescriptor();
        System.out.println(vnfHackfestMultiVduDescriptor.toString());
        OSM9VNFRequirements vnfHackfestMultiVduRequirements = new OSM9VNFRequirements(vnfHackfestMultiVduDescriptor);
        System.out.println(vnfHackfestMultiVduRequirements.toHTML());
        OSM9NSExtractor nsExtractor = new OSM9NSExtractor(hackfestMultiVduNSFile);
        Nsd hackfestMultiVduNSDescriptor = nsExtractor.extractNsDescriptor();
        OSM9NSRequirements hackfestMultiVduNSRequirements = new OSM9NSRequirements(hackfestMultiVduNSDescriptor);

		for (Df v : hackfestMultiVduNSDescriptor.getDf().values()) {
			for( VnfProfile q : v.getVnfProfile().values())
			{
				System.out.println("setMemberVNFIndex: "+Integer.parseInt(q.getId()));
				System.out.println("setVNFDIdRef: "+(String) q.getVnfdId());
			}
		}        
    }
}
