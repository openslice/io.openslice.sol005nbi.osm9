package OSM9NBIClient;

import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import org.eclipse.jdt.annotation.Nullable;
import org.json.JSONObject;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.nsd.constituent.vnfd.ConstituentVnfdKey;
//import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.project.nsd.catalog.Nsd;
//import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.vnfd.rev170228.project.vnfd.catalog.Vnfd;
//import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.project.nsd.catalog.Nsd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.Nsd;
//import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.nsd.rev170228.project.nsd.catalog.NsdBuilder;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.nsd.rev190425.nsd.NsdBuilder;
//import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.project.vnfd.rev170228.project.vnfd.catalog.Vnfd;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nfv.Vnfd;
//import org.opendaylight.yang.gen.v1.urn.etsi.osm.yang.vnfr.rev170228.project.vnfr.catalog.vnfr.VnfdBuilder;
import org.opendaylight.yang.gen.v1.urn.etsi.nfv.yang.etsi.nfv.descriptors.rev190425.nfv.VnfdBuilder;

import org.springframework.http.ResponseEntity;

import OSM9NBIClient.NSInstantiateInstanceRequestPayload.NInterface;
import OSM9NBIClient.NSInstantiateInstanceRequestPayload.Vdu;

public class OSM9NBIClientT {
	
