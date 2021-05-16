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
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Vnfd;

import OSM9Util.OSM9ArchiveExtractor.OSM9VNFDExtractor;
//import OSM9Util.OSM9VNFReq.OSM9VNFRequirements;
import OSM9Util.OSM9VNFReq.OSM9VNFRequirements;



public class Example {
	//private static URL cirrosVnfUrl;
	//private static URL hackfest1VnfUrl;
	//private static URL hackfest2VnfUrl;
	//private static URL pingPongNsUrl;
    private static URL hackfestMultiVduUrl;

    public static void main(String[] args) throws IOException {
    	hackfestMultiVduUrl = new URL("http://localhost/osm/hackfest_multivdu_vnf.tar.gz");
        //pingPongNsUrl = new URL("https://osm-download.etsi.org/ftp/osm-4.0-four/3rd-hackfest/packages/hackfest_2_vnfd.tar.gz");

        File hackfestMultiVduFile = File.createTempFile("hackfest_multivdu_vnf", ".tar.gz");
        //File pingPongNsFile = File.createTempFile("ping_pong_ns", ".tar.gz");

        hackfestMultiVduFile.deleteOnExit();
        //pingPongNsFile.deleteOnExit();

        System.out.println("Downloading VNF");

        FileUtils.copyURLToFile(hackfestMultiVduUrl, hackfestMultiVduFile);
        //FileUtils.copyURLToFile(pingPongNsUrl, pingPongNsFile);

        System.out.println("Calculating requirements...");

        OSM9VNFDExtractor vnfHackfestMultiVduExtract = new OSM9VNFDExtractor(hackfestMultiVduFile.getPath());
        try
        {
        	Vnfd vnfHackfestMultiVduDescriptor = vnfHackfestMultiVduExtract.extractVnfdDescriptor();
            System.out.println(vnfHackfestMultiVduDescriptor.toString());
            OSM9VNFRequirements vnfHackfestMultiVduRequirements = new OSM9VNFRequirements(vnfHackfestMultiVduDescriptor);
            System.out.println(vnfHackfestMultiVduRequirements.toHTML());
//        NSExtractor nsExtractor = new NSExtractor(pingPongNsFile);
//        Nsd pingPongNsDescriptor = nsExtractor.extractNsDescriptor();
//        NSRequirements pingPongNsRequirements = new NSRequirements(pingPongNsDescriptor);

        System.out.println("Presenting requirements:");

        System.out.println("Cirros VNF: " + vnfHackfestMultiVduRequirements.toString());
//        System.out.println("Ping Pong NS: " + pingPongNsRequirements.toHTML());

        System.out.println("Unknown fields:");

//        System.out.println("Ping VNF: " + pingVnfRequirements.unknownFields);
//        System.out.println("Pong VNF: " + pongVnfRequirements.unknownFields);
//        System.out.println("Ping Pong NS: " + pingPongNsRequirements.unknownFields);
        

//        System.out.println("Vnfd = " + vnfHackfestMultiVduDescriptor.toString() );
//        System.out.println("Ping VNF Icon : " + vnfHackfestMultiVduDescriptor.getIconfilePath() );
//        System.out.println("Vnfd = " + pongVnfDescriptor.toString() );
//        System.out.println("Pong VNF Icon : " + vnfPongExtract.getIconfilePath() );
        
//        System.out.println("Nsd = " + pingPongNsDescriptor.toString() );
//        System.out.println("Ping Pong Icon : " + nsExtractor.getIconfilePath() );
        }
        catch(Exception e)
        {
        	System.out.println(e.getMessage());
        }
        
    }
}
