// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.management.monitor.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.annotation.JsonFlatten;
import com.azure.management.monitor.Baseline;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;
import java.time.OffsetDateTime;
import java.util.List;

/**
 * The BaselineResponse model.
 */
@JsonFlatten
@Fluent
public class BaselineResponseInner {
    /*
     * the metric baseline Id.
     */
    @JsonProperty(value = "id", access = JsonProperty.Access.WRITE_ONLY)
    private String id;

    /*
     * the resource type of the baseline resource.
     */
    @JsonProperty(value = "type", access = JsonProperty.Access.WRITE_ONLY)
    private String type;

    /*
     * the name and the display name of the metric, i.e. it is localizable
     * string.
     */
    @JsonProperty(value = "name", access = JsonProperty.Access.WRITE_ONLY)
    private LocalizableStringInner name;

    /*
     * The timespan for which the data was retrieved. Its value consists of two
     * datetimes concatenated, separated by '/'.  This may be adjusted in the
     * future and returned back from what was originally requested.
     */
    @JsonProperty(value = "properties.timespan")
    private String timespan;

    /*
     * The interval (window size) for which the metric data was returned in. 
     * This may be adjusted in the future and returned back from what was
     * originally requested.  This is not present if a metadata request was
     * made.
     */
    @JsonProperty(value = "properties.interval")
    private Duration interval;

    /*
     * The aggregation type of the metric.
     */
    @JsonProperty(value = "properties.aggregation")
    private String aggregation;

    /*
     * the array of timestamps of the baselines.
     */
    @JsonProperty(value = "properties.timestamps")
    private List<OffsetDateTime> timestamps;

    /*
     * the baseline values for each sensitivity.
     */
    @JsonProperty(value = "properties.baseline")
    private List<Baseline> baseline;

    /*
     * the baseline metadata values.
     */
    @JsonProperty(value = "properties.metadata")
    private List<BaselineMetadataValueInner> metadata;

    /**
     * Get the id property: the metric baseline Id.
     * 
     * @return the id value.
     */
    public String getId() {
        return this.id;
    }

    /**
     * Get the type property: the resource type of the baseline resource.
     * 
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Get the name property: the name and the display name of the metric, i.e.
     * it is localizable string.
     * 
     * @return the name value.
     */
    public LocalizableStringInner name() {
        return this.name;
    }

    /**
     * Get the timespan property: The timespan for which the data was
     * retrieved. Its value consists of two datetimes concatenated, separated
     * by '/'.  This may be adjusted in the future and returned back from what
     * was originally requested.
     * 
     * @return the timespan value.
     */
    public String timespan() {
        return this.timespan;
    }

    /**
     * Set the timespan property: The timespan for which the data was
     * retrieved. Its value consists of two datetimes concatenated, separated
     * by '/'.  This may be adjusted in the future and returned back from what
     * was originally requested.
     * 
     * @param timespan the timespan value to set.
     * @return the BaselineResponseInner object itself.
     */
    public BaselineResponseInner withTimespan(String timespan) {
        this.timespan = timespan;
        return this;
    }

    /**
     * Get the interval property: The interval (window size) for which the
     * metric data was returned in.  This may be adjusted in the future and
     * returned back from what was originally requested.  This is not present
     * if a metadata request was made.
     * 
     * @return the interval value.
     */
    public Duration interval() {
        return this.interval;
    }

    /**
     * Set the interval property: The interval (window size) for which the
     * metric data was returned in.  This may be adjusted in the future and
     * returned back from what was originally requested.  This is not present
     * if a metadata request was made.
     * 
     * @param interval the interval value to set.
     * @return the BaselineResponseInner object itself.
     */
    public BaselineResponseInner withInterval(Duration interval) {
        this.interval = interval;
        return this;
    }

    /**
     * Get the aggregation property: The aggregation type of the metric.
     * 
     * @return the aggregation value.
     */
    public String aggregation() {
        return this.aggregation;
    }

    /**
     * Set the aggregation property: The aggregation type of the metric.
     * 
     * @param aggregation the aggregation value to set.
     * @return the BaselineResponseInner object itself.
     */
    public BaselineResponseInner withAggregation(String aggregation) {
        this.aggregation = aggregation;
        return this;
    }

    /**
     * Get the timestamps property: the array of timestamps of the baselines.
     * 
     * @return the timestamps value.
     */
    public List<OffsetDateTime> timestamps() {
        return this.timestamps;
    }

    /**
     * Set the timestamps property: the array of timestamps of the baselines.
     * 
     * @param timestamps the timestamps value to set.
     * @return the BaselineResponseInner object itself.
     */
    public BaselineResponseInner withTimestamps(List<OffsetDateTime> timestamps) {
        this.timestamps = timestamps;
        return this;
    }

    /**
     * Get the baseline property: the baseline values for each sensitivity.
     * 
     * @return the baseline value.
     */
    public List<Baseline> baseline() {
        return this.baseline;
    }

    /**
     * Set the baseline property: the baseline values for each sensitivity.
     * 
     * @param baseline the baseline value to set.
     * @return the BaselineResponseInner object itself.
     */
    public BaselineResponseInner withBaseline(List<Baseline> baseline) {
        this.baseline = baseline;
        return this;
    }

    /**
     * Get the metadata property: the baseline metadata values.
     * 
     * @return the metadata value.
     */
    public List<BaselineMetadataValueInner> metadata() {
        return this.metadata;
    }

    /**
     * Set the metadata property: the baseline metadata values.
     * 
     * @param metadata the metadata value to set.
     * @return the BaselineResponseInner object itself.
     */
    public BaselineResponseInner withMetadata(List<BaselineMetadataValueInner> metadata) {
        this.metadata = metadata;
        return this;
    }
}