	public static void main(String args[]) {
	    //OSM8Client OSM8Client = new OSM8Client("https://192.168.199.115:9999","admin","admin","admin");
	    OSM9Client OSM9Client = new OSM9Client("https://10.10.10.41:9999","admin","admin","admin");
	    
	    System.out.println("************************");
	    System.out.println("Getting Users");
	    System.out.println("************************");
	    OSM9Client.getUsers();
	    System.out.println("************************");
	    System.out.println("Getting VNFPackages");
	    System.out.println("************************");
	    OSM9Client.getVNFPackages();		
	    System.out.println("************************");
	    System.out.println("Getting VNFDs");
	    System.out.println("************************");
		Vnfd[] vnfds = OSM9Client.getVNFDs();
		if(vnfds!=null)
		{
			for (Vnfd v : vnfds) {
				System.out.println("=== LIST VNFDs POJO object response: " + v.toString());			
				System.out.println("=== LIST VNFDs POJO object id: " + v.getId() + ", Name: " + v.getProductName());
				Vnfd tmp_vnfd = OSM9Client.getVNFDbyID("c58b5846-6495-42ce-8dd6-35df924b54fb");
				//System.out.println("=== LIST VNFDs POJO object id: " + tmp_vnfd.getId() + ", Name: " + tmp_vnfd.getProductName());			
			}
		}
	}
//	    System.out.println("************************");
//	    System.out.println("Getting NSDescriptors");
//	    System.out.println("************************");
//	    OSM9Client.getNSDescriptors();		
//	    System.out.println("************************");
//	    System.out.println("Getting NSDs");
//	    System.out.println("************************");
//		Nsd[] nsds = OSM9Client.getNSDs();
//		for (Nsd v : nsds) {
//			System.out.println("=== LIST NSDs POJO object response: " + v.toString());
//			System.out.println("=== LIST VNFDs POJO object id: " + v.getId() + ", Name: " + v.getName());			
////			Nsd tmp_nsd = OSM8Client.getNSDbyID(v.getId());
////			System.out.println("=== LIST VNFDs POJO object id: " + tmp_nsd.getId() + ", Name: " + tmp_nsd.getName());			
//		}
//		System.out.println("Working Directory = " +System.getProperty("user.dir"));
//		
//		//Create VNFD
//	    System.out.println("************************");
//	    System.out.println("Creating VNF Instance");
//	    System.out.println("************************");
//		ResponseEntity<String> response = null;
//		response = OSM9Client.createVNFDPackage();
//		if (response == null || response.getStatusCode().is4xxClientError() || response.getStatusCode().is5xxServerError()) {
//			System.out.println("VNFD Package Creation failed.");
//			return;				
//		}
//		else
//		{
//			JSONObject obj = new JSONObject(response.getBody());
//			String vnfd_id = obj.getString("id");
//			System.out.println(response.getStatusCode()+" replied. The new VNFD Package id is :" + vnfd_id);
//		    System.out.println("Uploading VNF Package from URL");
//		    System.out.println("************************");
//		    String vnfd_package_path = "http://localhost/osm/hackfest_multivdu_vnf.tar.gz";
//			try {
//				response = OSM9Client.uploadVNFDPackageContent(vnfd_id, vnfd_package_path);
//				if (response == null || response.getStatusCode().is4xxClientError()
//						|| response.getStatusCode().is5xxServerError()) {
//					System.out.println("Upload of VNFD Package Content failed. Deleting VNFD Package."+response.getBody());
//					// Delete the package from the OSM
//					OSM9Client.deleteVNFDPackage(vnfd_id);
//					return;
//				}
//				else
//				{
//					System.out.println("VNFD Package uploaded successfully");
//				}
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
////	    System.out.println("************************");
////	    System.out.println("Uploading VNF Zip from local file");
////	    System.out.println("************************");
////		String vnfd_zip_path = "./src/main/resources/temp/cirros_vnf.tar.gz";
////		try 
////		{
////			OSM8Client.uploadVNFDZip(vnfd_id, vnfd_zip_path);
////		}
////		catch(IOException e)
////		{
////			System.out.println(e.getMessage());
////			return;
////		}
//
//	    System.out.println("Uploading NSD Package from URL");
//	    System.out.println("************************");
//	    String nsd_package_path = "http://localhost/osm/hackfest_multivdu_ns.tar.gz";
//	    String nsd_id = null;
//		response = OSM9Client.createNSDPackage();
//		if (response == null || response.getStatusCode().is4xxClientError() || response.getStatusCode().is5xxServerError()) {
//			System.out.println("NSD Package Creation failed.");
//			return;				
//		}
//		else
//		{
//			JSONObject obj = new JSONObject(response.getBody());
//			nsd_id = obj.getString("id");
//			System.out.println(response.getStatusCode()+" replied. The new NSD Package id is :" + nsd_id);
//		    System.out.println("Uploading NS Package from URL");
//		    System.out.println("************************");
//			try {
//				response = OSM9Client.uploadNSDPackageContent(nsd_id, nsd_package_path);
//				if (response == null || response.getStatusCode().is4xxClientError()
//						|| response.getStatusCode().is5xxServerError()) {
//					System.out.println("Upload of NSD Package Content failed. Deleting NSD Package.");
//					// Delete the package from the OSM
//					OSM9Client.deleteVNFDPackage(nsd_id);
//					return;
//				}
//				else
//				{
//					System.out.println("NSD Package uploaded successfully");
//				}
//			} catch (IOException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		}
//	}
//		
//		//Create NSD
//	    System.out.println("************************");
//	    System.out.println("Uploading NSD Zip from local file");
//	    System.out.println("************************");
//	    System.out.println("************************");
//	    System.out.println("Creating NSD Instance");
//	    System.out.println("************************");
//		String nsd_id = OSM8Client.createNSDPackage();
//		// TODO Handle failure acquiring a vnfd_id
//	    System.out.println("************************");
//	    System.out.println("Uploading NSD Zip");
//	    System.out.println("************************");
//		String nsd_zip_path = "C:/EP/OSMDEVOPS/OSMvFIVE_NSDs/cirros_2vnf_ns_b.tar.gz";
//		OSM8Client.uploadNSDZip(nsd_id, nsd_zip_path);		

