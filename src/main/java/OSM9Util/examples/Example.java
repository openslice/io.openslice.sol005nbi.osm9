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
package OSM9Util.examples;

import java.io.File;
import java.io.IOException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

import OSM9Util.OSM9ArchiveExtractor.OSM9VNFDExtractor;
import OSM9Util.OSM9VNFReq.OSM9VNFRequirements;

import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfd.rev170228.vnfd.catalog.Vnfd;


public class Example {
    private static URL cirrosVnfUrl;
    private static URL hackfest1VnfUrl;
    private static URL hackfest2VnfUrl;
    private static URL pingPongNsUrl;

    public static void main(String[] args) throws IOException {
        cirrosVnfUrl = new URL("https://osm-download.etsi.org/ftp/osm-4.0-four/3rd-hackfest/packages/cirros_vnf.tar.gz");
        hackfest1VnfUrl = new URL("https://osm-download.etsi.org/ftp/osm-4.0-four/3rd-hackfest/packages/hackfest_1_vnfd.tar.gz");
        hackfest2VnfUrl = new URL("https://osm-download.etsi.org/ftp/osm-4.0-four/3rd-hackfest/packages/hackfest_2_vnfd.tar.gz");
        //pingPongNsUrl = new URL("https://osm-download.etsi.org/ftp/osm-4.0-four/3rd-hackfest/packages/hackfest_2_vnfd.tar.gz");

        File cirrosVnfFile = File.createTempFile("cirros_vnf", ".tar.gz");
        File hackfest1VnfFile = File.createTempFile("hackfest_1_vnfd", ".tar.gz");
        File hackfest2VnfFile = File.createTempFile("hackfest_2_vnfd", ".tar.gz");
        //File pingPongNsFile = File.createTempFile("ping_pong_ns", ".tar.gz");

        cirrosVnfFile.deleteOnExit();
        hackfest1VnfFile.deleteOnExit();
        hackfest2VnfFile.deleteOnExit();
        //pingPongNsFile.deleteOnExit();

        System.out.println("Downloading Ping VNF, Pong VNF and PingPong NS");

        FileUtils.copyURLToFile(cirrosVnfUrl, cirrosVnfFile);
        FileUtils.copyURLToFile(hackfest1VnfUrl, hackfest1VnfFile);
        FileUtils.copyURLToFile(hackfest2VnfUrl, hackfest2VnfFile);
        //FileUtils.copyURLToFile(pingPongNsUrl, pingPongNsFile);

        System.out.println("Calculating requirements...");

        OSM9VNFDExtractor vnfCirrosExtract = new OSM9VNFDExtractor(cirrosVnfFile.getPath());
        Vnfd cirrosVnfDescriptor = vnfCirrosExtract.extractVnfdDescriptor();
        OSM9VNFRequirements cirrosVnfRequirements = new OSM9VNFRequirements(cirrosVnfDescriptor);

//        OSM8VNFDExtractor vnfPongExtract = new OSM4VNFDExtractor(pongVnfFile);
//        Vnfd pongVnfDescriptor = vnfPongExtract.extractVnfdDescriptor();
//        OSM4VNFRequirements pongVnfRequirements = new OSM4VNFRequirements(pongVnfDescriptor);

//        List<VNFDescriptor> vnfDescriptorList = new ArrayList<>();
//        vnfDescriptorList.add(pingVnfDescriptor);
//        vnfDescriptorList.add(pongVnfDescriptor);

//        NSExtractor nsExtractor = new NSExtractor(pingPongNsFile);
//        Nsd pingPongNsDescriptor = nsExtractor.extractNsDescriptor();
//        NSRequirements pingPongNsRequirements = new NSRequirements(pingPongNsDescriptor);

        System.out.println("Presenting requirements:");

        System.out.println("Cirros VNF: " + cirrosVnfRequirements.toHTML());
//        System.out.println("Ping Pong NS: " + pingPongNsRequirements.toHTML());

        System.out.println("Unknown fields:");

//        System.out.println("Ping VNF: " + pingVnfRequirements.unknownFields);
//        System.out.println("Pong VNF: " + pongVnfRequirements.unknownFields);
//        System.out.println("Ping Pong NS: " + pingPongNsRequirements.unknownFields);
        

        System.out.println("Vnfd = " + cirrosVnfDescriptor.toString() );
        System.out.println("Ping VNF Icon : " + vnfCirrosExtract.getIconfilePath() );
//        System.out.println("Vnfd = " + pongVnfDescriptor.toString() );
//        System.out.println("Pong VNF Icon : " + vnfPongExtract.getIconfilePath() );
        
//        System.out.println("Nsd = " + pingPongNsDescriptor.toString() );
//        System.out.println("Ping Pong Icon : " + nsExtractor.getIconfilePath() );
        
    }
}
