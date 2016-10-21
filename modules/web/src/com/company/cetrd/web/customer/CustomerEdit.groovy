package com.company.cetrd.web.customer

import com.haulmont.cuba.core.global.TimeSource;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.company.cetrd.entity.Customer;
import com.haulmont.cuba.gui.components.Component;
import com.haulmont.cuba.gui.components.DateField;
import com.haulmont.cuba.gui.components.PickerField

import javax.inject.Inject;
import javax.inject.Named;
import java.util.Date;

public class CustomerEdit extends AbstractEditor<Customer> {


    @Named("fieldGroup.preferredPaymentMethod")
    PickerField preferredPaymentMethodPickerField

    @Named("fieldGroup.orderDate")
    DateField orderDateField

    @Inject
    TimeSource timeSource


    @Override
    protected void postInit() {
        initializeTemporalPickerField(preferredPaymentMethodPickerField)
    }

    protected void initializeTemporalPickerField(PickerField pickerField) {
        activatePickerField(pickerField, (Date) timeSource.currentTimestamp())
    }

    protected void activatePickerField(PickerField pickerField, Date validReferenceDate) {

        PickerField.LookupAction lookupAction = (PickerField.LookupAction) pickerField.getAction("lookup")
        lookupAction.lookupScreenParams = [validReferenceDate: validReferenceDate]
        pickerField.setEnabled(true)
        pickerField.setDescription("")
    }

}