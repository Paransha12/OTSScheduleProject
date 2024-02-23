/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
/******************************************************************
* Licensed Materials - Property of IBM and/or HCL
* Copyright IBM Corporation 2013, 2017. All Rights Reserved.
* Copyright HCL Technologies Ltd. 2017, 2020.  All Rights Reserved.
* 
* U.S. Government Users Restricted Rights - Use, duplication or 
* disclosure restricted by GSA ADP Schedule Contract with IBM Corp.
******************************************************************/
/* TestScript.template - Suitable for collaborative code generation */
package test;

import com.ibm.rational.test.lt.datacorrelation.execution.action.VariableAction;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.DataVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCArray;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDCCoreVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataCorrelationVar;
import com.ibm.rational.test.lt.datacorrelation.execution.harvest.IDataHarvester;
import com.ibm.rational.test.lt.datacorrelation.execution.proto.ProtoAdapterHandler;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.DataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.IDataSub;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.ISubRule;
import com.ibm.rational.test.lt.datacorrelation.execution.sub.SubRule;
import com.ibm.rational.test.lt.execution.core.impl.LTTestScript;
import com.ibm.rational.test.lt.execution.http.IBasicAuthentication;
import com.ibm.rational.test.lt.execution.http.IConnectionRecord;
import com.ibm.rational.test.lt.execution.http.IHTTPRequest;
import com.ibm.rational.test.lt.execution.http.IHTTPSessionTypes;
import com.ibm.rational.test.lt.execution.http.INtlmAuthenticationContext;
import com.ibm.rational.test.lt.execution.http.ISSLInfo;
import com.ibm.rational.test.lt.execution.http.connection.IConnectionLimitsAlgorithm;
import com.ibm.rational.test.lt.execution.http.impl.ConfigConnection;
import com.ibm.rational.test.lt.execution.http.impl.DynamicHTTPRequestsContainer;
import com.ibm.rational.test.lt.execution.http.impl.DynamicRequestContainer;
import com.ibm.rational.test.lt.execution.http.impl.HTTPAction;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPage;
import com.ibm.rational.test.lt.execution.http.impl.HTTPParallel;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPostData;
import com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk;
import com.ibm.rational.test.lt.execution.http.impl.HTTPRequest;
import com.ibm.rational.test.lt.execution.http.impl.HTTPThink;
import com.ibm.rational.test.lt.execution.http.impl.INextActionGenerator;
import com.ibm.rational.test.lt.execution.http.impl.PerHostPortConnectionAlgorithm;
import com.ibm.rational.test.lt.execution.http.impl.RequestHeaderData;
import com.ibm.rational.test.lt.execution.http.impl.SSLInfo;
import com.ibm.rational.test.lt.execution.http.tes.*;
import com.ibm.rational.test.lt.execution.http.util.ConnectionRecordFactory;
import com.ibm.rational.test.lt.execution.http.util.CookieCacheUtil;
import com.ibm.rational.test.lt.execution.http.util.HTTPDataArea;
import com.ibm.rational.test.lt.execution.http.util.PageCacheUtil;
import com.ibm.rational.test.lt.execution.http.vp.IHTTPStatusCodeVP;
import com.ibm.rational.test.lt.execution.http.vp.impl.HTTPStatusCodeVP;
import com.ibm.rational.test.lt.execution.protocol.IProxyServerInfo;
import com.ibm.rational.test.lt.execution.protocol.impl.HTTPTestScriptHelper;
import com.ibm.rational.test.lt.kernel.IDataArea;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKAction;
import com.ibm.rational.test.lt.kernel.action.IKTimeoutControl;
import com.ibm.rational.test.lt.kernel.action.impl.KAction;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.ITestExecutionServices;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

@SuppressWarnings("all")
public class CatsCollection_Test_A1EED2387D5E07E0F304B06636356238 extends LTTestScript  {

    static ProtoAdapterHandler pa = new ProtoAdapterHandler();
    static {           
        pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.protocol.core.CoreProtoAdapter", "coreAdapter");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPPostDataChunk");
pa.addPA("com.ibm.rational.test.lt.datacorrelation.execution.http.HTTPActionAdapter", "com.ibm.rational.test.lt.execution.http.impl.HTTPAction");
    }
	private IDataCorrelationVar[] dcVars = DataCorrelationVar.getArrayDCVars(30);
	private DataVar[] vars = new DataVar[2];
	
    
    
