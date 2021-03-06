/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.eks.model;

import javax.annotation.Generated;

/**
 * 
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum NodegroupIssueCode {

    AutoScalingGroupNotFound("AutoScalingGroupNotFound"),
    AutoScalingGroupInvalidConfiguration("AutoScalingGroupInvalidConfiguration"),
    Ec2SecurityGroupNotFound("Ec2SecurityGroupNotFound"),
    Ec2SecurityGroupDeletionFailure("Ec2SecurityGroupDeletionFailure"),
    Ec2LaunchTemplateNotFound("Ec2LaunchTemplateNotFound"),
    Ec2LaunchTemplateVersionMismatch("Ec2LaunchTemplateVersionMismatch"),
    Ec2SubnetNotFound("Ec2SubnetNotFound"),
    Ec2SubnetInvalidConfiguration("Ec2SubnetInvalidConfiguration"),
    IamInstanceProfileNotFound("IamInstanceProfileNotFound"),
    IamLimitExceeded("IamLimitExceeded"),
    IamNodeRoleNotFound("IamNodeRoleNotFound"),
    NodeCreationFailure("NodeCreationFailure"),
    AsgInstanceLaunchFailures("AsgInstanceLaunchFailures"),
    InstanceLimitExceeded("InstanceLimitExceeded"),
    InsufficientFreeAddresses("InsufficientFreeAddresses"),
    AccessDenied("AccessDenied"),
    InternalFailure("InternalFailure"),
    ClusterUnreachable("ClusterUnreachable");

    private String value;

    private NodegroupIssueCode(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return NodegroupIssueCode corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static NodegroupIssueCode fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (NodegroupIssueCode enumEntry : NodegroupIssueCode.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
