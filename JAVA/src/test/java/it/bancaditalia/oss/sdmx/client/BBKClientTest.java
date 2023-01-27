/* Copyright 2010,2014 Bank Of Italy
*
* Licensed under the EUPL, Version 1.1 or - as soon they
* will be approved by the European Commission - subsequent
* versions of the EUPL (the "Licence");
* You may not use this work except in compliance with the
* Licence.
* You may obtain a copy of the Licence at:
*
*
* http://ec.europa.eu/idabc/eupl
*
* Unless required by applicable law or agreed to in
* writing, software distributed under the Licence is
* distributed on an "AS IS" basis,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
* express or implied.
* See the Licence for the specific language governing
* permissions and limitations under the Licence.
*/
package it.bancaditalia.oss.sdmx.client;

import it.bancaditalia.oss.sdmx.exceptions.SdmxException;



public class BBKClientTest {
	public static void main(String[] args) throws SdmxException{
//		System.err.println(SdmxClientHandler.getFlows("BBK", null));
		System.err.println(SdmxClientHandler.getFlow("BBK", "BBASV"));
//		System.err.println(SdmxClientHandler.getDSDIdentifier("BBK", "BBASV"));
//		System.err.println(SdmxClientHandler.getDimensions("BBK", "BBASV"));
//		System.err.println(SdmxClientHandler.getDataFlowStructure("BBK", "BBASV"));
//		System.err.println(SdmxClientHandler.getCodes("BBK", "BBASV", "BBK_ACS2_REF_AREA"));
//		System.err.println(SdmxClientHandler.getTimeSeries("UIS", "DEM_ECO.DEC.LCU_USD._Z._Z.AF", null, null));

	}
}