private HTTPTestScriptHelper httpTestScriptHelper;

	private HTTPTestScriptHelper getHTTPTest() {
		return httpTestScriptHelper;
	}

	
	public CatsCollection_Test_A1EED2387D5E07E0F304B06636356238(IContainer container, String invocationId) {
		super(container, "CatsCollection", invocationId, "A1EED2387D5E07E0F304B06636356238", "/PerformanceOTSProject/CatsCollection.testsuite", "D:/Workspaces/HPT_OTS/PerformanceOTSProject/CatsCollection.testsuite");
		setArmEnabled(false);
		stopAtYourConvenience=false;
		this.httpTestScriptHelper = new HTTPTestScriptHelper(this);
        setTimeoutDuration(240000);
        setTimeoutScheme(IKTimeoutControl.CONTINUE);

	}

    public void execute() {
    	try {
				CookieCacheUtil.clearCookieCache((ITestExecutionServices)this);
	PageCacheUtil.clearPageCache((ITestExecutionServices)this);
	PageCacheUtil.setCacheEmulation((ITestExecutionServices)this, true);

	    		if (!isScheduleRun()) setThinkMax(2000);
	
	if (!isScheduleRun() && !isCompoundTestRun()){
this.addEventBehavior(new RPTEventStructure(new HTTPPageTitleVPEvent(), new RPTContinueEvent("Page title verification failed"), 1, "Page title verification failed"));
	this.addEventBehavior(new RPTEventStructure(new HTTPResponseCodeVPEvent(), new RPTContinueEvent("Response code verification failed"), 1, "Response code verification failed"));
	this.addEventBehavior(new RPTEventStructure(new HTTPResponseSizeVPEvent(), new RPTContinueEvent("Response size verification failed"), 1, "Response size verification failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTFailVPEvent(), new RPTContinueEvent("Content Verification Point failed"), 1, "Content Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), new RPTContinueEvent("Connection failed"), 1, "Connection failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), new RPTContinueEvent("Authentication failed"), 1, "Authentication failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(), new RPTStopUserEvent("End of dataset reached"), 1, "End of dataset reached"));
	this.addEventBehavior(new RPTEventStructure(new RPTTestVerdictFailedEvent(), new RPTContinueEvent("Test verdict was set to fail"), 2, "Test verdict was set to fail"));
	this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), new RPTContinueEvent("Failed to extract reference"), 1, "Failed to extract reference"));
	this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), new RPTContinueEvent("Substitution failed"), 1, "Substitution failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), new RPTContinueEvent("Timeout"), 1, "Timeout"));
	this.addEventBehavior(new RPTEventStructure(new RPTDroppedConnectionEvent(), new RPTContinueEvent("Server dropped connection"), 1, "Server dropped connection"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), new RPTContinueEvent("Custom Verification Point failed"), 1, "Custom Verification Point failed"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeAlertEvent(), new RPTContinueEvent("Custom Code reported an Alert"), 0, "Custom Code reported an Alert"));
	this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(), new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1, "Custom Code reported an unhandled exception"));
	}
	
	
	        	this.add(varAction_1(this));
	this.add(confCon_1(this));
	this.add(page_1(this));
	this.add(page_2(this));
	this.add(page_3(this));
	this.add(page_4(this));
	this.add(page_5(this));
	this.add(page_6(this));
			this.httpTestScriptHelper.executeHelper();

	    } catch (Throwable e) {
		     log("Test Execution: CatsCollection_Test_A1EED2387D5E07E0F304B06636356238 ",e);
	    } finally {
	        super.execute();
		}	    
    }
    
	public void preFinish() {
		this.httpTestScriptHelper.preFinishHelper();

		super.preFinish();
	}
	
	public void stop() {
		
		super.stop();
	}	
	
	private VariableAction varAction_1(final IContainer parent) {

	VariableAction vc = new VariableAction(parent, "", "A1EED2387D5E07FEF304B06636356238");	
			vars[0] = new DataVar("CatsCollection_Host", "jpetstore.aspectran.com", IDataArea.TEST, "IGNORE", false, false);

	
		vars[1] = new DataVar("CatsCollection_Host_Port", "443", IDataArea.TEST, "IGNORE", false, false);

		
	vc.add(vars);
	return vc;
	
}

	private IKAction confCon_1(final IContainer parent) {
		IKAction action = new KAction(parent) {
			@Override
			public void execute() {
				ISSLInfo sslInfo = new SSLInfo("TLSv1.3", "ON", "TLS_AES_256_GCM_SHA384");
				IProxyServerInfo proxyServerInfo = null;
				
				
				ConfigConnection conn = new ConfigConnection(
					parent,
					"Config_1",
					(String)(vars[0].getValue()== null?"jpetstore.aspectran.com": (String)vars[0].getValue()),  // host name
					Integer.parseInt((String)(vars[1].getValue()== null?"443": (String)vars[1].getValue())), 
					sslInfo,  // SSL info
					null,  // NTLM info
					proxyServerInfo,  // proxy server info
					"jpetstore.aspectran.com",  // unsubstituted host name
					Integer.parseInt((String)("443")) 
				);
				ConfigConnection.storeConfigConnection(this, conn);
				finish();
			}
		};
		return action;		
	}

