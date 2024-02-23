<?xml version="1.0" encoding="UTF-8"?>
<editableResource createdTimestamp="1708690169428"
    createdUser="paransha.vyas" id="79570e2f:18dd5c8f14e:-7ac8"
    type="test_suite_resource" updatedTimestamp="1708690303989"
    updatedUser="paransha.vyas" version="1.0">
    <loggingConfiguration debug="false" resultWriterLoggingLevel="FULL" writeStubEventsToDB="true"/>
    <resourceConfig>
        <scenario continueOnFail="true" id="79570e2f:18dd5c8f14e:-7ac7"
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
            <testItem continueOnFail="true"
                id="422e96c8:18db1f4bfc0:-7b7d" lkname="MultiplyTest"
                lkpath="calculator/Multiply/MultiplyTest" type="test_resource"/>
            <testItem continueOnFail="true"
                id="422e96c8:18db1f4bfc0:-7b38" lkname="SubtractTest"
                lkpath="calculator/Subtract/SubtractTest" type="test_resource"/>
        </scenario>
        <publishers>
            <publisher publisher="Paransha"
                report="79570e2f:18dd5c8f14e:-7aa8"
                subject="API Project" what="Live" when="Always"/>
        </publishers>
    </resourceConfig>
</editableResource>
