/**@generated
 * WARNING � Changes you make to this file may be lost.
 *           File is generated and may be re-generated without warning.
 * @RPT-Core-generated Version 8.6
 */
package test;

import com.ibm.rational.test.lt.execution.http.tes.*;
import com.ibm.rational.test.lt.kernel.action.IContainer;
import com.ibm.rational.test.lt.kernel.action.IKThinkControl;
import com.ibm.rational.test.lt.kernel.action.impl.Container;
import com.ibm.rational.test.lt.kernel.action.impl.KThrow;
import com.ibm.rational.test.lt.kernel.action.impl.UserGroup;
import com.ibm.rational.test.lt.kernel.data.FeatureOptionsDataAreaCreation;
import com.ibm.rational.test.lt.kernel.services.*;
import com.ibm.rational.test.lt.kernel.services.RPTEventStructure;
import java.util.HashMap;

@SuppressWarnings("all")
public class VUForpets_Schedule_A1EED2355FB681C0F304B06636356238
		extends com.ibm.rational.test.lt.kernel.action.impl.Schedule {

	public VUForpets_Schedule_A1EED2355FB681C0F304B06636356238(IContainer parent, String name) {
		super(parent, name, "A1EED2355FB681C0F304B06636356238");
		super.actualScheduleName = "VUForpets";
		setThinkMax(10000);
		setThinkScheme(IKThinkControl.RECORDED);

	}

	public void execute() {

		this.addEventBehavior(
				new RPTEventStructure(new HTTPPageTitleVPEvent(), null, 1, "Page title verification failed"));
		this.addEventBehavior(
				new RPTEventStructure(new HTTPResponseCodeVPEvent(), null, 1, "Response code verification failed"));
		this.addEventBehavior(
				new RPTEventStructure(new HTTPResponseSizeVPEvent(), null, 1, "Response size verification failed"));
		this.addEventBehavior(
				new RPTEventStructure(new RPTFailVPEvent(), null, 1, "Content Verification Point failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTConnectEvent(), null, 1, "Connection failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTAuthenticationEvent(), null, 1, "Authentication failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTDataPoolEOFEvent(),
				new RPTStopUserEvent("End of dataset reached"), 1, "End of dataset reached"));
		this.addEventBehavior(
				new RPTEventStructure(new RPTTestVerdictFailedEvent(), null, 2, "Test verdict was set to fail"));
		this.addEventBehavior(new RPTEventStructure(new RPTReferenceEvent(), null, 1, "Failed to extract reference"));
		this.addEventBehavior(new RPTEventStructure(new RPTSubstitutionEvent(), null, 1, "Substitution failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTServerTimeoutEvent(), null, 1, "Timeout"));
		this.addEventBehavior(
				new RPTEventStructure(new RPTDroppedConnectionEvent(), null, 1, "Server dropped connection"));
		this.addEventBehavior(
				new RPTEventStructure(new RPTCustomCodeVPFailureEvent(), null, 1, "Custom Verification Point failed"));
		this.addEventBehavior(new RPTEventStructure(new RPTCustomCodeExceptionEvent(),
				new RPTStopUserEvent("Custom Code reported an unhandled exception"), 1,
				"Custom Code reported an unhandled exception"));

		this.addUserGroup(new UserGroup_1(this));

		this.addUserGroup(new UserGroup_2(this));

		setMaxHealthFailuresToLog(50, -1, 0);
		super.execute();
	}

	public class UserGroup_1 extends UserGroup {

		public UserGroup_1(IContainer parent) {
			super(parent, "Bird", "A1EED2355FBFF7A4F304B06636356238");

			setNumUsers(50.0);

		}

		public IContainer createTesterWorkload(IContainer parent) {
			return scenario_1(parent);
		}

		private Container scenario_1(IContainer parent) {
			Container scenario = new Container(parent, "Default Scenario", "A1EED2355FBFF7AFF304B06636356238") {

				public void reportStopMessage() {
				}

				public void reportForcedStopMessage() {
				}

				public void execute() {
					this.add(new test.BirdsCollection_Test_A1EED235279AF370F304B06636356238(this,
							"A1EED237CC5D87E0F304B06636356238") {
						public void execute() {
							this.setRtbEnabled(false);
							super.execute();
						}
					});

					this.add(new com.ibm.rational.test.lt.execution.protocol.impl.HTTPUserComplete(this));
					super.execute();
				}
			};

			return scenario;
		}

	}

	public class UserGroup_2 extends UserGroup {

		public UserGroup_2(IContainer parent) {
			super(parent, "Reptile", "A1EED237D0C3C834F304B06636356238");

			setNumUsers(50.0);

		}

		public IContainer createTesterWorkload(IContainer parent) {
			return scenario_2(parent);
		}

		private Container scenario_2(IContainer parent) {
			Container scenario = new Container(parent, "Default Scenario", "A1EED237D0C3C83FF304B06636356238") {

				public void reportStopMessage() {
				}

				public void reportForcedStopMessage() {
				}

				public void execute() {
					this.add(new test.ReptilesCollection_Test_A1EED2358F7B5BB0F304B06636356238(this,
							"A1EED237D62FDFC0F304B06636356238") {
						public void execute() {
							this.setRtbEnabled(false);
							super.execute();
						}
					});

					this.add(new com.ibm.rational.test.lt.execution.protocol.impl.HTTPUserComplete(this));
					super.execute();
				}
			};

			return scenario;
		}

	}

}