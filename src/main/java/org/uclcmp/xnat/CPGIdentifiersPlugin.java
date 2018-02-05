package org.uclcmp.xnat;

import org.nrg.framework.annotations.XnatPlugin;
import org.springframework.context.annotation.Bean;
import org.nrg.xdat.om.XnatProjectdata;
import org.nrg.xnat.DicomObjectIdentifier;
import org.nrg.xnat.utils.XnatUserProvider;


@XnatPlugin(value = "cpgDicomIdentifiersPlugin", name = "CPG Dicom Identifiers")
public class CPGIdentifiersPlugin {
	
	@Bean
	public DicomObjectIdentifier<XnatProjectdata> sABREv3DicomObjectIdentifier(final XnatUserProvider receivedFileUserProvider){
		return new SABREv3DicomObjectIdentifier();
	}

	@Bean
	public DicomObjectIdentifier<XnatProjectdata> INSIGHT46DicomObjectIdentifier(final XnatUserProvider receivedFileUserProvider){
		return new INSIGHT46DicomObjectIdentifier();
	}

}
