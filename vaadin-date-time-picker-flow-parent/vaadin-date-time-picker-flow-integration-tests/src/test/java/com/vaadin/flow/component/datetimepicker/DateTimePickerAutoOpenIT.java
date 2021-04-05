package com.vaadin.flow.component.datetimepicker;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.vaadin.flow.component.datetimepicker.testbench.DateTimePickerElement;
import com.vaadin.flow.testutil.TestPath;
import com.vaadin.testbench.TestBenchElement;
import com.vaadin.tests.AbstractComponentIT;

/**
 * Integration tests for the {@link DateTimePickerAutoOpenPage}.
 */
@TestPath("datetimepickerautoopenpage")
public class DateTimePickerAutoOpenIT extends AbstractComponentIT {

    @Test
    public void testSettingAutoOpenOnServerSide() {
        open();
        $(TestBenchElement.class).id("enable-button").click();
        final DateTimePickerElement datePickerElement = $(DateTimePickerElement.class).first();
        assertTrue(datePickerElement.isAutoOpen());
        $(TestBenchElement.class).id("disable-button").click();
        assertFalse(datePickerElement.isAutoOpen());
    }
}