private HTTPPage page_1(final IContainer parent) {
			HTTPThink think = new HTTPThink(0, 1, parent, parent, "A1EED2387D6E0D7EF304B06636356238");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "HomePage", "A1EED2387D6E0D7EF304B06636356238") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_1(this, true, "A1EED2387D6E0D70F304B06636356238", true, true,
						"Config_1", "catalog",	"/catalog/", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_1(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED2387D6E0D8CF304B06636356238", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(12);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:122.0) Gecko/20100101 Firefox/122.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_ga_PBGW9BF7P6=GS1.1.1704984150.4.1.1704984201.0.0.0;_ga=GA1.1.17167025.1700136565;cf_clearance=ajo3sdLgJJlGgk5Lu3WXv1TWm9e99u_nzu79NIMaK10-1708683554-1.0-Ab0oWGiVhRZw+3EXgz1D8GdDLJucahOchGztyFVGzhd64pLRKylRpsUKwZeU+CkpfbfKJgTut6eu+9V8c/iG6Nw=", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "none", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_1 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_1);

	harvestContainer_1.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[0], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)", null, 0, false);
	IDataSub subContainer_1 = new DataSub();
	reqAction.addDataSub(subContainer_1);

		ISubRule sub_0 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[0], false, "Host_12", null, 0, false);
	subContainer_1.addSubInstruction(sub_0);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED2387D6E3480F304B06636356238",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_2(final IContainer parent) {
			HTTPThink think = new HTTPThink(5775, 1, parent, parent, "A1EED2387D95448EF304B06636356238");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Cats", "A1EED2387D95448EF304B06636356238") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_2(this, true, "A1EED2387D954480F304B06636356238", false, true,
						"Config_1", "CATS",	"/catalog/categories/CATS", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_2(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED2387D954492F304B06636356238", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:122.0) Gecko/20100101 Firefox/122.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/catalog/", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_ga_PBGW9BF7P6=GS1.1.1704984150.4.1.1704984201.0.0.0;_ga=GA1.1.17167025.1700136565;cf_clearance=ajo3sdLgJJlGgk5Lu3WXv1TWm9e99u_nzu79NIMaK10-1708683554-1.0-Ab0oWGiVhRZw+3EXgz1D8GdDLJucahOchGztyFVGzhd64pLRKylRpsUKwZeU+CkpfbfKJgTut6eu+9V8c/iG6Nw=", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_2 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_2);

	harvestContainer_2.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[1], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_2", null, 0, false);
	IDataSub subContainer_2 = new DataSub();
	reqAction.addDataSub(subContainer_2);

		ISubRule sub_1 = new SubRule("req_hdr_Referer_1", 0, 40, false, (IDCCoreVar)dcVars[0], false, "Referer_11", null, 0, false);
	subContainer_2.addSubInstruction(sub_1);
		ISubRule sub_2 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[0], false, "Host_11", null, 0, false);
	subContainer_2.addSubInstruction(sub_2);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED2387D954495F304B06636356238",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_3(final IContainer parent) {
			HTTPThink think = new HTTPThink(5023, 1, parent, parent, "A1EED2387DA85750F304B06636356238");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Persian", "A1EED2387DA85750F304B06636356238") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_3(this, true, "A1EED2387D954480F304B06636356238", false, true,
						"Config_1", "FL-DLH-02",	"/catalog/products/FL-DLH-02", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_3(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED2387DA85754F304B06636356238", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:122.0) Gecko/20100101 Firefox/122.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/catalog/categories/CATS", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_ga_PBGW9BF7P6=GS1.1.1704984150.4.1.1704984201.0.0.0;_ga=GA1.1.17167025.1700136565;cf_clearance=ajo3sdLgJJlGgk5Lu3WXv1TWm9e99u_nzu79NIMaK10-1708683554-1.0-Ab0oWGiVhRZw+3EXgz1D8GdDLJucahOchGztyFVGzhd64pLRKylRpsUKwZeU+CkpfbfKJgTut6eu+9V8c/iG6Nw=", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_3 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_3);

	harvestContainer_3.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[2], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_3", null, 0, false);
	harvestContainer_3.addHarvestInstruction ("resp_content", dcVars[3], "\\?itemId=(.*?)\"", 2, 2, 0, 0, false, "itemId_2", null, 0, false);
	IDataSub subContainer_3 = new DataSub();
	reqAction.addDataSub(subContainer_3);

		ISubRule sub_3 = new SubRule("req_hdr_Referer_1", 0, 55, false, (IDCCoreVar)dcVars[1], false, "Referer_10", null, 0, false);
	subContainer_3.addSubInstruction(sub_3);
		ISubRule sub_4 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[0], false, "Host_10", null, 0, false);
	subContainer_3.addSubInstruction(sub_4);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED2387DA85757F304B06636356238",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_4(final IContainer parent) {
			HTTPThink think = new HTTPThink(6170, 1, parent, parent, "A1EED2387DAAC850F304B06636356238");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "AddToCart", "A1EED2387DAAC850F304B06636356238") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_4(this, true, "A1EED2387D954480F304B06636356238", false, false,
						"Config_1", "addItemToCart",	"/cart/addItemToCart?itemId=EST-17", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_5(this, false, "A1EED2387D954480F304B06636356238", false, true,
						"Config_1", "viewCart",	"/cart/viewCart", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_6(this, false, "A1EED2387D954480F304B06636356238", false, false,
						"Config_1", "updateCartQuantities",	"/cart/updateCartQuantities", true, false), 2614, 100, "A1EED2387DB46540F304B06636356238", 3);
				httpParallel.addRequest(0, request_7(this, false, "A1EED2387D954480F304B06636356238", false, false,
						"Config_1", "viewCart{1}",	"/cart/viewCart", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_4(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED2387DAAC854F304B06636356238", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:122.0) Gecko/20100101 Firefox/122.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/catalog/products/FL-DLH-02", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_ga_PBGW9BF7P6=GS1.1.1704984150.4.1.1704984201.0.0.0;_ga=GA1.1.17167025.1700136565;cf_clearance=ajo3sdLgJJlGgk5Lu3WXv1TWm9e99u_nzu79NIMaK10-1708683554-1.0-Ab0oWGiVhRZw+3EXgz1D8GdDLJucahOchGztyFVGzhd64pLRKylRpsUKwZeU+CkpfbfKJgTut6eu+9V8c/iG6Nw=", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_4 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_4);

	harvestContainer_4.addHarvestInstruction ("resp_hdr_Location_1", dcVars[4], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location", null, 0, false);
	IDataSub subContainer_4 = new DataSub();
	reqAction.addDataSub(subContainer_4);

		ISubRule sub_5 = new SubRule("req_uri", 27, 6, true, (IDCCoreVar)dcVars[3], false, "itemId", null, 0, false);
	subContainer_4.addSubInstruction(sub_5);
		ISubRule sub_6 = new SubRule("req_hdr_Referer_1", 0, 58, false, (IDCCoreVar)dcVars[2], false, "Referer_9", null, 0, false);
	subContainer_4.addSubInstruction(sub_6);
		ISubRule sub_7 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[0], false, "Host_9", null, 0, false);
	subContainer_4.addSubInstruction(sub_7);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED2387DAAC857F304B06636356238",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_5(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED2387DB46540F304B06636356238", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:122.0) Gecko/20100101 Firefox/122.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/catalog/products/FL-DLH-02", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_ga_PBGW9BF7P6=GS1.1.1704984150.4.1.1704984201.0.0.0;_ga=GA1.1.17167025.1700136565;cf_clearance=ajo3sdLgJJlGgk5Lu3WXv1TWm9e99u_nzu79NIMaK10-1708683554-1.0-Ab0oWGiVhRZw+3EXgz1D8GdDLJucahOchGztyFVGzhd64pLRKylRpsUKwZeU+CkpfbfKJgTut6eu+9V8c/iG6Nw=", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_5 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_5);

	harvestContainer_5.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[5], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_4", null, 0, false);
	harvestContainer_5.addHarvestInstruction ("resp_content", dcVars[6], " value=\"(.*?)\"", 1, 1, 0, 0, false, "value", null, 0, false);
	IDataSub subContainer_5 = new DataSub();
	reqAction.addDataSub(subContainer_5);

		ISubRule sub_8 = new SubRule("req_hdr_Referer_1", 0, 58, false, (IDCCoreVar)dcVars[2], false, "Referer_8", null, 0, false);
	subContainer_5.addSubInstruction(sub_8);
		ISubRule sub_9 = new SubRule("req_uri", 0, 14, false, (IDCCoreVar)dcVars[4], false, "AddToCart_url_2", null, 0, false);
	subContainer_5.addSubInstruction(sub_9);
		ISubRule sub_10 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[0], false, "Host_8", null, 0, false);
	subContainer_5.addSubInstruction(sub_10);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED2387DAAC854F304B06636356238"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED2387DB46543F304B06636356238",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_6(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED2387DC79F20F304B06636356238", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:122.0) Gecko/20100101 Firefox/122.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/cart/viewCart", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_ga_PBGW9BF7P6=GS1.1.1704984150.4.1.1704984201.0.0.0;_ga=GA1.1.17167025.1700136565;cf_clearance=ajo3sdLgJJlGgk5Lu3WXv1TWm9e99u_nzu79NIMaK10-1708683554-1.0-Ab0oWGiVhRZw+3EXgz1D8GdDLJucahOchGztyFVGzhd64pLRKylRpsUKwZeU+CkpfbfKJgTut6eu+9V8c/iG6Nw=", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_1(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_6 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_6);

	harvestContainer_6.addHarvestInstruction ("resp_hdr_Location_1", dcVars[7], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_2", null, 0, false);
	IDataSub subContainer_7 = new DataSub();
	reqAction.addDataSub(subContainer_7);

		ISubRule sub_12 = new SubRule("req_hdr_Referer_1", 0, 45, false, (IDCCoreVar)dcVars[5], false, "Referer_7", null, 0, false);
	subContainer_7.addSubInstruction(sub_12);
		ISubRule sub_13 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[0], false, "Host_7", null, 0, false);
	subContainer_7.addSubInstruction(sub_13);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED2387DB46540F304B06636356238"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED2387DB46540F304B06636356238"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED2387DC79F23F304B06636356238",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_1(HTTPPostData postData) {
				StringBuffer strBuf_1 = new StringBuffer();
strBuf_1.append("EST-17=1");
String requestData_1 = strBuf_1.toString();
			
	HTTPPostDataChunk pdc_0 = new HTTPPostDataChunk("A1EED2387DC79F7CF304B06636356238", postData, requestData_1, "UTF-8", 1, 8);
	postData.addDataChunk(pdc_0);

	IDataSub subContainer_6 = new DataSub();
	pdc_0.addDataSub(subContainer_6);

		ISubRule sub_11 = new SubRule("req_content", 7, 1, true, (IDCCoreVar)dcVars[6], false, "EST-17", null, 0, false);
	subContainer_6.addSubInstruction(sub_11);
	



	}

	public HTTPAction request_7(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED2387DC79FB8F304B06636356238", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:122.0) Gecko/20100101 Firefox/122.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/cart/viewCart", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_ga_PBGW9BF7P6=GS1.1.1704984150.4.1.1704984201.0.0.0;_ga=GA1.1.17167025.1700136565;cf_clearance=ajo3sdLgJJlGgk5Lu3WXv1TWm9e99u_nzu79NIMaK10-1708683554-1.0-Ab0oWGiVhRZw+3EXgz1D8GdDLJucahOchGztyFVGzhd64pLRKylRpsUKwZeU+CkpfbfKJgTut6eu+9V8c/iG6Nw=", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_7 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_7);

	harvestContainer_7.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[8], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_5", null, 0, false);
	IDataSub subContainer_8 = new DataSub();
	reqAction.addDataSub(subContainer_8);

		ISubRule sub_14 = new SubRule("req_hdr_Referer_1", 0, 45, false, (IDCCoreVar)dcVars[5], false, "Referer_6", null, 0, false);
	subContainer_8.addSubInstruction(sub_14);
		ISubRule sub_15 = new SubRule("req_uri", 0, 14, false, (IDCCoreVar)dcVars[7], false, "AddToCart_url", null, 0, false);
	subContainer_8.addSubInstruction(sub_15);
		ISubRule sub_16 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[0], false, "Host_6", null, 0, false);
	subContainer_8.addSubInstruction(sub_16);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED2387DB46540F304B06636356238"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED2387DB46540F304B06636356238"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED2387DC79F20F304B06636356238"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED2387DC79FBBF304B06636356238",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_5(final IContainer parent) {
			HTTPThink think = new HTTPThink(5917, 1, parent, parent, "A1EED2387DD5F700F304B06636356238");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Payment", "A1EED2387DD5F700F304B06636356238") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_8(this, true, "A1EED2387D954480F304B06636356238", false, false,
						"Config_1", "newOrderForm",	"/order/newOrderForm", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_9(this, false, "A1EED2387D954480F304B06636356238", false, true,
						"Config_1", "signonForm",	"/account/signonForm?referer=%2Forder%2FnewOrderForm", true, false), 0, 100, "null", 3);
				httpParallel.addRequest(0, request_10(this, false, "A1EED2387D954480F304B06636356238", false, false,
						"Config_1", "signon",	"/account/signon", true, false), 2277, 100, "A1EED2387DD5F788F304B06636356238", 3);
				httpParallel.addRequest(0, request_11(this, false, "A1EED2387D954480F304B06636356238", false, false,
						"Config_1", "newOrderForm{1}",	"/order/newOrderForm", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_8(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED2387DD5F704F304B06636356238", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:122.0) Gecko/20100101 Firefox/122.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/cart/viewCart", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_ga_PBGW9BF7P6=GS1.1.1704984150.4.1.1704984201.0.0.0;_ga=GA1.1.17167025.1700136565;cf_clearance=ajo3sdLgJJlGgk5Lu3WXv1TWm9e99u_nzu79NIMaK10-1708683554-1.0-Ab0oWGiVhRZw+3EXgz1D8GdDLJucahOchGztyFVGzhd64pLRKylRpsUKwZeU+CkpfbfKJgTut6eu+9V8c/iG6Nw=", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_8 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_8);

	harvestContainer_8.addHarvestInstruction ("resp_hdr_Location_1", dcVars[9], "http.{0,1}://.*?(/[^?]*)/", 1, 1, 0, 0, false, "Location_3", null, 0, false);
	harvestContainer_8.addHarvestInstruction ("resp_hdr_Location_1", dcVars[10], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_4", null, 0, false);
	IDataSub subContainer_9 = new DataSub();
	reqAction.addDataSub(subContainer_9);

		ISubRule sub_17 = new SubRule("req_hdr_Referer_1", 0, 45, false, (IDCCoreVar)dcVars[8], false, "Referer_5", null, 0, false);
	subContainer_9.addSubInstruction(sub_17);
		ISubRule sub_18 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[0], false, "Host_5", null, 0, false);
	subContainer_9.addSubInstruction(sub_18);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED2387DD5F707F304B06636356238",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_9(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED2387DD5F788F304B06636356238", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:122.0) Gecko/20100101 Firefox/122.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/cart/viewCart", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_ga_PBGW9BF7P6=GS1.1.1704984150.4.1.1704984201.0.0.0;_ga=GA1.1.17167025.1700136565;cf_clearance=ajo3sdLgJJlGgk5Lu3WXv1TWm9e99u_nzu79NIMaK10-1708683554-1.0-Ab0oWGiVhRZw+3EXgz1D8GdDLJucahOchGztyFVGzhd64pLRKylRpsUKwZeU+CkpfbfKJgTut6eu+9V8c/iG6Nw=", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_9 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_9);

	harvestContainer_9.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[11], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_6", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[12], "<[[^>].]*?name=\"referer\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_2", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[13], "<[[^>].]*?name=\"username\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_3", null, 0, false);
	harvestContainer_9.addHarvestInstruction ("resp_content", dcVars[14], "<[[^>].]*?name=\"password\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_4", null, 0, false);
	IDataSub subContainer_10 = new DataSub();
	reqAction.addDataSub(subContainer_10);

		ISubRule sub_19 = new SubRule("req_hdr_Referer_1", 0, 45, false, (IDCCoreVar)dcVars[8], false, "Referer_4", null, 0, false);
	subContainer_10.addSubInstruction(sub_19);
		ISubRule sub_20 = new SubRule("req_uri", 0, 51, false, (IDCCoreVar)dcVars[10], false, "Payment_url_2", null, 0, false);
	subContainer_10.addSubInstruction(sub_20);
		ISubRule sub_21 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[0], false, "Host_4", null, 0, false);
	subContainer_10.addSubInstruction(sub_21);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED2387DD5F704F304B06636356238"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED2387DD5F78BF304B06636356238",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}

	public HTTPAction request_10(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED2387DE6BFE0F304B06636356238", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:122.0) Gecko/20100101 Firefox/122.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "59", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/account/signonForm?referer=%2Forder%2FnewOrderForm", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_ga_PBGW9BF7P6=GS1.1.1704984150.4.1.1704984201.0.0.0;_ga=GA1.1.17167025.1700136565;cf_clearance=ajo3sdLgJJlGgk5Lu3WXv1TWm9e99u_nzu79NIMaK10-1708683554-1.0-Ab0oWGiVhRZw+3EXgz1D8GdDLJucahOchGztyFVGzhd64pLRKylRpsUKwZeU+CkpfbfKJgTut6eu+9V8c/iG6Nw=", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_2(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_10 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_10);

	harvestContainer_10.addHarvestInstruction ("resp_hdr_Location_1", dcVars[15], "http.{0,1}://.*?(/[^?]*)/", 1, 1, 0, 0, false, "Location_5", null, 0, false);
	harvestContainer_10.addHarvestInstruction ("resp_hdr_Location_1", dcVars[16], "http.{0,1}://.*?(/.*)", 1, 0, 0, 0, false, "Location_6", null, 0, false);
	IDataSub subContainer_12 = new DataSub();
	reqAction.addDataSub(subContainer_12);

		ISubRule sub_25 = new SubRule("req_hdr_Referer_1", 0, 82, false, (IDCCoreVar)dcVars[11], false, "Referer_3", null, 0, false);
	subContainer_12.addSubInstruction(sub_25);
		ISubRule sub_26 = new SubRule("req_uri", 0, 8, false, (IDCCoreVar)dcVars[9], false, "/account", null, 0, false);
	subContainer_12.addSubInstruction(sub_26);
		ISubRule sub_27 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[0], false, "Host_3", null, 0, false);
	subContainer_12.addSubInstruction(sub_27);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED2387DD5F788F304B06636356238"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED2387DD5F704F304B06636356238"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED2387DD5F788F304B06636356238"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED2387DE6BFE3F304B06636356238",
			true,
			false
		);
		
		req.setExpectedResponseCode(302);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(302)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("https//");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_2(HTTPPostData postData) {
				StringBuffer strBuf_2 = new StringBuffer();
strBuf_2.append("referer=%2Forder%2FnewOrderForm&username=j2ee&password=j2ee");
String requestData_2 = strBuf_2.toString();
			
	HTTPPostDataChunk pdc_1 = new HTTPPostDataChunk("A1EED2387DE6C03CF304B06636356238", postData, requestData_2, "UTF-8", 31, 59);
	postData.addDataChunk(pdc_1);

	IDataSub subContainer_11 = new DataSub();
	pdc_1.addDataSub(subContainer_11);

		ISubRule sub_22 = new SubRule("req_content", 55, 4, true, (IDCCoreVar)dcVars[14], false, "password", null, 0, false);
	subContainer_11.addSubInstruction(sub_22);
		ISubRule sub_23 = new SubRule("req_content", 41, 4, true, (IDCCoreVar)dcVars[13], false, "username", null, 0, false);
	subContainer_11.addSubInstruction(sub_23);
		ISubRule sub_24 = new SubRule("req_content", 8, 23, true, (IDCCoreVar)dcVars[12], false, "referer", null, 0, false);
	subContainer_11.addSubInstruction(sub_24);
	



	}

	public HTTPAction request_11(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED2387DE6C078F304B06636356238", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(13);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:122.0) Gecko/20100101 Firefox/122.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/account/signonForm?referer=%2Forder%2FnewOrderForm", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_ga_PBGW9BF7P6=GS1.1.1704984150.4.1.1704984201.0.0.0;_ga=GA1.1.17167025.1700136565;cf_clearance=ajo3sdLgJJlGgk5Lu3WXv1TWm9e99u_nzu79NIMaK10-1708683554-1.0-Ab0oWGiVhRZw+3EXgz1D8GdDLJucahOchGztyFVGzhd64pLRKylRpsUKwZeU+CkpfbfKJgTut6eu+9V8c/iG6Nw=", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));

				
			
					
		IBasicAuthentication basicAuth = null;
			IDataHarvester harvestContainer_11 = new DataHarvester();
	reqAction.addDataHarvester (harvestContainer_11);

	harvestContainer_11.addHarvestInstruction ("resp_hdr_Referer-RPT-Generated (read-only)_1", dcVars[17], ".*", 1, 0, 0, 0, false, "Referer-RPT-Generated (read-only)_7", null, 0, false);
	harvestContainer_11.addHarvestInstruction ("resp_content", dcVars[18], "<[[^>].]*?name=\"paymentForm\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_5", null, 0, false);
	harvestContainer_11.addHarvestInstruction ("resp_content", dcVars[19], "<[[^>].]*?name=\"billingForm\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_6", null, 0, false);
	harvestContainer_11.addHarvestInstruction ("resp_content", dcVars[20], "<[[^>].]*?name=\"creditCard\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_7", null, 0, false);
	harvestContainer_11.addHarvestInstruction ("resp_content", dcVars[21], "<[[^>].]*?name=\"expiryDate\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_8", null, 0, false);
	harvestContainer_11.addHarvestInstruction ("resp_content", dcVars[22], "<[[^>].]*?name=\"billToFirstName\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_9", null, 0, false);
	harvestContainer_11.addHarvestInstruction ("resp_content", dcVars[23], "<[[^>].]*?name=\"billToLastName\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_10", null, 0, false);
	harvestContainer_11.addHarvestInstruction ("resp_content", dcVars[24], "<[[^>].]*?name=\"billAddress1\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_11", null, 0, false);
	harvestContainer_11.addHarvestInstruction ("resp_content", dcVars[25], "<[[^>].]*?name=\"billAddress2\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_12", null, 0, false);
	harvestContainer_11.addHarvestInstruction ("resp_content", dcVars[26], "<[[^>].]*?name=\"billCity\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_13", null, 0, false);
	harvestContainer_11.addHarvestInstruction ("resp_content", dcVars[27], "<[[^>].]*?name=\"billState\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_14", null, 0, false);
	harvestContainer_11.addHarvestInstruction ("resp_content", dcVars[28], "<[[^>].]*?name=\"billZip\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_15", null, 0, false);
	harvestContainer_11.addHarvestInstruction ("resp_content", dcVars[29], "<[[^>].]*?name=\"billCountry\"(([[^>].]*?value=\"(.*?)\")|(?:[[^>].]*?>))", 1, 1, 0, 0, false, "value_16", null, 0, false);
	IDataSub subContainer_13 = new DataSub();
	reqAction.addDataSub(subContainer_13);

		ISubRule sub_28 = new SubRule("req_hdr_Referer_1", 0, 82, false, (IDCCoreVar)dcVars[11], false, "Referer_2", null, 0, false);
	subContainer_13.addSubInstruction(sub_28);
		ISubRule sub_29 = new SubRule("req_uri", 0, 19, false, (IDCCoreVar)dcVars[16], false, "Payment_url", null, 0, false);
	subContainer_13.addSubInstruction(sub_29);
		ISubRule sub_30 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[0], false, "Host_2", null, 0, false);
	subContainer_13.addSubInstruction(sub_30);
	


		
				// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED2387DE6BFE0F304B06636356238"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED2387DD5F788F304B06636356238"), 3);
		// wait on another action
		reqAction.addSemaphoreWait((IKAction)myPage.getActionMap().get("A1EED2387DD5F788F304B06636356238"), 3);		
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"GET",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			null,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED2387DE6C07BF304B06636356238",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(true);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
private HTTPPage page_6(final IContainer parent) {
			HTTPThink think = new HTTPThink(6157, 1, parent, parent, "A1EED2387DF035C0F304B06636356238");
	parent.add(think);
	
		HTTPPage page = new HTTPPage(parent, "Logout", "A1EED2387DF035C0F304B06636356238") {
			
			public void execute() {   
				
	
	
	
	
			             
			{ // Parallal Block Start
				HTTPParallel httpParallel = new HTTPParallel(1, this);
				this.add(httpParallel);

				// httpParallel.addRequest(int serial, HTTPAction action, int actionDelay, String firstCharSemID) 
				httpParallel.addRequest(0, request_12(this, true, "A1EED2387D954480F304B06636356238", true, true,
						"Config_1", "newOrder",	"/order/newOrder", true, false), 0, 100, "null", 3);
			} // Parallal Block End 

			
				super.execute();
			}
		};
		
		
		page.setRemoveDelaysFromPageResponseTimes(false);
		page.setArmEnabled(false);  
		return page;
	}

	public HTTPAction request_12(IContainer parent, boolean isFirstInParallelGroup, String parallelGroup, 
					boolean connectionClose, boolean isPrimary, String connConfigName, String actionName, String url, boolean isURLRelative, boolean useSubstitutedUriInReports) 
	{	
		
		HTTPAction reqAction = new HTTPAction(parent, actionName, "A1EED2387DF035C4F304B06636356238", getHTTPTest());
		HTTPPage myPage = reqAction.getPage();
		
		// add the action to the page-global action map for possible semaphore use
		myPage.getActionMap().put(reqAction.getId(), reqAction);
				
			
	
	
	
	
		
		ArrayList<RequestHeaderData> headers = new ArrayList<RequestHeaderData>(16);
					
		headers.add(new RequestHeaderData("Host", "jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("User-Agent", "Mozilla/5.0 (Windows NT 10.0; Win64; x64; rv:122.0) Gecko/20100101 Firefox/122.0", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept", "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,*/*;q=0.8", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Language", "en-US,en;q=0.5", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Accept-Encoding", "gzip, deflate, br", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Type", "application/x-www-form-urlencoded", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Content-Length", "276", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Origin", "https://jpetstore.aspectran.com", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Connection", "keep-alive", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Referer", "https://jpetstore.aspectran.com/order/newOrderForm", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Cookie", "_ga_PBGW9BF7P6=GS1.1.1704984150.4.1.1704984201.0.0.0;_ga=GA1.1.17167025.1700136565;cf_clearance=ajo3sdLgJJlGgk5Lu3WXv1TWm9e99u_nzu79NIMaK10-1708683554-1.0-Ab0oWGiVhRZw+3EXgz1D8GdDLJucahOchGztyFVGzhd64pLRKylRpsUKwZeU+CkpfbfKJgTut6eu+9V8c/iG6Nw=", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Upgrade-Insecure-Requests", "1", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Dest", "document", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Mode", "navigate", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-Site", "same-origin", "UTF-8", 1));			
		headers.add(new RequestHeaderData("Sec-Fetch-User", "?1", "UTF-8", 1));

				
			HTTPPostData postData = new HTTPPostData(reqAction, 0);
	
			postDataClass_3(postData);
				
		IBasicAuthentication basicAuth = null;
			IDataSub subContainer_15 = new DataSub();
	reqAction.addDataSub(subContainer_15);

		ISubRule sub_43 = new SubRule("req_hdr_Referer_1", 0, 50, false, (IDCCoreVar)dcVars[17], false, "Referer", null, 0, false);
	subContainer_15.addSubInstruction(sub_43);
		ISubRule sub_44 = new SubRule("req_uri", 0, 6, false, (IDCCoreVar)dcVars[15], false, "/order", null, 0, false);
	subContainer_15.addSubInstruction(sub_44);
		ISubRule sub_45 = new SubRule("req_hdr_Host_1", 0, 23, false, (IDCCoreVar)vars[0], false, "Host", null, 0, false);
	subContainer_15.addSubInstruction(sub_45);
	


		
				
		IConnectionRecord serverConnection = ConnectionRecordFactory.find(parent, 
				parallelGroup, connConfigName,
				true, // close connection at test boundary,
				null, 0, 1); // error behavior
		reqAction.io2=serverConnection.getHttp2ioConnector();
		IHTTPRequest req = new HTTPRequest(
			"POST",	// method
			"https",  // protocol - http or https
			url, isURLRelative,
			"1.1",	// version
			headers,
			IHTTPSessionTypes.STANDARD,
			0, // delay
			isPrimary,
			postData,// post data
			basicAuth,
			serverConnection,
			reqAction,
			"UTF-8",
			"UTF-8",
			"A1EED2387DF035C7F304B06636356238",
			true,
			false
		);
		
		req.setExpectedResponseCode(200);
		req.setConnectionClose(connectionClose);
			
	req.addVerificationPoint(new HTTPStatusCodeVP(new HashSet<Integer>( Arrays.asList(200)), IHTTPStatusCodeVP.SMART_MATCH, null, 0));

		reqAction.setFirstRequestInParallel(isFirstInParallelGroup);
		reqAction.setRequest(req);
		reqAction.setArmEnabled(false);
		reqAction.setResponseContentType("text/html;charset=UTF-8");
		reqAction.setConnectionGroup(parallelGroup);
		reqAction.setDoesHarvesterRequireContent(false);
		reqAction.setUseSubstitutedUriInReports(useSubstitutedUriInReports);
		
		
		return reqAction;
	}
	private void postDataClass_3(HTTPPostData postData) {
				StringBuffer strBuf_3 = new StringBuffer();
strBuf_3.append("paymentForm=true&billingForm=true&cardType=Visa&creditCard=9");
strBuf_3.append("99999999999999&expiryDate=12%2F2019&billToFirstName=Marcelo&");
strBuf_3.append("billToLastName=Marcelo&billAddress1=Gral+Flores+1234&billAdd");
strBuf_3.append("ress2=Gral+Flores+1234&billCity=Montevideo&billState=Montevi");
strBuf_3.append("deo&billZip=1212&billCountry=Uruguay");
String requestData_3 = strBuf_3.toString();
			
	HTTPPostDataChunk pdc_2 = new HTTPPostDataChunk("A1EED2387DF0AB42F304B06636356238", postData, requestData_3, "UTF-8", 109, 276);
	postData.addDataChunk(pdc_2);

	IDataSub subContainer_14 = new DataSub();
	pdc_2.addDataSub(subContainer_14);

		ISubRule sub_31 = new SubRule("req_content", 269, 7, true, (IDCCoreVar)dcVars[29], false, "billCountry", null, 0, false);
	subContainer_14.addSubInstruction(sub_31);
		ISubRule sub_32 = new SubRule("req_content", 252, 4, true, (IDCCoreVar)dcVars[28], false, "billZip", null, 0, false);
	subContainer_14.addSubInstruction(sub_32);
		ISubRule sub_33 = new SubRule("req_content", 233, 10, true, (IDCCoreVar)dcVars[27], false, "billState", null, 0, false);
	subContainer_14.addSubInstruction(sub_33);
		ISubRule sub_34 = new SubRule("req_content", 212, 10, true, (IDCCoreVar)dcVars[26], false, "billCity", null, 0, false);
	subContainer_14.addSubInstruction(sub_34);
		ISubRule sub_35 = new SubRule("req_content", 186, 16, true, (IDCCoreVar)dcVars[25], false, "billAddress2", null, 0, false);
	subContainer_14.addSubInstruction(sub_35);
		ISubRule sub_36 = new SubRule("req_content", 156, 16, true, (IDCCoreVar)dcVars[24], false, "billAddress1", null, 0, false);
	subContainer_14.addSubInstruction(sub_36);
		ISubRule sub_37 = new SubRule("req_content", 135, 7, true, (IDCCoreVar)dcVars[23], false, "billToLastName", null, 0, false);
	subContainer_14.addSubInstruction(sub_37);
		ISubRule sub_38 = new SubRule("req_content", 112, 7, true, (IDCCoreVar)dcVars[22], false, "billToFirstName", null, 0, false);
	subContainer_14.addSubInstruction(sub_38);
		ISubRule sub_39 = new SubRule("req_content", 86, 9, true, (IDCCoreVar)dcVars[21], false, "expiryDate", null, 0, false);
	subContainer_14.addSubInstruction(sub_39);
		ISubRule sub_40 = new SubRule("req_content", 59, 15, true, (IDCCoreVar)dcVars[20], false, "creditCard", null, 0, false);
	subContainer_14.addSubInstruction(sub_40);
		ISubRule sub_41 = new SubRule("req_content", 29, 4, true, (IDCCoreVar)dcVars[19], false, "billingForm", null, 0, false);
	subContainer_14.addSubInstruction(sub_41);
		ISubRule sub_42 = new SubRule("req_content", 12, 4, true, (IDCCoreVar)dcVars[18], false, "paymentForm", null, 0, false);
	subContainer_14.addSubInstruction(sub_42);
	



	}
}
