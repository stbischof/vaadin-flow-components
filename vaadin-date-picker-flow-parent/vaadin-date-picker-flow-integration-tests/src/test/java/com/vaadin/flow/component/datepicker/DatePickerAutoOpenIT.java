package com.vaadin.flow.component.datepicker;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.vaadin.flow.component.datepicker.testbench.DatePickerElement;
import com.vaadin.flow.testutil.TestPath;
import com.vaadin.testbench.TestBenchElement;
import com.vaadin.tests.AbstractComponentIT;

/**
 * Integration tests for the {@link DatePickerAutoOpenPage}.
 */
@TestPath("datepickerautoopenpage")
public class DatePickerAutoOpenIT extends AbstractComponentIT {

    @Test
    public void testSettingAutoOpenOnServerSide() {
        open();
        $(TestBenchElement.class).id("enable-button").click();
        final DatePickerElement datePickerElement = $(DatePickerElement.class).first();
        assertTrue(datePickerElement.isAutoOpen());
        $(TestBenchElement.class).id("disable-button").click();
        assertFalse(datePickerElement.isAutoOpen());
    }
}
