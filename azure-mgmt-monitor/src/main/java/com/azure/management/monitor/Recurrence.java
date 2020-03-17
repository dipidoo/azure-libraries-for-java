// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * The Recurrence model.
 */
@Fluent
public final class Recurrence {
    /*
     * the recurrence frequency. How often the schedule profile should take
     * effect. This value must be Week, meaning each week will have the same
     * set of profiles. For example, to set a daily schedule, set **schedule**
     * to every day of the week. The frequency property specifies that the
     * schedule is repeated weekly.
     */
    @JsonProperty(value = "frequency", required = true)
    private RecurrenceFrequency frequency;

    /*
     * the scheduling constraints for when the profile begins.
     */
    @JsonProperty(value = "schedule", required = true)
    private RecurrentSchedule schedule;

    /**
     * Get the frequency property: the recurrence frequency. How often the
     * schedule profile should take effect. This value must be Week, meaning
     * each week will have the same set of profiles. For example, to set a
     * daily schedule, set **schedule** to every day of the week. The frequency
     * property specifies that the schedule is repeated weekly.
     * 
     * @return the frequency value.
     */
    public RecurrenceFrequency frequency() {
        return this.frequency;
    }

    /**
     * Set the frequency property: the recurrence frequency. How often the
     * schedule profile should take effect. This value must be Week, meaning
     * each week will have the same set of profiles. For example, to set a
     * daily schedule, set **schedule** to every day of the week. The frequency
     * property specifies that the schedule is repeated weekly.
     * 
     * @param frequency the frequency value to set.
     * @return the Recurrence object itself.
     */
    public Recurrence withFrequency(RecurrenceFrequency frequency) {
        this.frequency = frequency;
        return this;
    }

    /**
     * Get the schedule property: the scheduling constraints for when the
     * profile begins.
     * 
     * @return the schedule value.
     */
    public RecurrentSchedule schedule() {
        return this.schedule;
    }

    /**
     * Set the schedule property: the scheduling constraints for when the
     * profile begins.
     * 
     * @param schedule the schedule value to set.
     * @return the Recurrence object itself.
     */
    public Recurrence withSchedule(RecurrentSchedule schedule) {
        this.schedule = schedule;
        return this;
    }
}