		//Create NS Instance
//	    System.out.println("************************");
//	    System.out.println("Creating NS Instance");
//	    System.out.println("************************");
//		String vim_id="8e0929c5-4cc2-4a78-887f-d3642336e18c";
//		String ns_instance_id = OSM8Client.createNSInstance(vim_id, nsd_id);
//		if(ns_instance_id!=null)
//		{
//			OSM8Client.InstantiateNSInstance(ns_instance_id);
//		}
//		pressAnyKeyToContinue();
//		if(ns_instance_id!=null)
//		{
//			OSM8Client.deleteNSInstance(ns_instance_id);
//		}
	    	    
//		@Nullable Map<ConstituentVnfdKey, ConstituentVnfd> constituentVnfds = OSM9Client.getNSDbyID(nsd_id).getConstituentVnfd();
//		NSCreateInstanceRequestPayload nscreateinstancerequestpayload = new NSCreateInstanceRequestPayload();
//		nscreateinstancerequestpayload.setNsName("test");
//		nscreateinstancerequestpayload.setVimAccountId("4efd8bf4-5292-4634-87b7-7b3d49108b36");
//		nscreateinstancerequestpayload.setWimAccountId(false);
//		// Here we need to get the ExperimentOnBoardDescriptor based on the Experiment.
//		// An Experiment might have multiple OnBoardDescriptors if it is OnBoarded to multiple OSM MANOs.
//		// We temporarily select the first (and most probably the only one). 
//		// Otherwise the user needs to define the OSM MANO where the Experiment is OnBoarded in order to instantiate.
//		nscreateinstancerequestpayload.setNsdId(nsd_id);
//		Integer count = 0;
//		for(ConstituentVnfd constituenVnfd : constituentVnfds.values())
//		{
//			OSM9NBIClient.NSInstantiateInstanceRequestPayload.VnF vnf_tmp = nscreateinstancerequestpayload.new VnF();  
//			count=count+1;
//			vnf_tmp.setMemberVnFIndex(count.toString());
//			if(count!=2)
//				vnf_tmp.setVimAccount("4efd8bf4-5292-4634-87b7-7b3d49108b36");
//			else
//			{
//				vnf_tmp.setVimAccount("8571aa95-4c17-4d87-a865-c98126dd0241");
//				OSM9NBIClient.NSInstantiateInstanceRequestPayload.Vdu vdu_tmp = nscreateinstancerequestpayload.new Vdu();
//				vdu_tmp.setId("cirros_vnfd-VM");
//				OSM9NBIClient.NSInstantiateInstanceRequestPayload.NInterface interface_tmp = nscreateinstancerequestpayload.new NInterface();
//				interface_tmp.setName("eth0");
//				interface_tmp.setFloating_ip_required(true);
//				vdu_tmp.setInterfaceObj(new ArrayList<NInterface>());
//				vdu_tmp.getInterfaceObj().add(interface_tmp);
//				vnf_tmp.setVdu(new ArrayList<Vdu>());
//				vnf_tmp.getVdu().add(vdu_tmp);
//			}			
//			nscreateinstancerequestpayload.getVnf().add(vnf_tmp);			
//		}
//		{
//			OSM9NBIClient.NSInstantiateInstanceRequestPayload.Vld vld_tmp = nscreateinstancerequestpayload.new Vld();  
//			vld_tmp.setName("cirros_3vnf_nsd_vld1");
//			
////			IpProfileParamsBuilder ipprofileparamsbuilder = new IpProfileParamsBuilder();			
////			ipprofileparamsbuilder.setIpVersion(IpVersion.Ipv4);
////			ipprofileparamsbuilder.setSubnetAddress(new IpPrefix(new Ipv4Prefix("192.168.100.0/24")));
////			ipprofileparamsbuilder.setGatewayAddress(new IpAddress(new Ipv4Address("0.0.0.0")));
////			List<DnsServer> dnsserverlist = new ArrayList<DnsServer>();
////			DnsServerBuilder dnsserverbuilder = new DnsServerBuilder();
////			dnsserverbuilder.setAddress(new IpAddress(new Ipv4Address("8.8.8.8")));			
////			dnsserverlist.add(dnsserverbuilder.build());			
////			ipprofileparamsbuilder.setDnsServer(dnsserverlist);
////			IpProfileParams ipprofileparams_tmp = ipprofileparamsbuilder.build();
////			vld_tmp.setIpProfile(ipprofileparams_tmp);
//			
//			//vld_tmp.setVimNetworkName("OSMFIVE_selfservice01");
//			LinkedHashMap<String,String> tmp=new LinkedHashMap<>();
//			tmp.put("4efd8bf4-5292-4634-87b7-7b3d49108b36","OSMFIVE_selfservice01");			
//			tmp.put("8571aa95-4c17-4d87-a865-c98126dd0241","OSMFIVE_selfservice01");
//			vld_tmp.setVimNetworkName(tmp);
//			nscreateinstancerequestpayload.getVld().add(vld_tmp);
//			
//			OSM9NBIClient.NSInstantiateInstanceRequestPayload.Vld vld_tmp2 = nscreateinstancerequestpayload.new Vld();  
//			vld_tmp2.setName("cirros_3vnf_nsd_vld2");
//			//vld_tmp2.setVimNetworkName("OSM_mgmt_net");
//			LinkedHashMap<String,String> tmp2=new LinkedHashMap<>();
//			tmp2.put("4efd8bf4-5292-4634-87b7-7b3d49108b36","OSM_mgmt_net");
//			tmp2.put("8571aa95-4c17-4d87-a865-c98126dd0241","OSM_mgmt_net");			
//			vld_tmp2.setVimNetworkName(tmp2);
//			nscreateinstancerequestpayload.getVld().add(vld_tmp2);
//		}
//		//String tmptmp="{\"nsName\":\"test\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\",\"nsdId\":\"65a644b1-6079-44ba-a227-34577079928b\",\"vnf\":[{\"member-vnf-index\":\"1\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\"},{\"member-vnf-index\":\"2\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\"},{\"member-vnf-index\":\"3\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\"}],\"vld\":[{\"name\":\"cirros_3vnf_nsd_vld1\",\"vim-network-name\":\"OSMFIVE_selfservice01\"},{\"name\":\"cirros_3vnf_nsd_vld2\",\"vim-network-name\":\"OSM_mgmt_net\"}]}";
//		// Get Experiment ID and VIM ID and create NS Instance.
//		System.out.println("NS Instance creation payload : " + nscreateinstancerequestpayload.toJSON());
//		ResponseEntity<String> ns_instance_creation_entity = OSM9Client.createNSInstance(nscreateinstancerequestpayload.toJSON());
//		//String	test_payload="{\"nsName\":\"test\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\",\"nsdId\":\""+nsd_id+"\",\"vnf\":[{\"member-vnf-index\":\"1\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\", \"vdu\":[ {\"id\": \"mgmtVM\", \"interface\": [{\"name\": \"mgmtVM-eth0\", \"floating-ip-required\": true }]} ]},{\"member-vnf-index\":\"2\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\"}],\"vld\": [ {\"name\": \"mgmtnet\", \"vim-network-name\": \"OSMFIVE_selfservice01\"}]}";			
//		//String	test_payload="{\"nsName\":\"test\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\",\"nsdId\":\""+nsd_id+"\",\"vnf\":[{\"member-vnf-index\":\"1\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\"},{\"member-vnf-index\":\"2\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\"}],\"vld\": [ {\"name\": \"mgmtnet\", \"vim-network-name\": \"OSMFIVE_selfservice01\"}]}";	
//		//System.out.println("NS Instance creation payload : " + test_payload);
//		//ResponseEntity<String> ns_instance_creation_entity = OSM8Client.createNSInstance(test_payload);
//		// The NS Instance ID is set
//
//		// NS instance creation
//		if (ns_instance_creation_entity == null || ns_instance_creation_entity.getStatusCode().is4xxClientError()
//				|| ns_instance_creation_entity.getStatusCode().is5xxServerError()) {
//			// NS instance creation failed
//			System.out.println("NS Instance creation failed with response: "+ ns_instance_creation_entity.getBody().toString());
//		} else {
//			// String nsr_id =
//			JSONObject ns_instance_creation_entity_json_obj = new JSONObject(ns_instance_creation_entity.getBody());
//			System.out.println("NS creation succeded with "+ns_instance_creation_entity.getBody());
//			String nsd_instance_id = ns_instance_creation_entity_json_obj.getString("id");
//			// Instantiate NS Instance
//			NSInstantiateInstanceRequestPayload nsrequestpayload = new NSInstantiateInstanceRequestPayload();
//			nsrequestpayload.setNsName("test");
//			nsrequestpayload.setVimAccountId("4efd8bf4-5292-4634-87b7-7b3d49108b36");
//			nsrequestpayload.setWimAccountId(false);
//			nsrequestpayload.setNsdId(nsd_id);
//			count = 0;
//			for(ConstituentVnfd constituenVnfd : constituentVnfds.values())
//			{
//				OSM9NBIClient.NSInstantiateInstanceRequestPayload.VnF vnf_tmp = nsrequestpayload.new VnF();  
//				count=count+1;
//				vnf_tmp.setMemberVnFIndex(count.toString());
//				if(count!=2)
//					vnf_tmp.setVimAccount("4efd8bf4-5292-4634-87b7-7b3d49108b36");
//				else
//				{
//					vnf_tmp.setVimAccount("8571aa95-4c17-4d87-a865-c98126dd0241");
//					OSM9NBIClient.NSInstantiateInstanceRequestPayload.Vdu vdu_tmp = nscreateinstancerequestpayload.new Vdu();
//					vdu_tmp.setId("cirros_vnfd-VM");
//					OSM9NBIClient.NSInstantiateInstanceRequestPayload.NInterface interface_tmp = nscreateinstancerequestpayload.new NInterface();
//					interface_tmp.setName("eth0");
//					interface_tmp.setFloating_ip_required(true);
//					vdu_tmp.setInterfaceObj(new ArrayList<NInterface>());
//					vdu_tmp.getInterfaceObj().add(interface_tmp);
//					vnf_tmp.setVdu(new ArrayList<Vdu>());
//					vnf_tmp.getVdu().add(vdu_tmp);
//				}
//				nsrequestpayload.getVnf().add(vnf_tmp);			
//			}
//			{
//				OSM9NBIClient.NSInstantiateInstanceRequestPayload.Vld vld_tmp = nsrequestpayload.new Vld();  
//				vld_tmp.setName("cirros_3vnf_nsd_vld1");
//				
////				IpProfileParamsBuilder ipprofileparamsbuilder = new IpProfileParamsBuilder();			
////				ipprofileparamsbuilder.setIpVersion(IpVersion.Ipv4);
////				ipprofileparamsbuilder.setSubnetAddress(new IpPrefix(new Ipv4Prefix("192.168.100.0/24")));
////				ipprofileparamsbuilder.setGatewayAddress(new IpAddress(new Ipv4Address("0.0.0.0")));
////				List<DnsServer> dnsserverlist = new ArrayList<DnsServer>();
////				DnsServerBuilder dnsserverbuilder = new DnsServerBuilder();
////				dnsserverbuilder.setAddress(new IpAddress(new Ipv4Address("8.8.8.8")));			
////				dnsserverlist.add(dnsserverbuilder.build());			
////				ipprofileparamsbuilder.setDnsServer(dnsserverlist);
////				IpProfileParams ipprofileparams_tmp = ipprofileparamsbuilder.build();
////				vld_tmp.setIpProfile(ipprofileparams_tmp);
//				
//				//vld_tmp.setVimNetworkName("OSMFIVE_selfservice01");
//				LinkedHashMap<String,String> tmp=new LinkedHashMap<>();
//				tmp.put("4efd8bf4-5292-4634-87b7-7b3d49108b36","OSMFIVE_selfservice01");			
//				tmp.put("8571aa95-4c17-4d87-a865-c98126dd0241","OSMFIVE_selfservice01");
//				vld_tmp.setVimNetworkName(tmp);
//				nsrequestpayload.getVld().add(vld_tmp);
//				
//				OSM9NBIClient.NSInstantiateInstanceRequestPayload.Vld vld_tmp2 = nsrequestpayload.new Vld();  
//				vld_tmp2.setName("cirros_3vnf_nsd_vld2");
//				//vld_tmp2.setVimNetworkName("OSM_mgmt_net");
//				LinkedHashMap<String,String> tmp2=new LinkedHashMap<>();
//				tmp2.put("4efd8bf4-5292-4634-87b7-7b3d49108b36","OSM_mgmt_net");
//				tmp2.put("8571aa95-4c17-4d87-a865-c98126dd0241","OSM_mgmt_net");			
//				vld_tmp2.setVimNetworkName(tmp2);
//				nsrequestpayload.getVld().add(vld_tmp2);
//			}
//			System.out.println("NS Instantiation payload : " + nsrequestpayload.toJSON());
//
//			
//			//String test_payload={"nsName":"test","vimAccountId":"4efd8bf4-5292-4634-87b7-7b3d49108b36","nsdId":"acc18b58-1b82-40e8-8c35-2bfcc8293cdf","vnf":[{"member-vnf-index":"1","vimAccountId":"4efd8bf4-5292-4634-87b7-7b3d49108b36", vdu:[ {id: mgmtVM, interface: [{name: "mgmtVM-eth0", floating-ip-required: true }]} ], vld: [ {name: mgmtnet, vim-network-name: "OSMFIVE_selfservice01"} ]},{"member-vnf-index":"2","vimAccountId":"4efd8bf4-5292-4634-87b7-7b3d49108b36"}]};
//			//String test_payload="{\"nsName\":\"test\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\",\"nsdId\":\"acc18b58-1b82-40e8-8c35-2bfcc8293cdf\",\"vnf\":[{\"member-vnf-index\":\"1\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\", vdu:[ {id: mgmtVM, interface: [{name: \"mgmtVM-eth0\", floating-ip-required: true }]} ], vld: [ {name: mgmtnet, vim-network-name: \"OSMFIVE_selfservice01\"} ]},{\"member-vnf-index\":\"2\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\"}]}";
//			//String test_payload="{\"nsName\":\"test\",\"vimAccountId\":\"4efd8bf4-5292-4634-87b7-7b3d49108b36\",\"nsdId\":\""+nsd_id+"\"}";
//			//ResponseEntity<String> instantiate_ns_instance_entity = OSM8Client.instantiateNSInstance(nsd_instance_id, test_payload);
//			// Here we need the feedback
//			ResponseEntity<String> instantiate_ns_instance_entity = OSM9Client.instantiateNSInstance(nsd_instance_id, nsrequestpayload.toJSON());
//			if (instantiate_ns_instance_entity == null || instantiate_ns_instance_entity.getStatusCode().is4xxClientError() || instantiate_ns_instance_entity.getStatusCode().is5xxServerError()) {
//				System.out.println("NS Instantiation failed. Status Code:"
//						+ instantiate_ns_instance_entity.getStatusCode().toString() + ", Payload:"
//						+ ns_instance_creation_entity.getBody().toString());
//			} else {
//				// NS Instantiation starts
//				System.out.println("NS Instantiation of NS with id" + nsd_instance_id + " started.");
//				// Save the changes to DeploymentDescriptor
//			}
//		}
//		
//		
//	}
////	public OSM8Client() {	
////		// Properties file path.
////		String filePath = "osm4.properties.xml";
////		Properties prop = new Properties();
////		try (InputStream inputStream = this.getClass().getClassLoader().getResourceAsStream(filePath)) {
////			 
////			// Loading the properties.
////			prop.loadFromXML(inputStream);
//// 
////			// Getting properties
////			this.manoApiEndpoint = prop.getProperty("osm4.apiEndPoint");
////			this.manoUsername = prop.getProperty("osm4.username");
////			this.manoPassword = prop.getProperty("osm4.password");
////			this.manoProjectId = prop.getProperty("osm4.projectId");			
////		} catch (IOException ex) {
////			logger.error("Problem while reading properties file !");
////			ex.printStackTrace();
////		} 		
////		
////		OSM8ClientInit();
////	}
//	
}