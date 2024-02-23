<?xml version="1.0" encoding="UTF-8"?>
<editableResource createdTimestamp="1708689755519"
    createdUser="paransha.vyas" id="79570e2f:18dd5c8f14e:-7d40"
    type="test_suite_resource" updatedTimestamp="1708689834969"
    updatedUser="paransha.vyas" version="1.0">
    <loggingConfiguration debug="false" resultWriterLoggingLevel="FULL" writeStubEventsToDB="true"/>
    <resourceConfig>
        <scenario continueOnFail="true" id="79570e2f:18dd5c8f14e:-7d3f"
            type="scenario" version="1.0">
            <loggingConfiguration debug="false"
                resultWriterLoggingLevel="FULL" writeStubEventsToDB="false"/>
            <resourceConfig chkenv="false" name="Scenario"
                pacingtime="0.0" pacingtype="MIN_DURATION"
                parallel="false" slowfail="false" usepacing="false">
                <environmentTasks preventExecutionOnFailure="false"/>
            </resourceConfig>
            <testItem continueOnFail="true"
                id="422e96c8:18db1f4bfc0:-7b4f" lkname="AddTest"
                lkpath="calculator/Add/AddTest" type="test_resource"/>
            <testItem continueOnFail="true"
                id="422e96c8:18db1f4bfc0:-7b94" lkname="DivideTest"
                lkpath="calculator/Divide/DivideTest" type="test_resource"/>
        </scenario>
    </resourceConfig>
</editableResource>
